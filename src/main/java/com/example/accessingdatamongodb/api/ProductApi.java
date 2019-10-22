package com.example.accessingdatamongodb.api;

import com.example.accessingdatamongodb.model.Product;
import com.example.accessingdatamongodb.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:8081")
public class ProductApi {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public List<Product>  getAllProducts() {
        return productService.getAllProducts();
    }

}
