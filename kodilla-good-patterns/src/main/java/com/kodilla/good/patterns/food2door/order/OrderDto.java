package com.kodilla.good.patterns.food2door.order;

import com.kodilla.good.patterns.food2door.producer.Company;

public class OrderDto {

    public Company company;
    public boolean orderIsPlaced;

    public OrderDto(final Company company, final boolean orderIsPlaced) {
        this.company = company;
        this.orderIsPlaced = orderIsPlaced;
    }

    public Company getCompany() {
        return company;
    }
}
