package com.kodilla.good.patterns.food2door.implement;

import com.kodilla.good.patterns.food2door.producer.Company;
import com.kodilla.good.patterns.food2door.service.InformationService;

public class MailService implements InformationService {
    public void inform(Company company) {
        System.out.println("An order has been processed.");
    }
}
