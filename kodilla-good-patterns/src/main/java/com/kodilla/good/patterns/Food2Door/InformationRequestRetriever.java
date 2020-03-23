package com.kodilla.good.patterns.Food2Door;

import com.kodilla.good.patterns.Food2Door.producer.Product;
import com.kodilla.good.patterns.Food2Door.producer.Company;

public class InformationRequestRetriever {

    public static InformationRequest retrieve() {

        Company company = new Company("WegeShop", "Malownicza 23, 31-500 Kolorowo", 786676665L);
        Product product = new Product("Tofu", "wegan", 300);

        return new InformationRequest(company, product);
    }
}
