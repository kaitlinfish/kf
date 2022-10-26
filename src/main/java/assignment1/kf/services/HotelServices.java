package assignment1.kf.services;

import org.springframework.stereotype.Service;

import assignment1.kf.Models.HotelItems;

// Within hotel services class is the function hotelAdded. it brings in an object of type HotelItems and returns a string message 
// that displays to the hotelBookings page after the user hits submit
@Service
public class HotelServices {
    
    public String hotelAdded(HotelItems newHotelItem)
    {
        return "You booked a room for the room type: " + newHotelItem.getRoomType() + "And the number of guests staying with you are" + newHotelItem.getNumOfGuests();
    }
}
