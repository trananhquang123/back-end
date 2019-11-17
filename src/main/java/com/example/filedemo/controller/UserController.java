//package com.example.filedemo.controller;
//
//import com.example.filedemo.entites.User;
//import com.example.filedemo.payload.UploadFileResponse;
//import com.example.filedemo.repository.UserRepository;
//import com.example.filedemo.specifications.UserSpecificationsBuilder;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.jpa.domain.Specification;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.multipart.MultipartFile;
//import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
//
//import javax.validation.Valid;
//import java.util.List;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//@Controller
//public class UserController {
//
//    @Autowired
//    private UserRepository repo;
//
//    @RequestMapping(method = RequestMethod.GET, value = "/users")
//    @ResponseBody
//    public List<User> search(@RequestParam(value = "search") String search) {
//        UserSpecificationsBuilder builder = new UserSpecificationsBuilder();
//        Pattern pattern = Pattern.compile("(\\w+?)(:|<|>)(\\w+?),");
//        Matcher matcher = pattern.matcher(search + ",");
//        while (matcher.find()) {
//            builder.with(matcher.group(1), matcher.group(2), matcher.group(3));
//        }
//
//        Specification<User> spec = builder.build();
//        return repo.findAll(spec);
//    }
//
//
//    @PostMapping("/users1")
//    public User createEmployee(@Valid @RequestBody User emp) {
//        return repo.save(emp);
//    }
//
//}
