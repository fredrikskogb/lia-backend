package com.example.accessingdatamongodb.repository;

import com.example.accessingdatamongodb.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {

}
