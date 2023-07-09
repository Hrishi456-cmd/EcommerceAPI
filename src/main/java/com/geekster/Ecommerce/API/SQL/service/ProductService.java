package com.geekster.Ecommerce.API.SQL.service;

import com.geekster.Ecommerce.API.SQL.model.Product;
import com.geekster.Ecommerce.API.SQL.repository.IProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    IProductRepo iProductRepo;

    public void addProduct(Product product) {
        iProductRepo.save(product);
    }
}
