package day02.resturantordersystem;

public class Drink extends MenuItem{
    //Constructor

    public Drink(String name, double price, int calories) {
        super(name, price, calories);
    }

    @Override
    public String getDescription(){
        return getName() + " Served chill and fizzy";
    }
}
