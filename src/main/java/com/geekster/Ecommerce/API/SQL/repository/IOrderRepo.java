package com.geekster.Ecommerce.API.SQL.repository;

import com.geekster.Ecommerce.API.SQL.model.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOrderRepo extends CrudRepository<Order,Integer> {
}
