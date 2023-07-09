package com.geekster.Ecommerce.API.SQL.repository;

import com.geekster.Ecommerce.API.SQL.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepo extends CrudRepository<User,Integer> {
}
