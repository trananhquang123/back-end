//package com.example.filedemo.entites;
//
//import javax.persistence.*;
//import java.util.Collection;
//
//@Entity
//@Table
//public class OrderDetails {
//
//    @Id
//    @GeneratedValue
//    private Integer id;
//
//    @OneToOne(mappedBy = "orderDetails")
//    private Order order;
//
////    @OneToMany(mappedBy = "orderDetails")
////    private Collection<Product> product;
//
//    @Column
//    private int amount;
//
//    @Column
//    private int price;
//
//    @Column
//    private int total;
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public Order getOrder() {
//        return order;
//    }
//
//    public void setOrder(Order order) {
//        this.order = order;
//    }
//
////    public Collection<Product> getProduct() {
////        return product;
////    }
////
////    public void setProduct(Collection<Product> product) {
////        this.product = product;
////    }
//
//    public int getAmount() {
//        return amount;
//    }
//
//    public void setAmount(int amount) {
//        this.amount = amount;
//    }
//
//    public int getPrice() {
//        return price;
//    }
//
//    public void setPrice(int price) {
//        this.price = price;
//    }
//
//    public int getTotal() {
//        return total;
//    }
//
//    public void setTotal(int total) {
//        this.total = total;
//    }
//}
