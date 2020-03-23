package com.kodilla.good.patterns.Food2Door;

import com.kodilla.good.patterns.Food2Door.producer.Company;
import com.kodilla.good.patterns.Food2Door.producer.Product;

public class OrderRequestRetriever {

    public static OrderRequest orderRetrieve() {

        Order order = new Order("NS/20", new Product("tofu", "wegam", 200), 20l);
        Company company = new Company("WegeShop", "Malownicza 23, 31-500 Kolorowo", 786676665L);
        return new OrderRequest(company, order);
    }
}
