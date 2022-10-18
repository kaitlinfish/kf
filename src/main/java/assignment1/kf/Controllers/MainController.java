package assignment1.kf.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


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
}
