package com.kodilla.good.patterns.food2door.producersInformation;

import com.kodilla.good.patterns.food2door.producer.Company;
import com.kodilla.good.patterns.food2door.producer.Product;
import com.kodilla.good.patterns.food2door.service.ShopRetriever;

public class HealthyShopRetriever implements ShopRetriever {

    @Override
    public InformationRequest retrieveInformation() {
        Company healthyShop = new Company("HealthyShop", "Malinowa 13, 33-333 Lipowo", 74778287727L);
        Product carrots = new Product("Carrots", "vegetable", 300);

        return new InformationRequest(healthyShop, carrots);
    }
}
