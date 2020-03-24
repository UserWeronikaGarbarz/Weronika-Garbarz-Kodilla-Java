package com.kodilla.good.patterns.flights;

import java.util.Objects;

public final class DirectFlight {
    private final String departureAirport;
    private final String arrivalAirport;

    public DirectFlight(final String departureAirport, final String arrivalAirport) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DirectFlight that = (DirectFlight) o;
        return Objects.equals(departureAirport, that.departureAirport) &&
                Objects.equals(arrivalAirport, that.arrivalAirport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departureAirport, arrivalAirport);
    }

    @Override
    public String toString() {
        return "departureAirport='" + departureAirport +
                ", arrivalAirport='" + arrivalAirport;
    }
}


