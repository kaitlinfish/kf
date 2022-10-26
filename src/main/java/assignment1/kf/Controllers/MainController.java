package assignment1.kf.Controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import assignment1.kf.Models.FlightItems;
import assignment1.kf.Models.HotelItems;
import assignment1.kf.services.FlightServices;
import assignment1.kf.services.HotelServices;


// MainController class that will operate All the get and post request methods used throughout the application
@Controller
public class MainController {
    
     @Autowired  
     FlightServices flightService;
     @Autowired
     HotelServices hotelService;

     //maincontroller constructor that injects the flight and hotel services classes
     @Autowired
     public MainController(FlightServices flightService, HotelServices hotelService){
      this.flightService = flightService;
      this.hotelService = hotelService;

   
     }

    // arraylist that initializes the hotelItems and flightItems models into an array
    ArrayList<HotelItems> hotelItems = new ArrayList<>();
    ArrayList<FlightItems> flightItems = new ArrayList<>();


    // requestmapping .GET and .POST code. the .GET will retrieve whatever the user inputted into 
    //the input slots in the addHotel.html page.
    //The .POST code will use requestParam to get whatever the user inputted in input categories roomType and numOfGuests, also
    // initializes a variable of type model
    //creates and initializes a new variable of type HotelItems with parameters roomType and numOfGuests. 
    //Then a variable of type string is initalized to the hotel service and calls the function within the hotelService class,
    //Pointing it to the item variable. The Model variable calls the addAttribute function pointing to the hotelItems array and does 
    // it again down below but points to the message variable
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




     // Same as Hotel .GET and .POST code, requestmapping .GET and .POST code. the .GET will retrieve whatever the user inputted into 
    //the input slots in the addHotel.html page.
    //The .POST code will use requestParam to get whatever the user inputted in input categories flightClasss and numOfSeats, also
    // initializes a variable of type model
    //creates and initializes a new variable of type FlightItems with parameters classType and numOfSeats. 
    //Then a variable of type string is initalized to the flight service and calls the function within the flightService class,
    //Pointing it to the item variable. The Model variable calls the addAttribute function pointing to the flightItems array and does 
    // it again down below but points to the message variable
   
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
   
