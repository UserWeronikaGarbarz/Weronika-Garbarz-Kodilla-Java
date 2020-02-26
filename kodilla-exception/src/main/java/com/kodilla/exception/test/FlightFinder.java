package com.kodilla.exception.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlightFinder {

    public void findFlight(Flight flight) throws RouteNotFoundException {

        Map<String, Boolean> airports = new HashMap<>();
        airports.put("Barcelona", true);
        airports.put("Madrid", false);
        airports.put("Berlin", true);
        airports.put("Porto", false);

        List<String> airportsList = new ArrayList<>(airports.keySet());

        if (airportsList.contains(flight.getArrivalAirport()) && airportsList.contains(flight.getDepartureAirport())) {
            System.out.println("Airport is found.");
        } else {
            throw new RouteNotFoundException();
        }
    }
}

