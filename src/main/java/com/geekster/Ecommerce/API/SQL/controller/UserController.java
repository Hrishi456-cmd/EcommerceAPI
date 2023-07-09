package com.geekster.Ecommerce.API.SQL.controller;

import com.geekster.Ecommerce.API.SQL.model.Product;
import com.geekster.Ecommerce.API.SQL.model.User;
import com.geekster.Ecommerce.API.SQL.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("user")
    public void addUser(@RequestBody User user)
    {
        userService.addProduct(user);
    }
}
