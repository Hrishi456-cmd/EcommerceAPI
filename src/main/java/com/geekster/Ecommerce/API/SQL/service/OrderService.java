package com.geekster.Ecommerce.API.SQL.service;

import com.geekster.Ecommerce.API.SQL.model.Order;
import com.geekster.Ecommerce.API.SQL.repository.IOrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    IOrderRepo iOrderRepo;

    public void addOrder(Order order) {
        iOrderRepo.save(order);
    }
}
