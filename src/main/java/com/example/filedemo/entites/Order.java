//package com.example.filedemo.entites;
//
//import javax.persistence.*;
//import  java.util.Date;
//
//@Entity
//@Table
//public class Order {
//
//    @Id
//    @GeneratedValue
//    private Integer id;
//
//    @ManyToOne
//    @JoinTable(name = "order_user",
//            joinColumns = @JoinColumn(name = "order_id"),
//            inverseJoinColumns = @JoinColumn(name = "user_id"))
//    private User user;
//
//    @OneToOne
//    @JoinTable(name = "order_orderDetails",
//            joinColumns = @JoinColumn(name = "order_id"),
//            inverseJoinColumns = @JoinColumn(name = "orderDetails_id"))
//    private OrderDetails orderDetails;
//
//    @Column
//    private Date orderDate;
//
//    @Column
//    private String orderName;
//
//    @Column
//    private String sdt;
//
//    @Column
//    private String provinceDistrict;
//
//    @Column
//    private String deliveryAddress;
//
//    @Column
//    private String orderConfirmation;
//
//    @Column
//    private String paymentConfirmation;
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }
//
//    public OrderDetails getOrderDetails() {
//        return orderDetails;
//    }
//
//    public void setOrderDetails(OrderDetails orderDetails) {
//        this.orderDetails = orderDetails;
//    }
//
//    public Date getOrderDate() {
//        return orderDate;
//    }
//
//    public void setOrderDate(Date orderDate) {
//        this.orderDate = orderDate;
//    }
//
//    public String getOrderName() {
//        return orderName;
//    }
//
//    public void setOrderName(String orderName) {
//        this.orderName = orderName;
//    }
//
//    public String getSdt() {
//        return sdt;
//    }
//
//    public void setSdt(String sdt) {
//        this.sdt = sdt;
//    }
//
//    public String getProvinceDistrict() {
//        return provinceDistrict;
//    }
//
//    public void setProvinceDistrict(String provinceDistrict) {
//        this.provinceDistrict = provinceDistrict;
//    }
//
//    public String getDeliveryAddress() {
//        return deliveryAddress;
//    }
//
//    public void setDeliveryAddress(String deliveryAddress) {
//        this.deliveryAddress = deliveryAddress;
//    }
//
//    public String getOrderConfirmation() {
//        return orderConfirmation;
//    }
//
//    public void setOrderConfirmation(String orderConfirmation) {
//        this.orderConfirmation = orderConfirmation;
//    }
//
//    public String getPaymentConfirmation() {
//        return paymentConfirmation;
//    }
//
//    public void setPaymentConfirmation(String paymentConfirmation) {
//        this.paymentConfirmation = paymentConfirmation;
//    }
//}
