package com.example.filedemo.repository;

import com.example.filedemo.entites.ProductType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TypeProductRepository extends JpaRepository<ProductType,Long> {
    ProductType findByName(String name);
}
