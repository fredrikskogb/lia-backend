package com.example.accessingdatamongodb.api;

import com.example.accessingdatamongodb.model.Order;
import com.example.accessingdatamongodb.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:8081")

public class OrderApi {

    @Autowired
    private OrderService orderService;

    @GetMapping("/user-order/{id}")
    public List<Order> getOrdersById(@PathVariable String id) {
        return orderService.getOrdersByCustomerId(id);
    }

}
