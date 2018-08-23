package com.kodilla.good.patterns.allegro;

public class PurchaseProcess {
    private InfoService infoService;
    private ProductOrderService productOrderService;
    private ProductOrderWarehouse productOrderWarehouse;

    public PurchaseProcess(InfoService infoService, ProductOrderService productOrderService, ProductOrderWarehouse productOrderWarehouse){
        this.infoService = infoService;
        this.productOrderService = productOrderService;
        this.productOrderWarehouse = productOrderWarehouse;
    }

    public Order process(ProductOrderRequest productOrderRequest){
        boolean soldOrNot = productOrderService.sold(productOrderRequest.getUser(),productOrderRequest.getOrderDate(),
                productOrderRequest.getProduct(),productOrderRequest.getQuantity());
        if(soldOrNot){
            infoService.information(productOrderRequest.getUser());
            productOrderWarehouse.createOrder(productOrderRequest.getUser(),productOrderRequest.getOrderDate(),
                    productOrderRequest.getProduct(),productOrderRequest.getQuantity());
        }else{
            System.out.println("You cannot place an order - try again later. Sorry for inconvenience.");
        }

        return new Order(productOrderRequest.getUser(),productOrderRequest.getOrderDate(),
                productOrderRequest.getProduct(),productOrderRequest.getQuantity(),soldOrNot);

    }

}
