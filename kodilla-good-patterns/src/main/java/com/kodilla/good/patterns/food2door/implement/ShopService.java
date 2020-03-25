package com.kodilla.good.patterns.food2door.implement;

import com.kodilla.good.patterns.food2door.producer.Company;
import com.kodilla.good.patterns.food2door.producer.Product;
import com.kodilla.good.patterns.food2door.producersInformation.InformationRequest;
import com.kodilla.good.patterns.food2door.service.ShopRetriever;

public class ShopService implements ShopRetriever {

    @Override
    public InformationRequest retrieveInformation(Company company, Product product) {
        return new InformationRequest(company, product);
    }
}
