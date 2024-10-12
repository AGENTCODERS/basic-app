package com.agentgroups.basicapp.service;

import com.agentgroups.basicapp.entities.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products= Arrays.asList(new Product(101,"iphone",50000),new Product(102,"ipad",30999),new Product(104,"asus rog phone 3",42999));

    public List<Product> getProducts(){
        return products;
    }

}
