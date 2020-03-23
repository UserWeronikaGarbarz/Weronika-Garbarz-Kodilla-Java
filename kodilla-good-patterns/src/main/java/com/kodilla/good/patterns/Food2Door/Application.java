package com.kodilla.good.patterns.Food2Door;

import com.kodilla.good.patterns.Food2Door.implement.InformationRetrieval;
import com.kodilla.good.patterns.Food2Door.implement.MailService;
import com.kodilla.good.patterns.Food2Door.implement.OrderService;

public class Application {

    public static void main(String[] args) {

        InformationRequestRetriever informationRequestRetriever = new InformationRequestRetriever();
        InformationRequest informationRequest = informationRequestRetriever.retrieve();
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.orderRetrieve();

        OrderProcessor orderProcessor = new OrderProcessor(new MailService(), new OrderService(),
                new InformationRetrieval());
        orderProcessor.process(informationRequest, orderRequest);
    }

}
