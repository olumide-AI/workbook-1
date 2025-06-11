package northwindtraders;

import utils.DataBaseConfig;

import javax.sql.DataSource;
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
        DataSource dataSource = DataBaseConfig.getDataSource(username,password);
        String url = "jdbc:mysql://localhost:3306/northwind";
        boolean running = true;

        try (
                Connection connection = dataSource.getConnection();
                Scanner scanner = new Scanner(System.in)
        ) {
            while (true) {
                System.out.println("\nWhat do you want to do?");
                System.out.println("1) Display all products");
                System.out.println("2) Display all customers");
                System.out.println("3) Display all categories");
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
                    case 3:
                        displayCategories(connection, scanner);
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
    public static void displayCategories(Connection connection, Scanner scanner){
        String sql = "SELECT CategoryID, CategoryName FROM Categories ORDER BY CategoryID";
        try(
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                ResultSet resultSet = preparedStatement.executeQuery()
                ){
            System.out.printf("\n%-5s %-30s%n", "ID", "Category Name");
            System.out.println("-------------------------------------");

            while (resultSet.next()){
                System.out.printf("%-5d %-30s%n",
                        resultSet.getInt("CategoryID"),
                        resultSet.getString("CategoryName"));
            }
            System.out.print("\nEnter the Category ID to view its products: ");
            int userInput = Integer.parseInt(scanner.nextLine());
            String productSql = """
                    SELECT ProductID, ProductName, UnitPrice, UnitsInStock
                                FROM Products
                                WHERE CategoryID = ?
                                ORDER BY ProductID""";
            try(
                    PreparedStatement preparedStatement1 = connection.prepareStatement(productSql)
                    ){
                preparedStatement1.setInt(1, userInput);
                try(ResultSet resultSet1 = preparedStatement1.executeQuery()){
                    System.out.printf("\n%-5s %-30s %-10s %-10s%n", "ID", "Product Name", "Price", "Stock");
                    System.out.println("-------------------------------------------------------------");

                    boolean found = false;
                    while(resultSet1.next()){
                        found = true;
                        System.out.printf("%-5d %-30s $%-9.2f %-10d%n",
                                resultSet1.getInt("ProductID"),
                                resultSet1.getString("ProductName"),
                                resultSet1.getDouble("UnitPrice"),
                                resultSet1.getInt("UnitsInStock"));
                    }
                    if (!found) {
                        System.out.println("No products found in this category.");
                    }

                }

            }


        }
        catch (SQLException e){
            System.out.println("Database error retrieving products categories " + e.getMessage());
        }

    }

}
