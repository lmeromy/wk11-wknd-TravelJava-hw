import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class FlightTest {

    Flight flight;
    Plane plane;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;

//    Refactor the Flight's departure time to use the Date class (HINT: Look into Type Migration in IntelliJ to refactor faster)

    @Before
    public void setup(){
        plane = new Plane(PlaneType.SEAPLANE);
        flight = new Flight("TJ101", plane,"GLA", "SFO", "13:05");

    }

    @Test
    public void canGetPassengerNumbers(){
        assertEquals(0, flight.getPassengerCount());
    }

    @Test
    public void canGetNumberOfEmptySeats(){
        assertEquals(2, flight.getVacantSeats());

    }

//    @Test
//    public void flightTimeHasDateClass(){
//        assertTrue(flight.getFlightTime() instanceof Date);
//    }


}
