package com.kodilla.good.patterns.food2door.producersInformation;

import com.kodilla.good.patterns.food2door.producer.Company;
import com.kodilla.good.patterns.food2door.producer.Product;

public class ExtraFoodShopRetriever {

    public static InformationRequest retrieve1() {

        Company extraFoodShop = new Company("ExtraFoodShop", "Liliowa 13, 33-333 Lipowo", 7443787727L);
        Product kale = new Product("Kale", "vegetable", 500);

        return new InformationRequest(extraFoodShop, kale);
    }
}
