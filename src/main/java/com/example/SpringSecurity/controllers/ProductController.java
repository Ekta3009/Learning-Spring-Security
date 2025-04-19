package com.example.SpringSecurity.controllers;

import com.example.SpringSecurity.models.Product;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {

    List<Product> products = new ArrayList<>(List.of(new Product(1,"Pens",10),
            new Product(2, "Boxes", 50)));


    @GetMapping("/products")
    public List<Product> getProducts(){
        return products;
    }

    @GetMapping("/csrf")
    public CsrfToken getCsrfToken(HttpServletRequest request){
        return (CsrfToken) request.getAttribute("_csrf");
    }

    @PostMapping("/products")
    public Product addProduct(@RequestBody Product product){
        products.add(product);
        return product;
    }
}
