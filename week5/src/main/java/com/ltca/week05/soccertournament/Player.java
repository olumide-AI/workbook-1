package com.ltca.week05.soccertournament;

public class Player {
    //Attributes
    private String name;
    private String position;
    private String number;

    //Constructors initalizing all fields

    public Player(String name, String position, String number) {
        this.name = name;
        this.position = position;
        this.number = number;
    }

    //Get my getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", number='" + number + '\'' +
                '}';
    }

    //Method to return 11 mew players for a team
    //Goal keppers should only be one per team
    //Defender should HAVE 4
    // midfilder should have 3
    //attacker should have 3
    //Auto generate  numbers for numbers
    //HAVE A COUNTER FOR POSITIONS

}
