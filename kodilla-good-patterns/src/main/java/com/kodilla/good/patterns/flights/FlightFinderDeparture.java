package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightFinderDeparture {
    List<DirectFlight> listOfDirectFlights = new ArrayList<>();

    public List<DirectFlight> findFlightDeparture(String city) {
        FlightDatabase flightDatabase = new FlightDatabase();
        listOfDirectFlights = flightDatabase.getDirectFlights().stream()
                .filter(f -> f.getDepartureAirport().equals(city)).collect(Collectors.toList());

        return listOfDirectFlights;
    }

    @Override
    public String toString() {
        return "Flights to: " + listOfDirectFlights;
    }
}
