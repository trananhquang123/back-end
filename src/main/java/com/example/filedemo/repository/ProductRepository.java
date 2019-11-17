package com.example.filedemo.repository;

import com.example.filedemo.entites.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
    Product findByName(String name);
    Product findById(int id);

}
