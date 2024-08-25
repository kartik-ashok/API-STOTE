package com.shoppingapp.online_shoping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shoppingapp.online_shoping.model.Customer;
import com.shoppingapp.online_shoping.repository.CustomerRepository;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerService;
    public Customer createCustomer(Customer customer){
        return customerService.save(customer);
    }

    public List<Customer> getAllCustomer(){
        System.out.println("Step I am  invoked by  controller");
        return customerService.findAll();
    }

}
