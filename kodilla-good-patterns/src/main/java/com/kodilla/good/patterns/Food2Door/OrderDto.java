package com.kodilla.good.patterns.Food2Door;

import com.kodilla.good.patterns.Food2Door.producer.Company;

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

    public boolean orderIsPlaced() {
        return orderIsPlaced;
    }
}
