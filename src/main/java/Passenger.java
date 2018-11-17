import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Passenger {

    private String name;
    private int bags;
    private Flight myFlight;
    private int mySeat;

    //Add a flight property to the Passenger class which is assigned when a Passenger is booked on a flight
//    Add a property 'seat number' to the Passenger class as an integer. Set it to a Random number which is assigned when a Passenger is booked on a flight
//


    public Passenger(String name, int bags) {
        this.name = name;
        this.bags = bags;
        this.myFlight = null;
        this.mySeat = 0;
    }

    public String getName() {
        return name;
    }

    public int getBags() {
        return bags;
    }

    public Flight getFlight() {
        return myFlight;
    }

    public void setMyFlight(Flight myFlight) {
        this.myFlight = myFlight;
    }

    public int getMySeat() {
        return mySeat;
    }

    public void setMySeat(int mySeat) {
        this.mySeat = mySeat;
    }
}
