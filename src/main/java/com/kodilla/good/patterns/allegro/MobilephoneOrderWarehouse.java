package com.kodilla.good.patterns.allegro;

import java.time.LocalDateTime;
import java.util.Random;

public class MobilephoneOrderWarehouse implements ProductOrderWarehouse {
    @Override
    public boolean createOrder(User user, LocalDateTime orderDate, Product product, int quantity){
        return new Random().nextBoolean();
    }
}
