package day02.resturantordersystem;

public class MainDish extends MenuItem{
    private boolean vegetarian;

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }
    //Constructor

    public MainDish(String name, double price, int calories, boolean vegetarian) {
        super(name, price, calories);
        this.vegetarian = vegetarian;
    }

    @Override
    public String getDescription(){
        return getName() + " served hot and spicy";
    }
}
