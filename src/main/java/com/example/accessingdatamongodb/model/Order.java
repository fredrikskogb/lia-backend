package com.example.accessingdatamongodb.model;

import org.springframework.data.annotation.Id;

public class Order {

    @Id
    private String id;

    private String userId;
    private String productId;
    private String discount;

    public Order() {}

    public Order(String userId, String productId, String discount){
        this.userId = userId;
        this.productId = productId;
        this.discount = discount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }
}
