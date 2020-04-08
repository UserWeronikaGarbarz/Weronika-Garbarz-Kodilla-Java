package com.kodilla.good.patterns.rental;

public class RentalProcessor {

    private InformationService informationService;
    private RentalService rentalService;
    private RentalRepository shopService;

    public RentalProcessor(final InformationService informationService, final RentalService rentalService,
                           final RentalRepository shopService) {
        this.informationService = informationService;
        this.rentalService = rentalService;
        this.shopService = shopService;
    }

    public RentalDto process(final RentRequest rentRequest) {
        boolean isRented = rentalService.rent(rentRequest.getUser(), rentRequest.getFrom(),
                rentRequest.getTo());
        if (isRented) {
            informationService.inform(rentRequest.getUser());
            shopService.createRental(rentRequest.getUser(), rentRequest.getFrom(), rentRequest.getTo());
            return new RentalDto(rentRequest.getUser(), true);
        } else {
            return new RentalDto(rentRequest.getUser(), false);
        }
    }
}
