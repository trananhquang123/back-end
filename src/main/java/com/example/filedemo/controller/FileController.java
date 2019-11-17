package com.example.filedemo.controller;

import com.example.filedemo.dto.dtoHome;
import com.example.filedemo.dto.dtoProduct;
import com.example.filedemo.dto.dtoProductType;
import com.example.filedemo.entites.Product;
import com.example.filedemo.entites.ProductPrice;
import com.example.filedemo.entites.ProductType;
import com.example.filedemo.repository.PriceProductRepository;
import com.example.filedemo.repository.ProductRepository;
import com.example.filedemo.repository.TypeProductRepository;
import com.example.filedemo.service.FileStorageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.core.io.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.example.filedemo.dto.dtoProduct;
import com.example.filedemo.dto.dtoProductType;
import com.example.filedemo.entites.Product;
import com.example.filedemo.entites.ProductPrice;
import com.example.filedemo.entites.ProductType;
import com.example.filedemo.repository.PriceProductRepository;
import com.example.filedemo.repository.ProductRepository;
import com.example.filedemo.repository.TypeProductRepository;
import com.example.filedemo.service.FileStorageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequestMapping("/api/product")
@CrossOrigin(origins = "*")
public class FileController  extends BaseResource<Product>{

    private static final Logger logger = LoggerFactory.getLogger(FileController.class);

    @Autowired
    private FileStorageService fileStorageService;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private TypeProductRepository typeProductRepository;

    @Autowired
    private PriceProductRepository priceProductRepository;

    @PostMapping()
    public ResponseEntity<?> post(@RequestParam("description")  String description ,
                                  @RequestParam("image") MultipartFile image ,
                                  @RequestParam("name") String name,
                                  @RequestParam("productType") String productType,
                                  @RequestParam("price") int price
                                    ) {
        String fileName = fileStorageService.storeFile(image);

        String fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath()
                .path("/api/product/downloadFile/")
                .path(fileName)
                .toUriString();
        Product checkEmpty =  productRepository.findByName( name );
        if(checkEmpty != null){
            return responseSuccess("Product already exit");
        }
        Product product = new Product();
        product.setDescription( description );
        product.setImage( fileDownloadUri );
        product.setName( name );

        ProductType productType1 = typeProductRepository.findByName( productType );
        ProductPrice productPrice = priceProductRepository.findByName( name );
        if (productType1 != null && productPrice != null) {


                product.setProductTypes( productType1 );

                ProductPrice productPrice1 = new ProductPrice();
                productPrice1.setActive( 2 );
                productPrice1.setDateofapplication( new Date(  ) );
                productPrice1.setName( name );
                productPrice1.setPrice( price );
                product.setProductPrice( productPrice );
                Product productResponse = productRepository.save( product );
                return responseSuccess(productResponse,"Post product sucsses");

            }else if(productType1 == null && productPrice != null){
            product.setProductPrice( productPrice );
            ProductType productType2 = new ProductType();
            productType2.setName( productType );

            ProductType productType3 =  typeProductRepository.save( productType2 );

            product.setProductTypes( productType3 );
            Product productResponse = productRepository.save( product );
            return responseSuccess(productResponse,"Post product sucsses");
        }else if(productPrice == null && productType1 != null) {
            product.setProductTypes( productType1 );
            ProductPrice productPrice1 = new ProductPrice();
            productPrice1.setPrice( price );
            productPrice1.setName( name );
            productPrice1.setActive( 2 );
            productPrice1.setDateofapplication( new Date(  ) );
            ProductPrice productPrice2 = priceProductRepository.save( productPrice1 );
            product.setProductPrice( productPrice2 );

            Product productResponse = productRepository.save( product );
            return responseSuccess(productResponse,"Post product sucsses");
        }else if(productType1 == null && productPrice == null){
            ProductType productType2 = new ProductType();
            productType2.setName( productType );

            ProductType productType3 =  typeProductRepository.save( productType2 );

            product.setProductTypes( productType3 );


            ProductPrice productPrice1 = new ProductPrice();
            productPrice1.setPrice( price );
            productPrice1.setName( name );
            productPrice1.setActive( 2 );
            productPrice1.setDateofapplication( new Date(  ) );

            ProductPrice productPrice2 = priceProductRepository.save( productPrice1 );
            product.setProductPrice( productPrice2 );

            Product productResponse = productRepository.save( product );
            return responseSuccess(productResponse,"Post product sucsses");
        }
        else{
            return responseError("product already exist", HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/{id}")
    @ResponseBody
    public ResponseEntity<?> get(@PathVariable(value = "id") int id){

        Product product = productRepository.findById( id );
        dtoProduct dtoProduct = new dtoProduct(product.getId(),
                product.getName(),
                product.getProductTypes().getName(),
                product.getProductPrice().getPrice(),
                product.getDescription(),
                product.getImage());
        return responseSuccess(dtoProduct,"success");


    }

    @GetMapping()
    @ResponseBody
    public dtoHome getAll(){
        List<Product> productAll = productRepository.findAll();
        List<dtoProduct> dtoProductList = new ArrayList<dtoProduct>(  ) ;
        List<dtoProductType> dtoProductTypeList = new ArrayList<dtoProductType>(  ) ;
        List<ProductType> productTypes = typeProductRepository.findAll();

        for (ProductType productType : productTypes) {
            dtoProductType dtoProductype = new dtoProductType(productType.getId(),productType.getName());
            dtoProductTypeList.add( dtoProductype );
        }

        for (Product product : productAll) {
            dtoProduct dtoProduct = new dtoProduct(product.getId(),
                    product.getName(),
                    product.getProductTypes().getName(),
                    product.getProductPrice().getPrice(),
                    product.getDescription(),
                    product.getImage());
            dtoProductList.add( dtoProduct );
        }

        return  new dtoHome(dtoProductList,dtoProductTypeList) ;
    }





   @DeleteMapping("/{id}")
    public  ResponseEntity<?> delete(@PathVariable(value = "id") int id){
        Product product = productRepository.findById( id );
               if (product == null) {
            return responseError("product already exist", HttpStatus.BAD_REQUEST);
        } else {
                   productRepository.delete( product );  ;
            return responseSuccess("Delete success");
        }

    }
    
//    @PostMapping("/uploadMultipleFiles")
//    public List<UploadFileResponse> uploadMultipleFiles(@RequestParam("files") MultipartFile[] files) {
//        return Arrays.asList(files)
//                .stream()
//                .map(file -> uploadFile(file))
//                .collect(Collectors.toList());
//    }

    @GetMapping("/downloadFile/{fileName:.+}")
    public ResponseEntity<Resource> downloadFile(@PathVariable String fileName, HttpServletRequest request) {
        // Load file as Resource
        Resource resource = fileStorageService.loadFileAsResource(fileName);

        // Try to determine file's content type
        String contentType = null;
        try {
            contentType = request.getServletContext().getMimeType(resource.getFile().getAbsolutePath());
        } catch (IOException ex) {
            logger.info("Could not determine file type.");
        }

        // Fallback to the default content type if type could not be determined
        if(contentType == null) {
            contentType = "application/octet-stream";
        }

        return ResponseEntity.ok()
                .contentType(MediaType.parseMediaType(contentType))
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + resource.getFilename() + "\"")
                .body(resource);
    }

}
