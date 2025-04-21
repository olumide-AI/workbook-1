package com.ltca.week03.day01;

import java.sql.SQLOutput;

public class Person {
    private String name;
    private int age;
    private String favoriteColor;
    private double height;
    private boolean hasCar;
    private double weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  int getAge(){
        return age;
    }

    public void setAge(int age){
         this.age = age;
    }

    public String getFavoriteColor() {
        return favoriteColor;
    }

    public void setFavoriteColor(String favoriteColor) {
        this.favoriteColor = favoriteColor;
    }

    public boolean isHasCar() {
        return hasCar;
    }

    public void setHasCar(boolean hasCar) {
        if (hasCar == true){
            System.out.println(getName() + "can make the commute");
        }
        else{
            System.out.println(getName() + "can't make them commute ");
        }
        this.hasCar = hasCar;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight > 300) {
            System.out.println("Person is overweight");
        }
        this.weight = weight;
    }

    // Methods
    public  void read(){
        System.out.println(this.name + " book has 20 pages in it ");
    }

}
