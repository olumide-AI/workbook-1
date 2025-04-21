package com.ltca.week03.day01.constructor;

public class Person {
    private String name;
    private int age;

    //Constructors
    public Person ( String name, int age){
        if (age <0){
            age = 0;
            System.out.println("Age can't be below o");
        }
        this.name = name;
        this.age = age;
        System.out.println("Created Person: " + this.name + ", Age: " + this.age);
    }

    //Getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
