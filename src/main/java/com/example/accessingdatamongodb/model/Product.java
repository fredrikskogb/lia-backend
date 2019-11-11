package com.example.accessingdatamongodb.model;

import org.springframework.data.annotation.Id;

public class Product {

    @Id
    private String id;

    private String service;
    private String fullPrice;
    private String discount;
    private String imageUrl;
    private String description;

    public Product() {

    }

    public Product(String service, String fullPrice, String discount, String imageUrl, String description){
        this.service = service;
        this.fullPrice = fullPrice;
        this.discount = discount;
        this.imageUrl = imageUrl;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getFullPrice() {
        return fullPrice;
    }

    public void setFullPrice(String fullPrice) {
        this.fullPrice = fullPrice;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getImageUrl() { return imageUrl; }

    public void setImageUrl(String discount) { this.imageUrl = imageUrl; }

    public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description; }

}