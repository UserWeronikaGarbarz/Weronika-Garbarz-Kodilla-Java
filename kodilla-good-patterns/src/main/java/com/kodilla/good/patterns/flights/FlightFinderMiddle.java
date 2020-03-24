package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightFinderMiddle {
    List<IndirectFlight> listOfIndirectFlights = new ArrayList<>();

    public List<IndirectFlight> findFlightMiddle(String departureCity, String middleCity, String arrivalCity) {
        FlightDatabase flightDatabase = new FlightDatabase();

        listOfIndirectFlights = flightDatabase.getIndirectFlights().stream()
                .filter(f -> f.getMiddleAirport().equals(middleCity)
                        && f.getArrivalAirport().equals(arrivalCity) && f.getDepartureAirport().equals(departureCity))
                .collect(Collectors.toList());

        return listOfIndirectFlights;
    }

    @Override
    public String toString() {
        return "Flights from: " + listOfIndirectFlights;
    }
}
