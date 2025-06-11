package logic;

import model.Actor;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DataManager {
    private final DataSource dataSource;

    public DataManager(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    //to search for actors by name and return a list or Actors
    public List<Actor> searchActorByLastName(String lastName){
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
}
