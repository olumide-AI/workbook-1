package com.ltca.week05.soccertournament;

public class Match {
    private Team team1;
    private Team team2;
    private Team winner;

    //constructor

    public Match(Team team1, Team team2) {
        this.team1 = team1;
        this.team2 = team2;
    }

    //Method for play
    public void play() {
        double randomValue = Math.random();
        if(randomValue < 0.5){
            winner = team1;
        }
        else {
            winner = team2;
        }
        System.out.println("Match: " + team1.getName() + " vs " + team2.getName());
        System.out.println("Winner: " + winner.getName());
    }

    //Getters


    public Team getTeam1() {
        return team1;
    }

    public Team getTeam2() {
        return team2;
    }

    public Team getWinner() {
        return winner;
    }
}
