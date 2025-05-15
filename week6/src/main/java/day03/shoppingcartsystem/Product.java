package day03.shoppingcartsystem;

//Base Case
public class Product {
    //Properties
    String name;
    double price;

    //Constructor
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    //Method
    public double getFinalPrice(){
        return price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
