package com.ltca.week03.day01.constructor;

public class Planet {
    private final String name;
    private final double size;

    public Planet (String name, double size){
        this.name = name;
        this.size = size;
    }
    //Can only do getters
    public String getName() {
        return name;
    }

    public double getSize() {
        return size;
    }

}
