package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {

    public void findFlight(Flight flight) throws RouteNotFoundException {

        Map<String, Boolean> airports = new HashMap<>();
        airports.put("Barcelona", true);
        airports.put("Madrid", true);

        try {
            boolean arrival = airports.get(flight.getArrivalAirport());
            boolean departure = airports.get(flight.getDepartureAirport());
            if (arrival && departure) {
                System.out.println("Czy mozna tam leciec: tak");
            } else {
                System.out.println("Czy mozna tam leciec: nie");
            }
        } catch (NullPointerException e) {
            throw new RouteNotFoundException("Nie ma takiej trasy");
        }
    }
}

