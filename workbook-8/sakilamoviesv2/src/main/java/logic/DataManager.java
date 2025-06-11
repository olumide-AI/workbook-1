package logic;

import model.Actor;
import model.Film;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DataManager {
    private final DataSource dataSource;

    public DataManager(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    //to search for actors by name and return a list or Actors
    public List<Actor> searchActorByLastName(String lastName) throws SQLException {
        String searchActorQuery = "SELECT actor_id, first_name, last_name FROM actor WHERE last_name = ?";
        List<Actor> actorList = new ArrayList<>();

        try(Connection connection = dataSource.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(searchActorQuery)){
            preparedStatement.setString(1,lastName.toUpperCase());

            try(ResultSet resultSet = preparedStatement.executeQuery()){
                while (resultSet.next()){
                    actorList.add(new Actor(
                            resultSet.getInt("actor_id"),
                            resultSet.getString("first_name"),
                            resultSet.getString("last_name")));
                }
            }
        }
        return actorList;
    }

    public List<Film> getFilmsByActorId(int actorId) throws SQLException{
        String searchFilmById = """
                SELECT film.film_id, film.title, film.description, film.release_year, film.length FROM sakila.film
                JOIN film_actor
                ON film.film_id = film_actor.film_id
                JOIN actor
                ON film_actor.film_id = actor.actor_id
                WHERE actor.actor_id = ?""";

        List<Film> filmList = new ArrayList<>();

        try(Connection connection = dataSource.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(searchFilmById)){
            preparedStatement.setInt(1, actorId);

            try(ResultSet resultSet = preparedStatement.executeQuery()){
                while (resultSet.next()){
                    filmList.add(new Film(
                            resultSet.getInt("film_id"),
                            resultSet.getString("title"),
                            resultSet.getString("description"),
                            resultSet.getInt("release_year"),
                            resultSet.getInt("length")
                            ));
                }

            }

        }
        return filmList;

    }
}
