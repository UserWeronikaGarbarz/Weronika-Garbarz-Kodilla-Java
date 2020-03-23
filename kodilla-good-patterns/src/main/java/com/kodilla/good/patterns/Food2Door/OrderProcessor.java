package com.kodilla.good.patterns.Food2Door;

import com.kodilla.good.patterns.Food2Door.service.InformationRepository;
import com.kodilla.good.patterns.Food2Door.service.InformationService;
import com.kodilla.good.patterns.Food2Door.service.OrderRepository;

public class OrderProcessor {

    private InformationService informationService;
    private OrderRepository orderRepository;
    private InformationRepository informationRepository;

    public OrderProcessor(final InformationService informationService, final OrderRepository orderRepository,
                          final InformationRepository informationRepository) {
        this.informationService = informationService;
        this.orderRepository = orderRepository;
        this.informationRepository = informationRepository;
    }

    public OrderDto process(final InformationRequest informationRequest, final OrderRequest orderRequest) {
        informationRepository.obtainInformation(informationRequest.getCompany(), informationRequest.getProduct());
        boolean orderIsPlaced = orderRepository.createOrder(orderRequest.getCompany(), orderRequest.getOrder());

        if (orderIsPlaced) {
            informationService.inform(orderRequest.getCompany());
            return new OrderDto(orderRequest.getCompany(), true);
        } else {
            return new OrderDto(orderRequest.getCompany(), false);
        }
    }
}
