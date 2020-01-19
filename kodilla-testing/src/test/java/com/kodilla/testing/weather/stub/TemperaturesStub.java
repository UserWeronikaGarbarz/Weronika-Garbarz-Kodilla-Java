package com.kodilla.testing.weather.stub;

import java.util.HashMap;

public class TemperaturesStub implements Temperatures {

    @Override
    public HashMap<Integer, Double> getTemperatures() {

        HashMap<Integer, Double> stubResult = new HashMap<Integer, Double>();

        // dummy data

        stubResult.put(0, 25.5);
        stubResult.put(1, 20.5);
        stubResult.put(2, 25.0);
        stubResult.put(3, 13.5);
        stubResult.put(4, 29.5);

        return stubResult;
    }
}
