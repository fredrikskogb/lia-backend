package com.example.accessingdatamongodb.services;

import com.example.accessingdatamongodb.model.Customer;
import com.example.accessingdatamongodb.model.Order;
import com.example.accessingdatamongodb.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service

public class CustomerService {

    @Autowired
    private CustomerRepository repository;

    private MongoTemplate mongoTemplate;
    @Autowired
    public CustomerService(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    public List<Customer> getAllCustomers(){
        return repository.findAll();
    }

    public Optional<Customer> getSingleCustomer(String id) {
        return repository.findById(id);
    }

    public void updateCustomer(Customer customer){

        Optional<Customer> selectedCustomerOptional = repository.findById(customer.getId());

        selectedCustomerOptional.ifPresent((selectedCustomer) -> {

            selectedCustomer.setFirstName(customer.getFirstName());
            selectedCustomer.setLastName(customer.getLastName());
            selectedCustomer.setBirthDate(customer.getBirthDate());
            selectedCustomer.setEmail(customer.getEmail());
            selectedCustomer.setCustomerCreated(customer.getCustomerCreated());
            repository.save(selectedCustomer);

        });

    }

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    protected LocalDate customerCreated = LocalDate.now();


    public void createCustomer(Customer customer){
        customer.setCustomerCreated(customerCreated);

        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(10);
        String encodedPassword = encoder.encode(customer.getPassword());
        customer.setPassword(encodedPassword);

        repository.save(customer);

    }

    public void deleteCustomer(String id){
        Optional<Customer> selectedCustomer = repository.findById(id);
        if(selectedCustomer.isPresent()){
            repository.delete(selectedCustomer.get());
        }
    }

    public boolean loginUser(String email, String password) {

        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        // load db pass
        Customer customer = repository.findByEmail(email);
        String dbPassword = customer.getPassword();
        String dbEmail = customer.getEmail();

        if (passwordEncoder.matches(password, dbPassword) && email == dbEmail) {
            return true;
        } else {
            return false;
        }

    }

}

