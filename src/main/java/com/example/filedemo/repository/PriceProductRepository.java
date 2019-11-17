package com.example.filedemo.repository;

import com.example.filedemo.entites.ProductPrice;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.validation.constraints.Max;
import java.util.List;

public interface PriceProductRepository extends JpaRepository<ProductPrice,Long> {
    ProductPrice findByNameAndActive(String name ,int active);

    ProductPrice findByName(String name);
}
