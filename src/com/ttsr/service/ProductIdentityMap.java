package com.ttsr.service;

import com.ttsr.model.Product;
import com.ttsr.model.ProductImpl;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class ProductIdentityMap {
    private static Map<Long, ProductImpl> productMap = new HashMap<>();

    public static void addProduct(ProductImpl product){
        productMap.put(product.getId(),product);
    }
    public static void removeProduct(Long productId){
        productMap.remove(productId);
    }

    public static ProductImpl findProductById(Long id){
        return productMap.get(id);
    }
}
