package main.java.searchinventory;

import java.io.FileReader;

import java.io.*;
import java.util.*;

public class SearchInventoryMap {
    // Use the product name as the key for easy lookup
    private static Map<String, Product> inventory = new HashMap<>();

    public static void main(String[] args) {
        loadInventory();  // Step 1: load from Inventory.csv

        Scanner scanner = new Scanner(System.in);
        boolean keepSearching = true;

        while (keepSearching) {
            // Step 2: Ask for a product name to search
            System.out.print("Enter product name to search: ");
            String inputName = scanner.nextLine().trim();

            // Step 3: Look up product in map
            Product found = inventory.get(inputName);

            // Step 4: Display result
            if (found != null) {
                System.out.println(found.displayInventory());
            } else {
                System.out.println("Product not found.");
            }

            // Step 5: Ask to continue
            System.out.print("Do you want to search again? (yes/no): ");
            String answer = scanner.nextLine().trim().toLowerCase();
            keepSearching = answer.equals("yes");
        }

        scanner.close();
        System.out.println("Search ended.");
    }

    // Step 6: Load inventory from Inventory.csv
    private static void loadInventory() {
        String fileName = "Inventory.csv";

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;

            while ((line = reader.readLine()) != null) {
                // Assuming format: id|name|price
                String[] parts = line.split("\\|");

                if (parts.length == 3) {
                    int id = Integer.parseInt(parts[0].trim());
                    String name = parts[1].trim();
                    float price = Float.parseFloat(parts[2].trim());

                    Product product = new Product(id, name, price);
                    inventory.put(name, product);  // name used as key
                }
            }

            System.out.println("Inventory loaded successfully.");
        } catch (IOException | NumberFormatException e) {
            System.out.println("Error loading inventory: " + e.getMessage());
        }
    }
}
