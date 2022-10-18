package assignment1.kf.Controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import assignment1.kf.Models.HotelItems;


// MainController folder used for handle GET requests to various pages as we continue to add to this 
//application 
@Controller
public class MainController {
    
    // Get request code that will retrieve the hotel booking info page
    @GetMapping("/hotelBookings")
    public String getHotelBookingRoom()
    {
        return "hotelBookings";
    }

    // Request code that will retrieve the add hotel html code then post it to the display page

    ArrayList<HotelItems> hotelItems = new ArrayList<>();


   @RequestMapping(value="/addHotel", method = RequestMethod.GET)
   public String getHotel()
   {
      return "addHotel";
   }


    @RequestMapping(value="/addHotel", method = RequestMethod.POST)
    public String postHotel(
        @RequestParam String roomType,
        @RequestParam Integer numOfGuests,
        Model model
    )

    {
       HotelItems item = new HotelItems(roomType,numOfGuests);
       hotelItems.add(item);
       model.addAttribute("roomType","numOfGuests");
       return "addHotel";
    }
}
