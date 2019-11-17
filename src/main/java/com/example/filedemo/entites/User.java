//package com.example.filedemo.entites;
//
//
//import javax.persistence.*;
//import java.util.Collection;
//
//@Entity
//@Table(name = "users")
//public class User {
//
//    @Id
//    @GeneratedValue
//    private Integer id;
//
//    @Column
//    private String username;
//
//    @Column
//    private String password;
//
//    @ManyToMany
//    @JoinTable(name = "user_role",
//            joinColumns = @JoinColumn(name = "user_id"),
//            inverseJoinColumns = @JoinColumn(name = "role_id"))
//    private Collection<Role> roles;
//
//    @OneToOne
//    @JoinTable(name = "user_customerGroup",
//            joinColumns = @JoinColumn(name = "user_id"),
//            inverseJoinColumns = @JoinColumn(name = "customerGroup_id"))
//    private CustomerGroup customerGroup;
//
//    @OneToMany(mappedBy = "user")
//    private Collection<Order> order;
//
//
//    public Collection<Order> getOrder() {
//        return order;
//    }
//
//    public void setOrder(Collection<Order> order) {
//        this.order = order;
//    }
//
//    public CustomerGroup getCustomerGroup() {
//        return customerGroup;
//    }
//
//    public void setCustomerGroup(CustomerGroup customerGroup) {
//        this.customerGroup = customerGroup;
//    }
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public Collection<Role> getRoles() {
//        return roles;
//    }
//
//    public void setRoles(Collection<Role> roles) {
//        this.roles = roles;
//    }
//}
//
//
//
//
//
//
//
//
