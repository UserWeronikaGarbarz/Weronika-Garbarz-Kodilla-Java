package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.List;

public final class FlightDatabase {
    private final List<DirectFlight> directFlights = new ArrayList<>();
    private final List<IndirectFlight> indirectFlights = new ArrayList<>();

    public FlightDatabase() {
        directFlights.add(new DirectFlight("Eindhoven", "Paris"));
        directFlights.add(new DirectFlight("Paris", "Madrid"));
        directFlights.add(new DirectFlight("Amsterdam", "Rome"));
        directFlights.add(new DirectFlight("Cracow", "Malaga"));
        directFlights.add(new DirectFlight("Brussels", "Paris"));
        directFlights.add(new DirectFlight("Bergamo", "Paris"));
        indirectFlights.add(new IndirectFlight("Madrid", "Paris", "Barcelona"));
        indirectFlights.add(new IndirectFlight("Porto", "Lisboa", "Madrid"));
        indirectFlights.add(new IndirectFlight("Amsterdam", "Lisboa", "Malaga"));
    }

    public List<DirectFlight> getDirectFlights() {
        return new ArrayList<>(directFlights);
    }

    public List<IndirectFlight> getIndirectFlights() {
        return new ArrayList<>(indirectFlights);
    }
}
