package com.kodilla.good.patterns.allegro;

public class Allegro {

            public static void main(String[] args) {
                ProductOrderRetriever productOrderRequestRetriever = new ProductOrderRetriever();
                ProductOrderRequest productOrderRequest = productOrderRequestRetriever.retrieve();

                PurchaseProcess productOrderProcessor = new PurchaseProcess(new EmailNotification(), new MobilephoneOrderService(), new MobilephoneOrderWarehouse());
                productOrderProcessor.process(productOrderRequest);
            }
        }

