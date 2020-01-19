package com.kodilla.testing.weather.stub;

import java.util.HashMap;

public interface Temperatures {

    //Identifier of weather situation, Celsius degrees

    HashMap<Integer, Double> getTemperatures();
}