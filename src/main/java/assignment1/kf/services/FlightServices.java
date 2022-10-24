package assignment1.kf.services;

import org.springframework.stereotype.Service;

import assignment1.kf.Models.FlightItems;

@Service
public class FlightServices {
    
    public String flightAdded(FlightItems newFlightItem)
    {
       return "You've made a flight booking for: " + newFlightItem.getFlightClass() + " And the number of seats booked: " + newFlightItem.getNumOfSeats();
    }
}
