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

    @GetMapping("/customers/customer-orders/{id}")
    public List<Order> getOrdersById(@PathVariable String id) {
        return orderService.getOrdersByCustomerId(id);
    }


    @GetMapping("/orders")
    public List<Order> getAllOrders() {
        return orderService.getAllOrders();
    }

    @GetMapping("/orders/{id}")
    public Order getSingleOrderById(@PathVariable String id) {
        return orderService.getOrderByOrderId(id);
    }

}
