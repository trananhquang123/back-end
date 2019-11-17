//package com.example.filedemo.entites;
//
//import javax.persistence.*;
//import java.util.Collection;
//
//@Entity
//@Table
//public class Role {
//    @Id
//    @GeneratedValue
//    private Integer id;
//
//    @Column
//    private String name;
//
//    @Column
//    private String descript;
//
//    @ManyToMany(mappedBy = "roles")
//    private Collection<User> users;
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
//    public String getDescript() {
//        return descript;
//    }
//
//    public void setDescript(String descript) {
//        this.descript = descript;
//    }
//
//    public Collection<User> getUsers() {
//        return users;
//    }
//
//    public void setUsers(Collection<User> users) {
//        this.users = users;
//    }
//}
