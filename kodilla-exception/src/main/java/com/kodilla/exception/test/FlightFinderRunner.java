package com.kodilla.exception.test;

public class FlightFinderRunner {

    public static void main(String[] args) throws RouteNotFoundException {

        FlightFinder flightFinder = new FlightFinder();
        Flight flight = new Flight("Monako", "Barcelona");
        flightFinder.findFlight(flight);
    }
}

