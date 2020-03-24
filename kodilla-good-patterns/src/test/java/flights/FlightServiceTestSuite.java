package flights;

import com.kodilla.good.patterns.flights.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FlightServiceTestSuite {
    @Test
    public void testFindDirectFlight() {
        //Given
        FlightFinderArrival flightFinderArrival = new FlightFinderArrival();
        FlightFinderDeparture flightFinderDeparture = new FlightFinderDeparture();

        //When
        List<DirectFlight> arrival = flightFinderArrival.findFlightArrival("Paris");
        List<DirectFlight> departure = flightFinderDeparture.findFlightDeparture("Cracow");

        //Then
        Assert.assertEquals(1, departure.size());
        Assert.assertEquals(3, arrival.size());
    }

    @Test
    public void testFindIndirectFlight() {
        //Given
        FlightFinderMiddle flightFinderMiddle = new FlightFinderMiddle();

        //When
        List<IndirectFlight> middleFlight = flightFinderMiddle.findFlightMiddle("Madrid", "Paris", "Barcelona");

        //Then
        Assert.assertEquals(1, middleFlight.size());
    }
}
