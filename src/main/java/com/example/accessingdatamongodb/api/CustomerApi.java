package com.example.accessingdatamongodb.api;

import com.example.accessingdatamongodb.model.Customer;
import com.example.accessingdatamongodb.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = {"http://localhost:8081", "http://localhost:9876"})

public class CustomerApi {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/customers")
    public List<Customer> getUsers(){
        return customerService.getAllCustomers();
    }

    @GetMapping("/customers/customer-details/{id}")
    public Optional<Customer> getSingleUser(@PathVariable String id) {
        return customerService.getSingleCustomer(id);
    }


    @PostMapping("/customers/update-customer/")
    public void updateUser(@RequestBody Customer customer){
        customerService.updateCustomer(customer);
    }

    @PostMapping("/customers/set-customer/")
    public Customer createUser(@RequestBody Customer customer){
        customerService.createCustomer(customer);
        System.out.println(customer);
        return customer;
    }

    @DeleteMapping ("/customers/delete-customer/{id}")
    public void deleteUser(@PathVariable String id){
        customerService.deleteCustomer(id);
    }



}
