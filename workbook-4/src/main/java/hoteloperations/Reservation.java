package hoteloperations;

public class Reservation {
    // Reservation class is responsible for storing information related to a guest
    //stay.
    private String roomType;
    private double price;
    private int numberOfNights;
    private boolean weekend;
    private double reservationTotal;

    //Create construtor


    public Reservation(String roomType, double price, int numberOfNights, boolean weekend, double reservationTotal) {
        this.roomType = roomType.toLowerCase();
        this.price = price;
        this.numberOfNights = numberOfNights;
        this.weekend = weekend;
        this.reservationTotal = reservationTotal;
    }

    //Getters and setters

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType.toLowerCase();
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
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

    public double getReservationTotal() {
        return reservationTotal;
    }

    public void setReservationTotal(double reservationTotal) {
        this.reservationTotal = reservationTotal;
    }

    //Method to get price per night basess on room type and weekend
    // Price per night based on room type and weekend
    // Method to get price per night based on room type and weekend
    public double getPrice() {
        double price;

        if (roomType.equalsIgnoreCase("king")) {
            price = 139.00;
        } else if (roomType.equalsIgnoreCase("double")) {
            price = 124.00;
        } else {
            // Fallback for unexpected room types
            System.out.println("Unknown room type: " + roomType);
            return 0.0;
        }

        if (isWeekend) {
            price *= 1.10; // Add 10% weekend surcharge
        }

        return price;
    }

}
}
