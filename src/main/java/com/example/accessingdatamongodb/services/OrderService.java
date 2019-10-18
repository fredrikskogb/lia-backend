package com.example.accessingdatamongodb.services;

import com.example.accessingdatamongodb.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class OrderService {

    private MongoTemplate mongoTemplate;

    @Autowired
    public OrderService(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    public List<Order> getOrdersByCustomerId(String customerId) {

        Query query = new Query();
        query.addCriteria(Criteria.where("userId").is(customerId));

        return mongoTemplate.find(query, Order.class);
    }



}
