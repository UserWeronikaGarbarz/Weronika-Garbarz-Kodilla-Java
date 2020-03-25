package com.kodilla.good.patterns.food2door.order;

import com.kodilla.good.patterns.food2door.producersInformation.InformationRequest;
import com.kodilla.good.patterns.food2door.service.InformationService;
import com.kodilla.good.patterns.food2door.service.OrderRepository;
import com.kodilla.good.patterns.food2door.service.ShopRetriever;

public class OrderProcessor {
    private InformationService informationService;
    private OrderRepository orderRepository;
    private ShopRetriever shopRetriever;

    public OrderProcessor(final InformationService informationService, final OrderRepository orderRepository,
                          final ShopRetriever shopRetriever) {
        this.informationService = informationService;
        this.orderRepository = orderRepository;
        this.shopRetriever = shopRetriever;
    }

    public OrderDto process(final OrderRequest orderRequest, InformationRequest informationRequest) {
        boolean orderIsPlaced = orderRepository.createOrder(orderRequest.getCompany(), orderRequest.getOrder());
        shopRetriever.retrieveInformation(informationRequest.getCompany(), informationRequest.getProduct());
        if (orderIsPlaced) {
            informationService.inform(orderRequest.getCompany());
            return new OrderDto(orderRequest.getCompany(), true);
        } else {
            return new OrderDto(orderRequest.getCompany(), false);
        }
    }
}
