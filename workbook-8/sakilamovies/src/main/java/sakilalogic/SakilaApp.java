package sakilalogic;

import util.SakilaDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class SakilaApp {
    public static void main(String[] args) {
        if(args.length !=2){
            System.out.println("We need two arguments to access database");
            System.exit(1);
        }

        String username = args[0];
        String password = args[1];

        try(
                Connection connection = SakilaDataSource.getDataSource(username, password).getConnection();
                Scanner scanner = new Scanner(System.in)
                ){
            //Ask user for last name of actor
            System.out.println("Enter the last name of actor of choice");
            String userInput = scanner.nextLine();

            String listOfActorQuery = "SELECT actor_id, first_name, last_name FROM sakila.actor\n" +
                    "WHERE last_name = ?";
            try(
                    PreparedStatement preparedStatement = connection.prepareStatement(listOfActorQuery)
                    ) {
                preparedStatement.setString(1, userInput.toUpperCase());
                try (
                        ResultSet resultSet = preparedStatement.executeQuery()
                ) {
                    boolean found = false;
                    while (resultSet.next()) {
                        found = true;
                        System.out.printf("Actor ID: %d - Actor Full Name: %s %s%n",
                                resultSet.getInt("actor_id"),
                                resultSet.getString("first_name"),
                                resultSet.getString("last_name"));
                    }
                    if (!found) {
                        System.out.println("No actor was found with this last name: " + userInput + " in out database");
                        return;
                    }

                }

            }
            // enter a first name and a last name of an actor they want to see the movies of.
            System.out.println("Enter the actors first name: ");
            String actorFirstName = scanner.nextLine();

            System.out.println("Enter actor last name: ");
            String actorLastName = scanner.nextLine();

            String filmQuery = """
                    SELECT first_name, last_name, title FROM sakila.actor
                    JOIN film_actor
                    ON actor.actor_id = film_actor.actor_id
                    JOIN film
                    ON film_actor.film_id = film.film_id
                    WHERE last_name = ? AND first_name = ?""";

            try(
                    PreparedStatement preparedStatement = connection.prepareStatement(filmQuery)
                    ){
                preparedStatement.setString(1, actorLastName.toUpperCase());
                preparedStatement.setString(2, actorFirstName.toUpperCase());

                try(ResultSet resultSet = preparedStatement.executeQuery()){
                    boolean found = false;
                    while(resultSet.next()) {
                        found = true;
                        System.out.printf("First Name: %s | Last Name: %s | Title: %s%n",
                                resultSet.getString("first_name"),
                                resultSet.getString("last_name"),
                                resultSet.getString("title"));
                    }
                    if (!found){
                        System.out.println("No movies with this last name: " + actorLastName +" and first name: "+ actorFirstName + "found in the database");
                    }

                }



            }

        }
        catch (SQLException e){
            System.out.println("Data base error" + e.getMessage());
        }
    }
}
