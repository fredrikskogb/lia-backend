package com.example.accessingdatamongodb.repository;

import com.example.accessingdatamongodb.model.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepository extends MongoRepository<Order, String> {



}