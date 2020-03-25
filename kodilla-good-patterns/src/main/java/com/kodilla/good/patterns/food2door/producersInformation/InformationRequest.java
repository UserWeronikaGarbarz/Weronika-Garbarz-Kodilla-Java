package com.kodilla.good.patterns.food2door.producersInformation;

import com.kodilla.good.patterns.food2door.producer.Company;
import com.kodilla.good.patterns.food2door.producer.Product;

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


    @Override
    public String toString() {
        return "\n " + company + "\n " + product;
    }
}
