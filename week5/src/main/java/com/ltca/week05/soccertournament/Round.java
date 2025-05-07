package com.ltca.week05.soccertournament;

import java.util.ArrayList;
import java.util.List;

public class Round {
    private List<Match> matches;

    //Constructor
    public Round(List<Match> matches) {
        this.matches = matches;
    }
    //Method to play all matches in the round
    public List<Team> playRound(){
        System.out.println("=== Starting Round ===");
        //Empty list to collect the winners
        List<Team> winners = new ArrayList<>();
        for (Match match: matches){
            //Play match
            match.play();
            //get the winner
            Team winner = match.getWinner();
            winners.add(winner);
        }
        System.out.println("=== Round Complete ===\n");
        return winners;
    }



    
}
