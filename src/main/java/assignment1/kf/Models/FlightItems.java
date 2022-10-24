package assignment1.kf.Models;

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
