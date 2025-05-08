package hoteloperations;

public class Hotel {
    private String name;
    private int numberOfSuites;
    private int numberOfRooms;
    private int bookedSuites;
    private int bookedBasicRooms;

    //Constructors

    public Hotel(String name, int numberOfSuites, int numberOfRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = 0;
        this.bookedBasicRooms = 0;
    }

    public Hotel(String name, int bookedBasicRooms, int bookedSuites, int numberOfRooms, int numberOfSuites) {
        this.name = name;
        this.bookedBasicRooms = bookedBasicRooms;
        this.bookedSuites = bookedSuites;
        this.numberOfRooms = numberOfRooms;
        this.numberOfSuites = numberOfSuites;

    }

    //Getters only

    public String getName() {
        return name;
    }

    public int getNumberOfSuites() {
        return numberOfSuites;
    }

    public int getBookedSuites() {
        return bookedSuites;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public int getBookedBasicRooms() {
        return bookedBasicRooms;
    }

    //get available suits
    public int getAvailableSuites(){
       return numberOfSuites - bookedSuites;
    }

    //get available rooms
    public int getAvailableRooms(){
        return numberOfRooms - bookedBasicRooms;
    }

    //Methods
    public boolean bookRoom(int numberOfRooms, boolean isSuite){
        if(isSuite){
            if (getAvailableSuites() >= numberOfRooms){
                bookedSuites += numberOfRooms;
                return true;
            }
        }
        else {
            if(getAvailableRooms() >= numberOfRooms){
                bookedBasicRooms += numberOfRooms;
                return true;
            }
        }
        return false;
    }
}
