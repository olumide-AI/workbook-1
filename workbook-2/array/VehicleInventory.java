package array;

import java.util.Scanner;

public class VehicleInventory {
    static Vehicle[] vecInventory = new Vehicle[20];
    static int vehicleCounter = 6;
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        preloadInventory();  // Fill array with starting vehicles

        // Main menu loop
        while (true) {
            System.out.println("What do you want to do?");
            System.out.println();
            System.out.println(" 1 - List all vehicles");
            System.out.println(" 2 - Search by make/model");
            System.out.println(" 3 - Search by price range");
            System.out.println(" 4 - Search by color");
            System.out.println(" 5 - Add a vehicle");
            System.out.println(" 6 - Quit");
            System.out.print("Enter your command: ");
            int command = scanner.nextInt();
            scanner.nextLine(); // consume newline

            //
            if (command == 1) {
                listAllVehicles();
            } else if (command == 2) {
                searchByMakeModel();
            } else if (command == 3) {
                searchByPriceRange();
            } else if (command == 4) {
                searchByColor();
            } else if (command == 5) {
                addAVehicle();
            } else if (command == 6) {
                System.out.println("Goodbye!");
                break;  // Exit the loop
            } else {
                System.out.println("Invalid option. Please try again.");
            }

        }
    }
    //Preload 6 vehicles
    public static void preloadInventory() {
        vecInventory[0] = new Vehicle(101121,"Ford Explorer","Red",45000,13500);
        vecInventory[1] = new Vehicle(101122, "Toyota Camry", "Blue", 60000, 11000);
        vecInventory[2] = new Vehicle(101123, "Chevrolet Malibu", "Black", 50000, 9700);
        vecInventory[3] = new Vehicle(101124, "Honda Civic", "White", 70000, 7500);
        vecInventory[4] = new Vehicle(101125, "Subaru Outback", "Green", 55000, 14500);
        vecInventory[5] = new Vehicle(101126, "Jeep Wrangler", "Yellow", 30000, 16000);
    }
    //Option 1 list all vehicles
    public static void listAllVehicles(){
        System.out.println("\n--- Vehicle Inventory ---");
        for (int i = 0; i < vehicleCounter; i++) {
            vecInventory[i].display();
        }
    }
    //Option 2
    // Option 2: Search by make/model (case insensitive)
    public static void searchByMakeModel() {
        System.out.print("Enter make/model to search: ");
        String keyword = scanner.nextLine().toLowerCase();

        boolean found = false;
        for (int i = 0; i < vehicleCounter; i++) {
            if (vecInventory[i].getMakeModel().toLowerCase().contains(keyword)) {
                vecInventory[i].display();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No vehicles matched your search.");
        }
    }
    // Option 3: Search by price range
    public static void searchByPriceRange() {
        System.out.print("Enter min price: ");
        double min = scanner.nextDouble();
        System.out.print("Enter max price: ");
        double max = scanner.nextDouble();
        scanner.nextLine(); // consume newline

        boolean found = false;
        for (int i = 0; i < vehicleCounter; i++) {
            double price = vecInventory[i].getPrice();
            if (price >= min && price <= max) {
                vecInventory[i].display();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No vehicles found in that price range.");
        }
    }
    // Option 4: Search by color
    public static void searchByColor() {
        System.out.print("Enter color to search: ");
        String colorSearch = scanner.nextLine().toLowerCase();

        boolean found = false;
        for (int i = 0; i < vehicleCounter; i++) {
            if (vecInventory[i].getColor().toLowerCase().equals(colorSearch)) {
                vecInventory[i].display();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No vehicles with that color.");
        }
    }

    // Option 5: Add a new vehicle
    public static void addAVehicle() {
        if (vehicleCounter >= vecInventory.length) {
            System.out.println("Inventory full. Cannot add more vehicles.");
            return;
        }

        System.out.print("Enter vehicle ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter make/model: ");
        String makeModel = scanner.nextLine();

        System.out.print("Enter color: ");
        String color = scanner.nextLine();

        System.out.print("Enter odometer reading: ");
        int odo = scanner.nextInt();

        System.out.print("Enter price: ");
        float price = scanner.nextFloat();
        scanner.nextLine(); // consume newline

        Vehicle newVehicle = new Vehicle(id, makeModel, color, odo, price);
        vecInventory[vehicleCounter] = newVehicle;
        vehicleCounter++;

        System.out.println("Vehicle added successfully!");
    }

}
