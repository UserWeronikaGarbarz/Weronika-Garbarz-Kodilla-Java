package com.kodilla.good.patterns.Food2Door;

import com.kodilla.good.patterns.Food2Door.producer.Company;
import com.kodilla.good.patterns.Food2Door.producer.Product;

public class InformationRequest {

    private Company company;
    private Product product;

    public InformationRequest(final Company company, final Product product) {
        this.company = company;
        this.product = product;
    }

    public Company getCompany() {
        return company;
    }

    public Product getProduct() {
        return product;
    }
}
