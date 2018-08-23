package com.kodilla.good.patterns.allegro;

public class EmailNotification implements InfoService {
    @Override
    public void information(User user){
        System.out.println("Hello " + user.getUserName());
        System.out.println("Thank you for your order! Have a nice day.");
    }
}
