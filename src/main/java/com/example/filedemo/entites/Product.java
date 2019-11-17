package com.example.filedemo.entites;

import javax.persistence.*;
import java.util.Collection;


@Entity
@Table
public class Product {

    @Id
    @GeneratedValue
    private Integer id;

    @Column
    private String name;


    @ManyToOne
    @JoinTable(name = "product_productType",
            joinColumns = @JoinColumn(name = "product_id"),
            inverseJoinColumns = @JoinColumn(name = "productType_id"))
    private ProductType productTypes;


    @ManyToOne
    @JoinTable(name = "product_productPrice",
            joinColumns = @JoinColumn(name = "product_id"),
            inverseJoinColumns = @JoinColumn(name = "productPrice_id"))
    private ProductPrice productPrice;


//    @OneToOne
//    @JoinTable(name = "product_productDetail",
//            joinColumns = @JoinColumn(name = "product_id"),
//            inverseJoinColumns = @JoinColumn(name = "productDetail_id"))
//    private ProductDetail productDetail;

//    @ManyToMany
//    @JoinTable(name = "product_orderDetails",
//            joinColumns = @JoinColumn(name = "product_id"),
//            inverseJoinColumns = @JoinColumn(name = "orderDetails_id"))
//    private  Collection<OrderDetails>  orderDetails;

//    public ProductDetail getProductDetail() {
//        return productDetail;
//    }
//
//    public void setProductDetail(ProductDetail productDetail) {
//        this.productDetail = productDetail;
//    }

//    public Collection<OrderDetails> getOrderDetails() {
//        return orderDetails;
//    }
//
//    public void setOrderDetails(Collection<OrderDetails> orderDetails) {
//        this.orderDetails = orderDetails;
//    }

    @Column
    private String description;

    @Column
    private String image;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public ProductType getProductTypes() {
        return productTypes;
    }

    public void setProductTypes(ProductType productTypes) {
        this.productTypes = productTypes;
    }

    public ProductPrice getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(ProductPrice productPrice) {
        this.productPrice = productPrice;
    }
}
