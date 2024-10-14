package com.agentgroups.basicapp.controller;
import com.agentgroups.basicapp.entities.Product;
import com.agentgroups.basicapp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import java.util.List;

@RestController
@CrossOrigin
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/products")
    public List<Product> getProducts() {
        return productService.getProducts();
    }

    @GetMapping("/getproduct/{prodId}")
    public Product getProductById(@PathVariable int prodId) {
        return productService.getProductById(prodId);
    }

    @PostMapping("/addproduct")
    public void addProduct(@Valid @RequestBody Product prod) {  // Updated method
        productService.addProduct(prod);
    }

    @PutMapping("/updateproduct")
    public void updateProduct(@RequestBody Product prod){
        productService.updateProduct(prod);
    }

    @DeleteMapping("/deleteproduct/{prodId}")
    public void deleteProduct(@PathVariable int prodId){
        productService.deleteProduct(prodId);
    }
}




//package com.agentgroups.basicapp.controller;
//
//import com.agentgroups.basicapp.entities.Product;
//import com.agentgroups.basicapp.service.ProductService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//public class ProductController {
//
//    @Autowired
//    ProductService productService;
//
//    @GetMapping("/products")
//    public List<Product> getProducts(){
//        return productService.getProducts();
//    }
//
//    @GetMapping("/getproduct/{prodId}")
//    public Product getProductById(@PathVariable int prodId){
//        return productService.getProductById(prodId);
//    }
//
//    @PostMapping("/addproduct")
//    public void addProduct(Product prod){
//        productService.addProduct(prod);
//    }
//}
