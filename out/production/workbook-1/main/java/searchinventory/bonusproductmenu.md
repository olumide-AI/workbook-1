public static void main(String[] args) {
List<Product> inventory = readInventoryFromFile();

    while (true) {
        System.out.println("\nWhat do you want to do?");
        System.out.println("1 - List all products");
        System.out.println("2 - Lookup a product by its ID");
        System.out.println("3 - Find all products within a price range");
        System.out.println("4 - Add a new product");
        System.out.println("5 - Quit the application");
        System.out.print("Enter command: ");

        int choice = scanner.nextInt();
        scanner.nextLine(); // clear the newline

        if (choice == 1) {
            // list all products
            for (int i = 0; i < inventory.size(); i++) {
                System.out.println(inventory.get(i).displayInventory());
            }

        } else if (choice == 2) {
            // lookup by id
            System.out.print("Enter product ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            boolean found = false;
            for (Product product : inventory) {
                if (product.getId() == id) {
                    System.out.println(product.displayInventory());
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Product with ID " + id + " not found.");
            }

        } else if (choice == 3) {
            // find within price range
            System.out.print("Enter minimum price: ");
            float min = scanner.nextFloat();
            System.out.print("Enter maximum price: ");
            float max = scanner.nextFloat();
            scanner.nextLine();

            boolean anyFound = false;
            for (Product product : inventory) {
                if (product.getPrice() >= min && product.getPrice() <= max) {
                    System.out.println(product.displayInventory());
                    anyFound = true;
                }
            }
            if (!anyFound) {
                System.out.println("No products found in that price range.");
            }

        } else if (choice == 4) {
            // add a new product
            System.out.print("Enter new product ID: ");
            int newId = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter new product name: ");
            String newName = scanner.nextLine();
            System.out.print("Enter new product price: ");
            float newPrice = scanner.nextFloat();
            scanner.nextLine();

            Product newProduct = new Product(newId, newName, newPrice);
            inventory.add(newProduct);
            writeDataToFile(List.of(newProduct));
            System.out.println("Product added!");

        } else if (choice == 5) {
            System.out.println("Exiting. Goodbye!");
            break;

        } else {
            System.out.println("Invalid input. Please try again.");
        }
    }
}
