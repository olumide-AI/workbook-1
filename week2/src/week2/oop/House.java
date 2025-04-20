package week2.oop;

public class House {
    String color;
    String houseStyle;
    int noOfRooms;
    int noOfRestroom;
    int noOfWindows;
    String dateBuilt;
    String nameOfOwner;
    boolean isHouseHaunted;


    public void painting(){
        System.out.println(nameOfOwner + " has painted the house " + color);
    }

    public String getNewColor(String newColor){
        this.color = newColor;
        return newColor;
    }

}
