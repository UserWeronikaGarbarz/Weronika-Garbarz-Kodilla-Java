package com.kodilla.good.patterns.shop;

public class Application {

    public static void main(String[] args) {

        BuyRequestRetriever buyRequestRetriever = new BuyRequestRetriever();
        BuyRequest buyRequest = BuyRequestRetriever.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(new MailService(), new OrderService(),
                new ShopItem());
        orderProcessor.process(buyRequest);
    }
}
