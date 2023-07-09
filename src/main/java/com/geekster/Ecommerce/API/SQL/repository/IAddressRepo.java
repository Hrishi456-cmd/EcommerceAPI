package com.geekster.Ecommerce.API.SQL.repository;

import com.geekster.Ecommerce.API.SQL.model.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAddressRepo extends CrudRepository<Address,Integer> {
}
