package com.kodilla.good.patterns.food2door.service;

import com.kodilla.good.patterns.food2door.producer.Company;
import com.kodilla.good.patterns.food2door.producer.Product;
import com.kodilla.good.patterns.food2door.producersInformation.InformationRequest;

public interface ShopRetriever {
    InformationRequest retrieveInformation(Company company, Product product);
}

