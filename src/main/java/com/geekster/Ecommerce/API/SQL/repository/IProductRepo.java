package com.geekster.Ecommerce.API.SQL.repository;

import com.geekster.Ecommerce.API.SQL.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductRepo extends CrudRepository<Product,Integer> {
}
