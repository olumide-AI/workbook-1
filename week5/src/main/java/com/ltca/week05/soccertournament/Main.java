package com.ltca.week05.soccertournament;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Team teamB = Team.createRandomTeam("maaikeJordans");
//        System.out.println(teamB);
        // Step 1: Create an empty list for teams
        List<Team> tournamentTeams = new ArrayList<>();

        // Step 2: Generate 8 teams with players
        for (int i = 1; i <= 8; i++) {
            // Create team name like "Team 1", "Team 2", etc.
            String teamName = "Team " + i;

            // Use your Utils method to generate 11 random players
            List<Player> players = Utils.genPlayerList();

            // Create a new Team object
            Team team = new Team(teamName, players);

            // Add team to the tournament list
            tournamentTeams.add(team);
        }

        // Step 3: Create the Tournament object
        Tournament myTournament = new Tournament("Champions Cup", tournamentTeams);

        // Step 4: Start the tournament!
        myTournament.startTournament();
    }

}
