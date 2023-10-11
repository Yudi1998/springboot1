package com.yudicode2.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yudicode2.models.Products;

@RestController
@RequestMapping("/api/products")
public class WebController {

    @Value("${app.name:default yudicode2 app}")
    private String appName;
    
    @GetMapping("/get")
    public Products getproducts(){
    Products products = new Products(1,"buku",100000,20);
    return products;
    }
    @RequestMapping("/")
    public String welcome(){
    return "index";
    }
    @RequestMapping("/about")
    public String about(){
    return "about";
    }
}
