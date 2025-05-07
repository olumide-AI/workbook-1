package com.ltca.week05.soccertournament;

import java.util.ArrayList;
import java.util.List;

public class Team {
    // Defining the attributes
    private String name;
    private List<Player>playerList;


    //Constructor for Team

    public Team(String name, List<Player> players) {
        this.name = name;
        this.playerList = players;
    }

    public Team(String name){
        this.name = name;
        this.playerList = new ArrayList<>();
    }

    //Getters Only because we don't want changes to the team by having setters available

    public String getName() {
        return name;
    }

    public List<Player> getPlayers() {
        return playerList;
    }

    //Methods to add player
    /*
        ?- Will it return the list of players or just add to the list ??
        Create a List of teams
        use .add to add players to the team
     */
    public void addPlayers(Player individualPlayer){
        this.playerList.add(individualPlayer);

    }
    public static Team createRandomTeam(String name) {
        List<Player> players = Utils.genPlayerList(); // or Team.genPlayerList()
        return new Team(name, players);
    }


    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                ", playerList=" + playerList +
                '}';
    }
}
