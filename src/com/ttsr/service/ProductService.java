package com.ttsr.service;

import com.ttsr.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
    private List<Product> products;

    public ProductService() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product){
        products.add(product);
    }

    public void removeProduct(Product product){
        products.remove(product);
    }

    public String showAll(){
        StringBuilder data = new StringBuilder();
        products.forEach(it -> data.append(it.getName()).append(" ").append(it.getPrice()).append("|"));
        return data.toString();
    }
}
