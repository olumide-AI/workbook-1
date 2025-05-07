package com.ltca.week05.soccertournament;

import java.util.ArrayList;
import java.util.List;

public class Tournament {
    private String name;
    private List<Team> teams;
    private List<Round> rounds;
    private Team winner;

    //constructor

    public Tournament(String name, List<Team> teams) {
        this.name = name;
        this.teams = teams;
        this.rounds = new ArrayList<>();
    }

    //Method to run full tournament
    public void startTournament(){
        System.out.println("Starting tournament: " + name);
        System.out.println();

        //Round 1:
        // Round 1: Quarterfinals with 8 teams
        List<Match> quarterMatches = makeMatches(teams); // pair 8 teams into 4 matches
        Round quarterFinals = new Round(quarterMatches); // create round object
        List<Team> quarterWinners = quarterFinals.playRound(); // play it
        rounds.add(quarterFinals); // save the round

        // Round 2: Semifinals with 4 winners
        List<Match> semiMatches = makeMatches(quarterWinners);
        Round semiFinals = new Round(semiMatches);
        List<Team> semiWinners = semiFinals.playRound();
        rounds.add(semiFinals);

        // Round 3: Final with 2 winners
        List<Match> finalMatchList = makeMatches(semiWinners);
        Round finalRound = new Round(finalMatchList);
        List<Team> finalWinners = finalRound.playRound();
        rounds.add(finalRound);

        // Get the one remaining team as champion
        winner = finalWinners.get(0);

        // Print the final result
        System.out.println(" The winner of the tournament is: " + winner.getName());
    }

    // This helper method pairs up teams into matches (2 per match)
    private List<Match> makeMatches(List<Team> teamList) {
        List<Match> matches = new ArrayList<>();

        // Loop through the list in steps of 2
        for (int i = 0; i < teamList.size(); i += 2) {
            Team team1 = teamList.get(i);
            Team team2 = teamList.get(i + 1);
            matches.add(new Match(team1, team2)); // make a match with those 2
        }

        return matches;
    }

}
