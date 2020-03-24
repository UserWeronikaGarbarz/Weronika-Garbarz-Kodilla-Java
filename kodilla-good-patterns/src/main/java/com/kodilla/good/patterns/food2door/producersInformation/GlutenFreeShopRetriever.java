package com.kodilla.good.patterns.food2door.producersInformation;

import com.kodilla.good.patterns.food2door.producer.Company;
import com.kodilla.good.patterns.food2door.producer.Product;
import com.kodilla.good.patterns.food2door.service.ShopRetriever;

public class GlutenFreeShopRetriever implements ShopRetriever {

    @Override
    public InformationRequest retrieveInformation() {
        Company glutenFreeShop = new Company("GlutenFreeShop", "Liliowa 13, 33-333 Lipowo", 7477575787727L);
        Product apples = new Product("Apples", "fruits", 500);

        return new InformationRequest(glutenFreeShop, apples);
    }
}


