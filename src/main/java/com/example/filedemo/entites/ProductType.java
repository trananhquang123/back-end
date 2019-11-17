package com.example.filedemo.entites;


import javax.persistence.*;
import java.util.Collection;

@Entity
@Table
public class ProductType {

    @Id
    @GeneratedValue
    private Integer id;

    @Column
    private String name;

    @OneToMany(mappedBy = "productTypes")
    private Collection<Product> products;

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

    public Collection<Product> getProducts() {
        return products;
    }

    public void setProducts(Collection<Product> products) {
        this.products = products;
    }
}
