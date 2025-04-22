package com.ltca.week03.day01.constructor;

public class House {
    Room roomOne;

    public House(Room roomOne){
        this.roomOne = roomOne;
    }

    public Room getRoomOne() {
        return roomOne;
    }

    public void setRoomOne(Room roomOne) {
        this.roomOne = roomOne;
    }
    public void describe() {
        System.out.println("This house has a room called: " + roomOne.name);
    }
}


