package com.kodilla.good.patterns.Food2Door.implement;

import com.kodilla.good.patterns.Food2Door.Order;
import com.kodilla.good.patterns.Food2Door.producer.Company;
import com.kodilla.good.patterns.Food2Door.service.OrderRepository;

public class OrderService implements OrderRepository {

    public boolean createOrder(Company company, Order order) {
        System.out.println("Processing order: " + " \n order number: " + order.getOrderNumber()
                + "\n " + order.getProduct() + "\n quantity: " + order.getQuantity() +
                "\n from: " + company.getCompanyName());
        return true;
    }
}
