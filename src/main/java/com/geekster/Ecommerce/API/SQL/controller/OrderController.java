package com.geekster.Ecommerce.API.SQL.controller;

import com.geekster.Ecommerce.API.SQL.model.Address;
import com.geekster.Ecommerce.API.SQL.model.Order;
import com.geekster.Ecommerce.API.SQL.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    @Autowired
    OrderService orderService;

    @PostMapping("order")
    public void addOrder(@RequestBody Order order)
    {
        orderService.addOrder(order);
    }
}
