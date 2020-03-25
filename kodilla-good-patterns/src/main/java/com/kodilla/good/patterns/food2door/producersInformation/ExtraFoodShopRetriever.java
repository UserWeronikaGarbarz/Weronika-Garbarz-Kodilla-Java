package com.kodilla.good.patterns.food2door.producersInformation;

import com.kodilla.good.patterns.food2door.implement.ShopService;
import com.kodilla.good.patterns.food2door.producer.Company;
import com.kodilla.good.patterns.food2door.producer.Product;
import com.kodilla.good.patterns.food2door.service.ShopRetriever;
import com.kodilla.good.patterns.shop.Item;
import com.kodilla.good.patterns.shop.User;

public class ExtraFoodShopRetriever extends ShopService {

    public InformationRequest retrieveInformation() {
        Company extraFoodShop = new Company("ExtraFoodShop", "Liliowa 13, 33-333 Lipowo", 7443787727L);
        Product kale = new Product("Kale", "vegetable", 500);

        return new InformationRequest(extraFoodShop, kale);
    }
}

