package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {

        //Given
        World world = new World();
        Continent europe = new Continent("Europa");
        Continent asia = new Continent("Azja");

        //When
        europe.addCountry(new Country("Polska", new BigDecimal(300000000)));
        europe.addCountry(new Country("Niemcy", new BigDecimal(488995884)));
        asia.addCountry(new Country("Indie", new BigDecimal(40000000)));
        world.addContinent(europe);
        world.addContinent(asia);

        //Then
        Assert.assertEquals(world.getPeopleQuantity(), new BigDecimal(828995884));
    }
}
