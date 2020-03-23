package com.kodilla.good.patterns.food2door;

import com.kodilla.good.patterns.food2door.implement.MailService;
import com.kodilla.good.patterns.food2door.implement.OrderService;
import com.kodilla.good.patterns.food2door.order.OrderProcessor;
import com.kodilla.good.patterns.food2door.order.OrderRequest;
import com.kodilla.good.patterns.food2door.order.OrderRequestRetriever;
import com.kodilla.good.patterns.food2door.producer.Company;
import com.kodilla.good.patterns.food2door.producersInformation.*;

public class Application {

    public static void main(String[] args) {

        WegeShopRetriever wegeShopRetriever = new WegeShopRetriever();
        ExtraFoodShopRetriever extraFoodShopRetriever = new ExtraFoodShopRetriever();
        GlutenFreeShopRetriever glutenFreeShopRetriever = new GlutenFreeShopRetriever();
        HealthyShopRetriever healthyShopRetriever = new HealthyShopRetriever();

        InformationRequest informationRequestWege = wegeShopRetriever.retrieveInformation();
        InformationRequest informationRequestExtra = extraFoodShopRetriever.retrieveInformation();
        InformationRequest informationRequestGluten = glutenFreeShopRetriever.retrieveInformation();
        InformationRequest informationRequestHealthy = healthyShopRetriever.retrieveInformation();

        ListOfProducers listOfProducers = new ListOfProducers();
        listOfProducers.producerAdd(informationRequestWege);
        listOfProducers.producerAdd(informationRequestExtra);
        listOfProducers.producerAdd(informationRequestGluten);
        listOfProducers.producerAdd(informationRequestHealthy);

        System.out.println(listOfProducers);

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.orderRetrieve();

        OrderProcessor orderProcessor = new OrderProcessor(new MailService(), new OrderService());
        orderProcessor.process(orderRequest);
    }

}
