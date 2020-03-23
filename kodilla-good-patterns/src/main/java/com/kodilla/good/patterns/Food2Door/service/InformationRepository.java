package com.kodilla.good.patterns.Food2Door.service;

import com.kodilla.good.patterns.Food2Door.producer.Product;
import com.kodilla.good.patterns.Food2Door.producer.Company;

public interface InformationRepository {
    void obtainInformation(Company company, Product product);
}
