package com.kodilla.good.patterns.food2door.implement;

import com.kodilla.good.patterns.food2door.order.Order;
import com.kodilla.good.patterns.food2door.producer.Company;
import com.kodilla.good.patterns.food2door.service.OrderRepository;

public class OrderService implements OrderRepository {
    public boolean createOrder(Company company, Order order) {
        System.out.println("Processing order: " + " \n order number: " + order.getOrderNumber()
                + "\n " + order.getProduct() + "\n quantity: " + order.getQuantity() +
                "\n from: " + company.getCompanyName() + "\n address: " + company.getAddress());
        return true;
    }
}
