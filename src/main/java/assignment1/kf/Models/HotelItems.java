package assignment1.kf.Models;


// this is the class that initalizes our 2 input variables to book a hotel room. the roomType and numOfGuests.
// a constructor is also created, along with getter and setters for the two values.
public class HotelItems {
    String roomType;
    Integer numOfGuests;



    public HotelItems(String roomType, Integer numOfGuests) {
        this.roomType = roomType;
        this.numOfGuests = numOfGuests;
    }



    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }



    public Integer getNumOfGuests() {
        return numOfGuests;
    }



    public void setNumOfGuests(Integer numOfGuests) {
        this.numOfGuests = numOfGuests;
    }

    

}
