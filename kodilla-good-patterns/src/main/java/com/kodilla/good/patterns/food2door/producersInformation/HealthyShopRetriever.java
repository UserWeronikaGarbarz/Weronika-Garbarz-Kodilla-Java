package com.kodilla.good.patterns.food2door.producersInformation;

import com.kodilla.good.patterns.food2door.producer.Company;
import com.kodilla.good.patterns.food2door.producer.Product;

public class HealthyShopRetriever {

    public static InformationRequest retrieve3() {

        Company healthyShop = new Company("HealthyShop", "Malinowa 13, 33-333 Lipowo", 74778287727L);
        Product carrots = new Product("Carrots", "vegetable", 300);

        return new InformationRequest(healthyShop, carrots);
    }

}
