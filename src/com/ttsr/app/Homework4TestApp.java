package com.ttsr.app;

import com.ttsr.service.ProductService;
import com.ttsr.thirdParty.ProductItem;
import com.ttsr.thirdParty.ProductItemAdapter;

public class Homework4TestApp {
    public static void main(String[] args) {
        ProductService products = new ProductService();
        ProductItem product1 = new ProductItem("Shoes",500);
        products.addProduct(new ProductItemAdapter(product1));
        System.out.println(products.showAll());
    }
}
