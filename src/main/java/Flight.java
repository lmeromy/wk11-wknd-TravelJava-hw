import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Flight {

    private String flightNum;
    private ArrayList<Passenger> manifest;
    private Plane plane;
    private String destination;
    private String origin;
    private String time;
//    private Date date;
//    private int year;
//    private int month;
//    private int day;



    //    Refactor the Flight's departure time to use the Date class (HINT: Look into Type Migration in IntelliJ to refactor faster)

    public Flight(String flightNum, Plane plane, String destination, String origin, String time) {
        this.flightNum = flightNum;
        this.plane = plane;
        this.destination = destination;
        this.origin = origin;
        this.time = time;
//        Date date = new Date(int year, int month, int day);
        this.manifest = new ArrayList<Passenger>();
    }


    public int getPassengerCount() {
        return this.manifest.size();
    }

    public int getVacantSeats(){
        return this.plane.getCapacityEnum() - this.getPassengerCount();
    }

    public ArrayList<Passenger> getAllPassengers(){
        return this.manifest;
    }

    public Plane getPlane() {
        return plane;
    }

//    public Date getFlightTime(){
//        return this.date;
//    }
}
