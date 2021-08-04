package com.ttsr.thirdParty;

import com.ttsr.model.Product;

import java.math.BigDecimal;

public class ProductItemAdapter implements Product {

    private ProductItem productItem;

    public ProductItemAdapter(ProductItem productItem) {
        this.productItem = productItem;
    }

    @Override
    public String getName() {
        return productItem.getProductName();
    }

    @Override
    public BigDecimal getPrice() {
        return new BigDecimal(productItem.getProductPrice());
    }
}
