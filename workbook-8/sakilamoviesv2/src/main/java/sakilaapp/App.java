package sakilaapp;

import logic.DataManager;
import model.Actor;
import model.Film;
import util.SakilaDataSource;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        if(args.length !=2){
            System.out.println("Two arguments needed");
            return;
        }
        String username = args[0];
        String password = args[1];
        DataSource dataSource = SakilaDataSource.getDataSource(username, password);
        DataManager dataManager = new DataManager(dataSource);

        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Enter the last name of an actor: ");
            String lastName = scanner.nextLine();

            List<Actor> actorList = dataManager.searchActorByLastName(lastName);
            if(actorList.isEmpty()){
                System.out.println("No actors founds");
                return;
            }
            System.out.println("Matching Actors: ");
            for(Actor actor: actorList){
                System.out.println(actor);
            }
            System.out.println("Enter the actor ID to view their films: ");
            int actorId = Integer.parseInt(scanner.nextLine());

            List<Film> filmList = dataManager.getFilmsByActorId(actorId);
            if(filmList.isEmpty()){
                System.out.println("No films found for this actor");
            }
            else{
                System.out.println("Films");
                for(Film film: filmList){
                    System.out.println(film);
                }
            }
        }
        catch (SQLException e){
            System.out.println("Database Error: " + e.getMessage());
        }
    }
}
