package com.ltca.week05.soccertournament;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Paulo", "defender", "2");
        Player player2 = new Player("John", "defender", "2");
        Player player3 = new Player("Maaike", "Midfielder", "2");
        Player player4 = new Player("Alex", "defender", "2");
        Player player5 = new Player("Stan", "defender", "2");
        Player player6 = new Player("Faith", "defender", "2");
        Player player7 = new Player("Rodas", "defender", "2");
        Player player8 = new Player("John", "defender", "2");

        //Generate a number between 1-8
        //Position {goalkepper, defendeer, midfielder, attacker}

        //Team teamJohnOlu = new Team("teamJohnOlu", new ArrayList<>());
        Team teamJohnOlu = new Team("JohnOlu");
        teamJohnOlu.addPlayers(player2);
        teamJohnOlu.addPlayers(player3);
        teamJohnOlu.addPlayers(player1);
        System.out.println(teamJohnOlu);
    }
}
