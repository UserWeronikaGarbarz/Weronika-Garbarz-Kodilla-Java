package com.kodilla.good.patterns.Food2Door.service;

import com.kodilla.good.patterns.Food2Door.Order;
import com.kodilla.good.patterns.Food2Door.producer.Company;

public interface OrderRepository {
    boolean createOrder(Company company, Order order);
}
