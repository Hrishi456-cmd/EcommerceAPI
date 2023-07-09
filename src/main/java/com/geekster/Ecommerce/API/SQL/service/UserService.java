package com.geekster.Ecommerce.API.SQL.service;

import com.geekster.Ecommerce.API.SQL.model.User;
import com.geekster.Ecommerce.API.SQL.repository.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    IUserRepo iUserRepo;

    public void addProduct(User user) {
        iUserRepo.save(user);
    }
}

