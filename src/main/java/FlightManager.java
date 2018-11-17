import java.util.ArrayList;

public class FlightManager {

    private Flight flight;

    public FlightManager(Flight flight) {
        this.flight = flight;
    }

    public Flight getFlight() {
        return flight;
    }

    public int checkBookedBagWeight(){
        ArrayList<Passenger> passengers = this.flight.getAllPassengers();
        int bagsWeight = 0;
        for(Passenger passenger: passengers){
            int addBags = passenger.getBags() * 20;  //I decided all bags are 20 kg
            bagsWeight += addBags;
        }
        return bagsWeight;
    }

    public int checkRemainingBagWeight(){
        return this.flight.getPlane().getTotalLoadEnum()/2 - this.checkBookedBagWeight();
    }


    public int calcBagMaxPerPerson() {
        int bagSpace = this.flight.getPlane().getTotalLoadEnum()/2;
        int planeCapacity = this.flight.getPlane().getCapacityEnum();
        int weightPerPassenger = bagSpace/planeCapacity;
        int bagsPerPassenger = weightPerPassenger / 20;

        return bagsPerPassenger;
    }

    public void bookFlight(Passenger passenger){
        if(this.flight.getVacantSeats() > 0 && this.calcBagMaxPerPerson() > passenger.getBags()){
            this.flight.getAllPassengers().add(passenger);
            Flight passengerFlightAdd = this.getFlight();
            passenger.setMyFlight(passengerFlightAdd); //not yet working
        }
    }
}
