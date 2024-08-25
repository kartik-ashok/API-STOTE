package com.shoppingapp.online_shoping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shoppingapp.online_shoping.model.Customer;
import com.shoppingapp.online_shoping.service.CustomerService;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    CustomerService customerService;

     @PostMapping
    public Customer createUser(@RequestBody Customer customer) {
        System.out.println("I am  called...");
        return customerService.createCustomer(customer);
    }



@GetMapping
    public ResponseEntity<List<Customer>> getCustomers() {
        System.out.println("I am GetMapping called...");
        List<Customer> customers = customerService.getAllCustomer();

        if (customers.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

        for (Customer customer : customers) {
            if (customer.getCustomer_id() <0) {
                System.out.println("Entered an incorrect value");
                throw new IllegalArgumentException("Customer ID does not match the required value");
            } else {
                System.out.println("Please enter a number");
            }

            System.out.println(customer.getCustomer_id());
            System.out.println(customer.getEmail());
            System.out.println(customer.getAddress());
            System.out.println(customer.getWishlist());
        }

        System.out.println(customers);
        return new ResponseEntity<>(customers, HttpStatus.OK);
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<String> handleIllegalArgumentException(IllegalArgumentException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
    }
}
