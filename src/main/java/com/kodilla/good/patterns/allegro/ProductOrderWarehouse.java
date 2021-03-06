package com.kodilla.good.patterns.allegro;

import java.time.LocalDateTime;

interface ProductOrderWarehouse {
    boolean createOrder(User user, LocalDateTime orderDate, Product product, int quantity);
}
