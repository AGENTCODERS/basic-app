package com.agentgroups.basicapp.controller;

import com.agentgroups.basicapp.entities.Product;
import com.agentgroups.basicapp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @RequestMapping("/products")
    public List<Product> getProducts(){
        return productService.getProducts();
    }
}
