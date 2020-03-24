package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightFinderArrival {
    List<DirectFlight> listOfDirectFlights = new ArrayList<>();

    public List<DirectFlight> findFlightArrival(String city) {
        FlightDatabase flightDatabase = new FlightDatabase();
        listOfDirectFlights = flightDatabase.getDirectFlights().stream()
                .filter(f -> f.getArrivalAirport().equals(city)).collect(Collectors.toList());

        return listOfDirectFlights;
    }

    @Override
    public String toString() {
        return "Flights from: " + listOfDirectFlights;
    }
}
