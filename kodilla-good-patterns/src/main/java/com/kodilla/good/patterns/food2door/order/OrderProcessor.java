package com.kodilla.good.patterns.food2door.order;

import com.kodilla.good.patterns.food2door.service.InformationService;
import com.kodilla.good.patterns.food2door.service.OrderRepository;

public class OrderProcessor {

    private InformationService informationService;
    private OrderRepository orderRepository;

    public OrderProcessor(final InformationService informationService, final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean orderIsPlaced = orderRepository.createOrder(orderRequest.getCompany(), orderRequest.getOrder());

        if (orderIsPlaced) {
            informationService.inform(orderRequest.getCompany());
            return new OrderDto(orderRequest.getCompany(), true);
        } else {
            return new OrderDto(orderRequest.getCompany(), false);
        }
    }
}
