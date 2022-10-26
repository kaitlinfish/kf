package assignment1.kf.services;

import org.springframework.stereotype.Service;

import assignment1.kf.Models.FlightItems;


// Within flight services class is the function flightAdded. it brings in an object of type FlightItems and returns a string message 
// that displays to the flightBookings page after the user hits submit
@Service
public class FlightServices {
    
    public String flightAdded(FlightItems newFlightItem)
    {
       return "You've made a flight booking for: " + newFlightItem.getFlightClass() + ". And the number of seats booked: " + newFlightItem.getNumOfSeats();
    }
}
