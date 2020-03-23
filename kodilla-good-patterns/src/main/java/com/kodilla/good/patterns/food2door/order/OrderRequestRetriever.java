package com.kodilla.good.patterns.food2door.order;

import com.kodilla.good.patterns.food2door.producer.Company;
import com.kodilla.good.patterns.food2door.producer.Product;

public class OrderRequestRetriever {

    public static OrderRequest orderRetrieve() {

        Order order = new Order("NS/20", new Product("tofu", "wegan", 200), 20l);
        Company company = new Company("WegeShop", "Malownicza 23, 31-500 Kolorowo", 786676665L);
        return new OrderRequest(company, order);
    }
}
