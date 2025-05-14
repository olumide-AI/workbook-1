package day02.resturantordersystem;

public class MenuItem {
    //Properties
    private String name;
    private double price;
    private int calories;

    //Constructors


    public MenuItem(String name, double price, int calories) {
        this.name = name;
        this.price = price;
        this.calories = calories;
    }

    //Getters and setters
    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getDescription(){
        return "Item is: " + name;
    }
}
