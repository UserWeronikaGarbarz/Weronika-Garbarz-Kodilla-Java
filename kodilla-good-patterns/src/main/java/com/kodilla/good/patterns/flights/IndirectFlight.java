package com.kodilla.good.patterns.flights;

import java.util.Objects;

public final class IndirectFlight {
    private final String departureAirport;
    private final String arrivalAirport;
    private final String middleAirport;

    public IndirectFlight(String departureAirport, String middleAirport, String arrivalAirport) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.middleAirport = middleAirport;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public String getMiddleAirport() {
        return middleAirport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IndirectFlight that = (IndirectFlight) o;
        return Objects.equals(departureAirport, that.departureAirport) &&
                Objects.equals(arrivalAirport, that.arrivalAirport) &&
                Objects.equals(middleAirport, that.middleAirport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departureAirport, arrivalAirport, middleAirport);
    }

    @Override
    public String toString() {
        return "departureAirport='" + departureAirport +
                ", arrivalAirport='" + arrivalAirport +
                ", middleAirport='" + middleAirport;
    }
}
