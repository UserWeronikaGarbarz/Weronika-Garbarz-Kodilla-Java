package com.kodilla.patterns.strategy.brokerage;

public class IndividualYoungCustomer extends Customer{
    public IndividualYoungCustomer(String name) {
        super(name);
        this.buyPredictor = new AggressivePredictor();
    }
}
