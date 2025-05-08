package hoteloperations;

public class Reservation {
    // Reservation class is responsible for storing information related to a guest
    //stay.
    private String roomType;
    private int numberOfNights;
    private boolean weekend;


    //Create construtor


    public Reservation(String roomType, int numberOfNights, boolean weekend) {
        this.roomType = roomType.toLowerCase();
        this.numberOfNights = numberOfNights;
        this.weekend = weekend;
    }

    //Getters and setters

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType.toLowerCase();
    }


    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return weekend;
    }

    public void setWeekend(boolean weekend) {
        this.weekend = weekend;
    }


    public double getPrice(){
        double pricePerNight = 124;
        if(roomType.equalsIgnoreCase("king")) {
            pricePerNight = 139;
        }
        if(isWeekend()){
            pricePerNight *= 1.1;
        }
        return pricePerNight;
    }

    public double getReservationTotal(){
        return numberOfNights * getPrice();
    }
}

