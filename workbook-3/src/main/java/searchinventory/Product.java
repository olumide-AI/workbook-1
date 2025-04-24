package main.java.searchinventory;

public class Product {
    private int id;
    private String name;
    private float price;

    //Constructor
    public Product(int id, String name, float price){
        this.id = id;
        this.name = name;
        this.price = price;
    }
    //Getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    //Method to display inventory
    public String displayInventory(){
        return "The product: " + getName() + " cost: $" + getPrice() + ". Item ID: " +getId();
    }

    public String toFileString(){
        return getId() + "|" + getName() + "|" + getPrice();
    }
}
