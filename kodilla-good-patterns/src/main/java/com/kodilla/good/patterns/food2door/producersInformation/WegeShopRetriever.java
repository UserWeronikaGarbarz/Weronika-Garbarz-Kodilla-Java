package com.kodilla.good.patterns.food2door.producersInformation;

import com.kodilla.good.patterns.food2door.producer.Product;
import com.kodilla.good.patterns.food2door.producer.Company;

public class WegeShopRetriever {

    public static InformationRequest retrieve() {

        Company wegeShop = new Company("WegeShop", "Malownicza 23, 31-500 Kolorowo", 786676665L);
        Product tofu = new Product("Tofu", "wegan", 300);

        return new InformationRequest(wegeShop, tofu);
    }

}
