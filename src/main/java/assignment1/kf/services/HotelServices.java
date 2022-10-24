package assignment1.kf.services;

import org.springframework.stereotype.Service;

import assignment1.kf.Models.HotelItems;

@Service
public class HotelServices {
    
    public String hotelAdded(HotelItems newHotelItem)
    {
        return "You booked a room for the room type: " + newHotelItem.getRoomType() + "And the number of guests staying with you are" + newHotelItem.getNumOfGuests();
    }
}
