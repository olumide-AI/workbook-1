package com.ltca.week03.day01.constructor;

public class Car {
    //fields
    private String brand;
    private int year;
    private boolean isElectric;

    //constructors
    public Car(String brand, int year, boolean isElectric) {
        this.brand = brand;
        this.year = year;
        this.isElectric = isElectric;
    }

    //getters and setters
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }
    // method
    public void startEngine(){
        if (isElectric){
            System.out.println("ssssshhhh");
        }
        else {
            System.out.println("vroomvroom");
        }
    }
}
