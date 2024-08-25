package com.shoppingapp.online_shoping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shoppingapp.online_shoping.model.Customer;


public interface CustomerRepository extends JpaRepository<Customer,Integer> {

    
}

