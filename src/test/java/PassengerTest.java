import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void setup(){
        passenger = new Passenger("Leah", 1);
    }

    @Test
    public void passengerHasName(){
        assertEquals("Leah", passenger.getName());
    }

    @Test
    public void passengerHasBags(){
        assertEquals(1, passenger.getBags());
    }

    @Test
    public void passengerHasFlightProperty(){
        assertEquals(null, passenger.getFlight());
    }

}
