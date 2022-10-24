package assignment1.kf.Controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import assignment1.kf.Models.FlightItems;
import assignment1.kf.Models.HotelItems;
import assignment1.kf.services.FlightServices;
import assignment1.kf.services.HotelServices;


// MainController folder used for handle GET requests to various pages as we continue to add to this 
//application 
@Controller
public class MainController {
    
     @Autowired  
     FlightServices flightService;
     @Autowired
     HotelServices hotelService;

     @Autowired
     public MainController(FlightServices flightService, HotelServices hotelService){
      this.flightService = flightService;
      this.hotelService = hotelService;

   
     }



    //get mapping for dlight bookings using flightServices
    @GetMapping("/flightBookings")
    public String displayFlightBookings(@RequestParam String flightClass, Integer numOfSeats, Model model)
    {
       FlightItems flightItems = new FlightItems(flightClass, numOfSeats);
       String message = flightService.flightAdded(flightItems);
       model.addAttribute("message", message);
        return "message";
    }

    // Request code that will retrieve the add hotel html code then post it to the display page

    ArrayList<HotelItems> hotelItems = new ArrayList<>();
    ArrayList<FlightItems> flightItems = new ArrayList<>();

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
       String message = hotelService.hotelAdded(item);
       hotelItems.add(item);
       model.addAttribute("roomType",hotelItems);
       model.addAttribute("message",message);
       return "hotelBookings";
    }





    // flight get and post code 
   @RequestMapping(value="/addFlight", method = RequestMethod.GET)
   public String getFlight()
   {
      return "addFlight";
   }

   @RequestMapping(value="/addFlight", method = RequestMethod.POST)
   public String postFlight(
      @RequestParam String flightClass,
      @RequestParam Integer numOfSeats,
      Model model
   )
   {
      FlightItems item = new FlightItems(flightClass, numOfSeats);
      String message = flightService.flightAdded(item);
      flightItems.add(item);
      model.addAttribute("flightClass", flightItems);
      model.addAttribute("message",message);
      return "flightBookings";
   }
   
}
   
