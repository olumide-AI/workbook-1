package com.ltca.week03.day01.constructor;

public class Cupcake {
    //Private fields
    private String flavor;
    private int calories;

    //Constructor with logic
    public Cupcake (String flavor, int calories){
        this.flavor = flavor;
        this.calories = calories;
        System.out.println("Created a cupcake: " + flavor +", " + calories + " Kcal");
        //Call is healthy method
        if (isHealthy()){
            System.out.println("It’s healthy. Fyi, this is not health advice.");
        }
        else {
            System.out.println("Not healthy");
        }
    }
    //Getters and setters

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    //Method for is healthy
    /*
        But in this case, we don’t need to, because: calories is already a field (or property) of the object.
        The method isHealthy() is part of the same class, so it has access to that field directly.
        That’s one of the benefits of object-oriented programming (OOP) —
         you give objects data (fields) and behavior (methods), and the behavior can use the data internally.
     */
    public boolean isHealthy(){
        return calories < 200;
        }

}
