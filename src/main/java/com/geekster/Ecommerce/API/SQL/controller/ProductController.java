package com.geekster.Ecommerce.API.SQL.controller;

import com.geekster.Ecommerce.API.SQL.model.Order;
import com.geekster.Ecommerce.API.SQL.model.Product;
import com.geekster.Ecommerce.API.SQL.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;

    @PostMapping("product")
    public void addProduct(@RequestBody Product product)
    {
        productService.addProduct(product);
    }
}
