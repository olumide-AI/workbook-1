package main.java.searchinventory;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StoreApp {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //Display inventory to console
        List<Product> inventory = getInventory();
        System.out.println("Here is our inventory list: ");
        for (int i = 0; i < inventory.size(); i++) {
            System.out.println(inventory.get(i).displayInventory());
        }

        //Write inventory to file
        List<Product> addInventory = getInventory();
        writeDataToFile(addInventory);

    }

    public static List<Product> getInventory() {
        List<Product> inventory = new ArrayList<>();
        inventory.add(new Product(1, "Kid's Chair", 20));
        inventory.add(new Product(2, "Center Table", 30));
        inventory.add(new Product(3, "Living Room Sofa", 700));
        inventory.add(new Product(4, "Office Chair", 100));
        inventory.add(new Product(5, "Dinning Room Table", 900));

        return inventory;
    }

    public static void writeDataToFile(List<Product> entry) {
        try (FileWriter fileWriter = new FileWriter("inventoryFile/inventory.csv", true)) {
            for (int i = 0; i < entry.size(); i++) {
                fileWriter.write(entry.get(i).toFileString() + "\n");
            }
        } catch (IOException e) {
            System.out.println("Oh no: " + e.getMessage());
        }
    }

    public static void readInventoryFile(){
        //Sort the Product
        //Empty List Product
        List<Product> inventory = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("inventoryFile/inventory.csv"))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] splitedParts = line.split("\\|");
                if (splitedParts.length == 3) {
                    //Parse the Splitted parts
                    int idPart = Integer.parseInt(splitedParts[0].trim());
                    String namePart = splitedParts[1].trim();
                    float pricePart = Float.parseFloat(splitedParts[2].trim());
                    //Create a product object
                    Product product = new Product(idPart, namePart, pricePart);
                    //Add the product to the list
                    inventory.add(product);
                }
            }
        } catch (Exception e) {
            System.out.println("Problem: " + e.getMessage());
        }
        //Sort the products using collections
        //Online i found in google sort by usinf lambda expressions
        inventory.sort((p1,p2) -> p1.getName().compareToIgnoreCase(p2.getName()));

        //Loop over the problems and use display inventory method in class file
        for (int i =0; i<inventory.size(); i++){
            System.out.println(inventory.get(i).displayInventory());
        }
    }
}
