package com.ttsr.service;

import com.ttsr.model.ProductImpl;

import java.sql.SQLException;

public class ProductMapService {

    private ProductMapper productMapper;

    public ProductMapService(ProductMapper productMapper) {
        this.productMapper = productMapper;
    }

    private ProductImpl findById(Long id) throws SQLException {
        ProductImpl product = ProductIdentityMap.findProductById(id);
        if(product == null) {
            product = productMapper.findById(id);
            if(product != null) ProductIdentityMap.addProduct(product);
        }
        return product;
    }

    private void update(ProductImpl product) throws SQLException {
        productMapper.insert(product);
        ProductIdentityMap.addProduct(product);
    }

    private void delete(Long productId) throws SQLException {
        if(ProductIdentityMap.findProductById(productId) != null)
            productMapper.deleteById(productId);
        ProductIdentityMap.removeProduct(productId);
    }
}
