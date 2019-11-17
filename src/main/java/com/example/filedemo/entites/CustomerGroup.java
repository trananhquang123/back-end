//package com.example.filedemo.entites;
//
//import javax.persistence.*;
//import java.util.Collection;
//
//@Entity
//@Table
//public class CustomerGroup {
//
//    @Id
//    @GeneratedValue
//    private Integer id;
//
//    @Column
//    private String name;
//
//    @OneToMany(mappedBy = "customerGroup")
//    private Collection<User> user;
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Collection<User> getUser() {
//        return user;
//    }
//
//    public void setUser(Collection<User> user) {
//        this.user = user;
//    }
//}
