package com.ltca.week05.soccertournament;

import java.util.ArrayList;
import java.util.List;

public class Utils {

    public static void main(String[] args) {

    }
    public static List<Player> genPlayerList (){
        //create an empty list
        List<Player> playerList = new ArrayList<>();
        //Create a string array for 11 players name in the array list
        String[] playerNames = {
                "Paulo", "John", "Ryan", "Maaike", "Faith", "Rodas", "Alex", "Ridwan", "Stan", "Wilmar", "Rosario"
        };
        String[] footballPositions = {"GK", "DF", "MD", "AT"};
        int[] positionCounts = {1,4,3,3};
        int[] positionTracker = {0,0,0,0};
        int jerseyNumber = 1;

        while(playerList.size() < 11){
            int index = (int)(Math.random() * 4);
            if (positionTracker[index] < positionCounts[index]){
                int nameIndex = (int)(Math.random() * playerNames.length);
                String name = playerNames[nameIndex] + jerseyNumber;
                String position = footballPositions[index];
                String number = String.valueOf(jerseyNumber);

                playerList.add(new Player(name, position, number));
                positionTracker[index]++;
                jerseyNumber++;
            }
        }



        return playerList;
    }
}
