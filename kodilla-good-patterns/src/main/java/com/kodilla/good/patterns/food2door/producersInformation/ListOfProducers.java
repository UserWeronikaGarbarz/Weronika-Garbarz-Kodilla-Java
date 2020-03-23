package com.kodilla.good.patterns.food2door.producersInformation;

import java.util.ArrayList;
import java.util.List;

public class ListOfProducers {
    private List<InformationRequest> producers = new ArrayList<>();

    public void producerAdd(InformationRequest informationRequest) {
        producers.add(informationRequest);
    }

    @Override
    public String toString() {
        return "\nList of producers" +
                producers + "\n";
    }
}
