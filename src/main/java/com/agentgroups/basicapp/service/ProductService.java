package com.agentgroups.basicapp.service;

import com.agentgroups.basicapp.entities.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products= new ArrayList<>(Arrays.asList(new Product(101,"iphone",50000),new Product(102,"ipad",30999),new Product(104,"asus rog phone 3",42999)));

    public List<Product> getProducts(){
        return products;
    }


    public Product getProductById(int prodId){
        return products.stream().filter(product -> product.getProdId()== prodId)
                .findFirst().orElse(new Product(prodId,"no items found",00));
    }

    public void addProduct(Product prod){
        products.add(prod);
    }

    public void updateProduct(Product prod){
        int index=0;
        for(int i=0;i<products.size();i++){

            if(products.get(i).getProdId()==prod.getProdId()){
                index=i;
            }
        }
        products.set(index,prod);

    }



}
