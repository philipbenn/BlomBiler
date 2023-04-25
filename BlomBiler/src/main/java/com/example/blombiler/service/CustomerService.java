package com.example.blombiler.service;

import com.example.blombiler.model.Customer;
import com.example.blombiler.repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    CustomerRepo customerRepo;

    public void addCustomerAccount(Customer customer){
        customerRepo.addCustomerAccount(customer);
    }
}
