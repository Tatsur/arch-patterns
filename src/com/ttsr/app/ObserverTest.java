package com.ttsr.app;

import com.ttsr.observer.Notifier;
import com.ttsr.observer.UserSubscriber;
import com.ttsr.thirdParty.ProductItem;

public class ObserverTest {
    public static void main(String[] args) {

        ProductItem product = new ProductItem("hat",500);
        UserSubscriber userSubscriber = new UserSubscriber();

        product.subscribe(userSubscriber);
        product.setProductPrice(400);
        product.setProductName("Superior Hat");
        product.unsubscribe(userSubscriber);
        product.setProductPrice(700);
    }
}
