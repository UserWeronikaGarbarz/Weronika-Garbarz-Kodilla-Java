package com.kodilla.good.patterns.food2door.producersInformation;

import com.kodilla.good.patterns.food2door.producer.Company;
import com.kodilla.good.patterns.food2door.producer.Product;

public class GlutenFreeShopRetriever {

    public static InformationRequest retrieve2() {

        Company glutenFreeShop = new Company("GlutenFreeShop", "Liliowa 13, 33-333 Lipowo", 7477575787727L);
        Product apples = new Product("Apples", "fruits", 500);

        return new InformationRequest(glutenFreeShop, apples);
    }

}
