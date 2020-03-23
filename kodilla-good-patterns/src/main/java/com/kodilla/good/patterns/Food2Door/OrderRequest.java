package com.kodilla.good.patterns.Food2Door;

import com.kodilla.good.patterns.Food2Door.producer.Company;

public class OrderRequest {
    Company company;
    Order order;

    public OrderRequest(Company company, Order order) {
        this.company = company;
        this.order = order;
    }

    public Company getCompany() {
        return company;
    }

    public Order getOrder() {
        return order;
    }
}
