package com.kodilla.good.patterns.Food2Door.implement;

import com.kodilla.good.patterns.Food2Door.producer.Company;
import com.kodilla.good.patterns.Food2Door.service.InformationService;

public class MailService implements InformationService {

    public void inform(Company company) {
        System.out.println("An order has been processed.");
    }
}
