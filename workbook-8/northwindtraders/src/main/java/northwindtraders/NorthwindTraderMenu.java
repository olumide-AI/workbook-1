package northwindtraders;

import java.sql.*;
import java.util.Scanner;

public class NorthwindTraderMenu {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("I need 2 params: username and password. ");
            System.exit(1);
        }
        String username = args[0];
        String password = args[1];
        String url = "jdbc:mysql://localhost:3306/northwind";
        boolean running = true;

        try (
                Connection connection = DriverManager.getConnection(url, username, password);
                Scanner scanner = new Scanner(System.in)
        ) {
            while (running) {
                System.out.println("\nWhat do you want to do?");
                System.out.println("1) Display all products");
                System.out.println("2) Display all customers");
                System.out.println("0) Exit");
                System.out.print("Select an option: ");
                int userChoice = Integer.parseInt(scanner.nextLine());
                switch (userChoice) {
                    case 1:
                        displayProducts(connection);
                        break;
                    case 2:
                        displayCustomers(connection);
                        break;
                    case 0:
                        System.out.println("Exiting... Goodbye!");
                        return;
                    default:
                        System.out.println("Invalid option. Please try again.");
                        break;

                }

            }
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }
    public static void displayProducts(Connection connection){
        String sql = "SELECT ProductID, ProductName, UnitPrice, UnitsInStock \n" +
                "FROM Products";
        try(
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                ResultSet resultSet = preparedStatement.executeQuery()
                ){
            // Header
            System.out.printf("%-5s %-30s %-10s %-10s%n", "Id", "Name", "Price", "Stock");
            System.out.println("-------------------------------------------------------------");

            //Display Rows
            while (resultSet.next()){
                System.out.printf("%-5d %-30s $%-9.2f %-10d%n",
                        resultSet.getInt("ProductID"),
                        resultSet.getString("ProductName"),
                        resultSet.getDouble("UnitPrice"),
                        resultSet.getInt("UnitsInStock"));
            }

        }
        catch (SQLException e){
            System.out.println("Database error message " + e.getMessage());
        }
    }
    public static void displayCustomers(Connection connection){
        String sql = "SELECT ContactName, CompanyName, City, Country, Phone\n" +
                " FROM northwind.Customers\n" +
                " ORDER BY Country";
        try(
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                ResultSet resultSet = preparedStatement.executeQuery();
                ){
            //Header
            System.out.printf("\n%-25s %-30s %-15s %-15s %-15s%n",
                    "Contact Name", "Company Name", "City", "Country", "Phone");
            System.out.println("------------------------------------------------------------------------------------------");

            //Display Rows
            while (resultSet.next()){
                System.out.printf("%-25s %-30s %-15s %-15s %-15s%n",
                        resultSet.getString("ContactName"),
                        resultSet.getString("CompanyName"),
                        resultSet.getString("City"),
                        resultSet.getString("Country"),
                        resultSet.getString("Phone"));
            }

        }
        catch (SQLException e){
            System.out.println("Database error" + e.getMessage());
        }
    }
}
