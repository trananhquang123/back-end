package com.example.filedemo.entites;

import sun.util.calendar.BaseCalendar;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

@Entity
@Table
public class ProductPrice {

    @Id
    @GeneratedValue
    private Integer id;

    @Column
    private String name;

    @OneToMany(mappedBy = "productPrice")
    private Collection<Product> products;

    @Column
    private int price;

    @Column
    private Date dateofapplication;

    @Column
    private int active;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

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

    public Date getDateofapplication() {
        return dateofapplication;
    }

    public void setDateofapplication(Date dateofapplication) {
        this.dateofapplication = dateofapplication;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public Collection<Product> getProducts() {
        return products;
    }

    public void setProducts(Collection<Product> products) {
        this.products = products;
    }
}
