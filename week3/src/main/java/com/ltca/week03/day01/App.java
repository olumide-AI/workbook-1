package com.ltca.week03.day01;

public class App {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "Alex";
        p.age = -5; // uh-oh!
        p.favoriteColor = null;

        System.out.println(p.name + " is " + p.age + " years old and loves " + p.favoriteColor);
    }
}
