package com.ttsr.thirdParty;

import com.ttsr.observer.Notifier;

public class ProductItem extends Notifier {
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
        String temp = this.productName;
        this.productName = productName;
        notify(String.format("'%s' title change to '%s'",temp,productName));
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        int temp = this.productPrice;
        this.productPrice = productPrice;
        notify(String.format("Price %s change to %s",temp,productPrice));
    }

    @Override
    public String toString() {
        return String.format("%s",productName);
    }
}
