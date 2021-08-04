package com.ttsr.thirdParty;

public class ProductItem {
    String productName;
    int productPrice;

    public ProductItem() {
    }

    public ProductItem(String productName, int productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }
}
