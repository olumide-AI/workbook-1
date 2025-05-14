package day02.resturantordersystem;

public class Dessert extends MenuItem{
    //Constructor

    public Dessert(String name, double price, int calories) {
        super(name, price, calories);
    }

    @Override
    public String getDescription(){
        return getName() + " Served cold and sweet";
    }
}
