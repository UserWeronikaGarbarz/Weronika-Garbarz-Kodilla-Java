package com.kodilla.exception.test;

public class FlightFinderRunner {

    public static void main(String[] args) {

        FlightFinder flightFinder = new FlightFinder();

        try {
            flightFinder.findFlight(new Flight("Madridddd", "Barcelona"));
        } catch (RouteNotFoundException e) {
            System.out.println("Exceptiotn handled.");
        }
    }
}