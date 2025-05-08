package hoteloperations;

public class Room {
    // Room class is responsible for knowing everything related to a hotel room.
    //A room is only available if it is clean and not currently occupied
    private int numberOfBeds;
    private double price;
    private boolean occupied;
    private boolean dirty;


    //Create constructor

    public Room(int numberOfBeds, boolean dirty, boolean occupied, double price) {
        this.numberOfBeds = numberOfBeds;
        this.dirty = dirty;
        this.occupied = occupied;
        this.price = price;
    }

    //Create getters and setters


    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isDirty() {
        return dirty;
    }

    public void setDirty(boolean dirty) {
        this.dirty = dirty;
    }

    //Actually a method
    public boolean isAvailable() {
        return !isOccupied() && !isDirty();
    }

    //Methods
    //Mark Check in
    public void checkIn(){
       setOccupied(true);
       setDirty(true);
    }
    // Mark check out
    public void checkOut(){
       setOccupied(false);
       cleanRoom();
    }
    //Mark clean Room
    public void cleanRoom(){
        setDirty(false);
    }
}
