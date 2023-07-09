package com.geekster.Ecommerce.API.SQL.service;

import com.geekster.Ecommerce.API.SQL.model.Address;
import com.geekster.Ecommerce.API.SQL.repository.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
    @Autowired
    IAddressRepo iAddressRepo;

    public void addAddress(Address address) {
        iAddressRepo.save(address);
    }
}
