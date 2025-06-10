package northwindtraders;

import java.sql.*;

public class NorthwindTrader {
    public static void main(String[] args) {
        if(args.length != 2) {
            System.out.println("I need 2 params: username and password.");
            System.exit(1);
        }
        String url = "jdbc:mysql://localhost:3306/northwind";
        String username = args[0];
        String password = args[1];
        String sql = "SELECT ProductID, ProductName, UnitPrice, UnitsInStock FROM Products";

        try(
            Connection connection = DriverManager.getConnection(url, username, password);
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery()
        ){

            // Print headers
            System.out.printf("%-5s %-30s %-10s %-10s%n", "Id", "Name", "Price", "Stock");
            System.out.println("-------------------------------------------------------------");

            //Print rows
            while(resultSet.next()){
                int id = resultSet.getInt("ProductID");
                String name = resultSet.getString("ProductName");
                double price = resultSet.getDouble("UnitPrice");
                int stock = resultSet.getInt("UnitsInStock");

                System.out.printf("%-5d %-30s $%-9.2f %-10d%n", id, name, price, stock);
            }


        }
        catch (SQLException e){
            System.out.println("Database error: " + e.getMessage());
        }
    }
}
