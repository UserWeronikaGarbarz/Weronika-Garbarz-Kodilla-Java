package com.kodilla.good.patterns.Food2Door.implement;

import com.kodilla.good.patterns.Food2Door.producer.Product;
import com.kodilla.good.patterns.Food2Door.producer.Company;
import com.kodilla.good.patterns.Food2Door.service.InformationRepository;

public class InformationRetrieval implements InformationRepository {

    public void obtainInformation(Company company, Product product) {
        System.out.println("Information about supplier: " + "\n name: " + company.getCompanyName()
                + " \n address: " + company.getAddress() + " \n NIP: " + company.getNip() +
                "\nInformation about product: " + "\n name: "
                + product.getName() + "\n quantity: " + product.getQuantity()
                + "\n type: " + product.getTypeOfProduct());
    }
}
