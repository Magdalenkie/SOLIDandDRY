package com.kodilla.good.patterns.allegro;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class ProductOrderRetriever {

    public ProductOrderRequest retrieve(){
        User user = new User("Niki", "Nicole", "Stephanopolis");
        LocalDateTime orderDate = LocalDateTime.of(2018,8,13,21,50);
        Product product = new Mobilephone("Huawei", "Robert L. doesn't use it", new BigDecimal("1599"));
        int quantity = 1;


        System.out.println("Retreive the request: ");
        System.out.println("User: " + user.getUserName() + " Date: " + orderDate + " " + product + " -quantity = " + quantity);
        return new ProductOrderRequest(user, orderDate, product, quantity);



    }
}
