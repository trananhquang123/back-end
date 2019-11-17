//package com.example.filedemo.entites;
//
//import javax.persistence.*;
//import java.util.Collection;
//
//@Entity
//@Table
//public class ProductDetail {
//
//    @Id
//    @GeneratedValue
//    private Integer id;
//
//
//    @OneToOne(mappedBy = "productDetail")
//    private Product product;
//
//    @Column
//    private String simBand;
//
//    @Column
//    private String screen;
//
//    @Column
//    private String cpu;
//
//    @Column
//    private String chipGraphics;
//
//    @Column
//    private String  internalMemory;
//
//    @Column
//    private String ram;
//
//    @Column
//    private String pin;
//
//    @Column
//    private String frontCamera;
//
//    @Column
//    private String rearCamera;
//
//    @Column
//    private String memoryStick;
//
//    @Column
//    private String color;
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public Product getProduct() {
//        return product;
//    }
//
//    public void setProduct(Product product) {
//        this.product = product;
//    }
//
//    public String getSimBand() {
//        return simBand;
//    }
//
//    public void setSimBand(String simBand) {
//        this.simBand = simBand;
//    }
//
//    public String getScreen() {
//        return screen;
//    }
//
//    public void setScreen(String screen) {
//        this.screen = screen;
//    }
//
//    public String getCpu() {
//        return cpu;
//    }
//
//    public void setCpu(String cpu) {
//        this.cpu = cpu;
//    }
//
//    public String getChipGraphics() {
//        return chipGraphics;
//    }
//
//    public void setChipGraphics(String chipGraphics) {
//        this.chipGraphics = chipGraphics;
//    }
//
//    public String getInternalMemory() {
//        return internalMemory;
//    }
//
//    public void setInternalMemory(String internalMemory) {
//        this.internalMemory = internalMemory;
//    }
//
//    public String getRam() {
//        return ram;
//    }
//
//    public void setRam(String ram) {
//        this.ram = ram;
//    }
//
//    public String getPin() {
//        return pin;
//    }
//
//    public void setPin(String pin) {
//        this.pin = pin;
//    }
//
//    public String getFrontCamera() {
//        return frontCamera;
//    }
//
//    public void setFrontCamera(String frontCamera) {
//        this.frontCamera = frontCamera;
//    }
//
//    public String getRearCamera() {
//        return rearCamera;
//    }
//
//    public void setRearCamera(String rearCamera) {
//        this.rearCamera = rearCamera;
//    }
//
//    public String getMemoryStick() {
//        return memoryStick;
//    }
//
//    public void setMemoryStick(String memoryStick) {
//        this.memoryStick = memoryStick;
//    }
//
//    public String getColor() {
//        return color;
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//    }
//}
