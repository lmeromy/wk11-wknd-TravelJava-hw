import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class FlightManagerTest {

//    calculate how much weight in baggage is booked by passengers for a flight
//    calculate how much overall weight reserved for baggage remains for a flight
//    calculate how much baggage weight should be reserved for each passenger for a flight

//

//    Add a flight property to the Passenger class which is assigned when a Passenger is booked on a flight
//    Add a property 'seat number' to the Passenger class as an integer. Set it to a Random number which is assigned when a Passenger is booked on a flight
//    Make sure the flight doesn't double book the same seat number to more than one passenger

    FlightManager flightManager;
    Flight flight;
    Plane plane;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;

    @Before
    public void setup(){
        plane = new Plane(PlaneType.SEAPLANE);
        flight = new Flight("LM1818", plane, "CDG", "GLA", "13:00");
        flightManager = new FlightManager(flight);
        passenger1 = new Passenger("Asma", 2);
        passenger2 = new Passenger("Leah", 1);
        passenger3 = new Passenger("Anna", 3);
    }

    @Test  // moved from flight class and flight class test
    public void canBookPassengerOnFlight(){
        flightManager.bookFlight(passenger1);
        assertEquals(1, flight.getPassengerCount());
    }

    @Test
    public void passengerFlightUpdatesWhenBooked(){
        flightManager.bookFlight(passenger2);
        assertEquals(PlaneType.SEAPLANE, passenger2.getFlight().getPlane().getType());
    }

    @Test
    public void passengerAssignedSeatWhenFlightBooked(){
        flightManager.bookFlight(passenger1);
        int seat = passenger1.getMySeat();
        // not sure how to test!
//        assertTrue(seat.getClass().equals(seat.class));

    }

//    @Test
//    public void passengerSeatNotDoubleBooked(){
//
//    }

    @Test  // moved from flight class and flight class test
    public void cannotBookPassengerIfFull(){
        flightManager.bookFlight(passenger1);
        flightManager.bookFlight(passenger2);
        flightManager.bookFlight(passenger3);
        assertEquals(2, flight.getPassengerCount());
    }

    @Test
    public void cannotBookPassengerIf2ManyBags(){
        Passenger passenger4 = new Passenger("John",7);
        flightManager.bookFlight(passenger1);
        flightManager.bookFlight(passenger4);
        assertEquals(1, flight.getPassengerCount());
    }

    @Test
    public void canCheckBookedBaggageWeight(){
        flightManager.bookFlight(passenger1);
        flightManager.bookFlight(passenger2);
        assertEquals(60, flightManager.checkBookedBagWeight());
        // 250 for bags total allowed on seaplane, 20 kg/bag
    }

    @Test
    public void canCheckRemainingBagWeight(){
        flightManager.bookFlight(passenger1);
        flightManager.bookFlight(passenger2);
        assertEquals(190, flightManager.checkRemainingBagWeight());
    }

    @Test
    public void canCalcMaxBagsPerPerson(){
        assertEquals(6, flightManager.calcBagMaxPerPerson());
        //assumes bags are always 20kg/person
        // 250 for bags for 2 ppl means each person has max baggage of
        // 125kg/person so 6 bags can fit within 125 kg
    }




}
