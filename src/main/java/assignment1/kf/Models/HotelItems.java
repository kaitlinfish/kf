package assignment1.kf.Models;

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
