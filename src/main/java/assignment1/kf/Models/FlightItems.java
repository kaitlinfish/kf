package assignment1.kf.Models;
// this is the class that initalizes our 2 input variables to book a flight. the flightclass and numOfSeats.
// a constructor is also created, along with getter and setters for the two values.


public class FlightItems {
    String flightClass;
    Integer numOfSeats;



    public FlightItems(String flightClass, Integer numOfSeats) {
        this.flightClass = flightClass;
        this.numOfSeats = numOfSeats;
    }



    public String getFlightClass() {
        return flightClass;
    }



    public Integer getNumOfSeats() {
        return numOfSeats;
    }



    public void setFlightClass(String flightClass) {
        this.flightClass = flightClass;
    }



    public void setNumOfSeats(Integer numOfSeats) {
        this.numOfSeats = numOfSeats;
    }


    
    
}
