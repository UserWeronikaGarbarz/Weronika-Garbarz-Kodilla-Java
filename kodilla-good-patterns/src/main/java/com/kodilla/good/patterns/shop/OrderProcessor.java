package com.kodilla.good.patterns.shop;

public class OrderProcessor {

    private InformationService informationService;
    private OrderRepository orderRepository;
    private ShopService shopService;

    public OrderProcessor(final InformationService informationService, final OrderRepository orderRepository,
                          final ShopService shopService) {
        this.informationService = informationService;
        this.orderRepository = orderRepository;
        this.shopService = shopService;
    }

    public OrderDto process(final BuyRequest buyRequest) {
        boolean isAvailable = orderRepository.createOrder(buyRequest.getUser(), buyRequest.getItem());
        if (isAvailable) {
            informationService.inform(buyRequest.getUser());
            shopService.buy(buyRequest.getItem(), buyRequest.getUser());
            return new OrderDto(buyRequest.getUser(), true);
        } else {
            return new OrderDto(buyRequest.getUser(), false);
        }
    }
}
