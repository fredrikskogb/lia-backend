package com.example.accessingdatamongodb.repository;

import java.util.List;

import com.example.accessingdatamongodb.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<Customer, String> {

}
