package com.tw.twMall.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MallController {

    @GetMapping("/hello")
    public String helloMassge() {
        return "hello you!";
    }

    //    public List<Product> getAllProducts() {
//        return null;
//    }
}
