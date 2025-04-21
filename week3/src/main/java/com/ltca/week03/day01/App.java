package com.ltca.week03.day01;

public class App {
    public static void main(String[] args) {
        //Person 1
        Person p = new Person();
        p.setName("Alex") ;
        p.setAge(-5); // uh-oh!
        p.setFavoriteColor(null);

        System.out.println(p.getName() + " is " + p.getAge() + " years old and loves " + p.getFavoriteColor());

        //Person 2
        Person peter = new Person();
        peter.setAge(22);
        peter.setName("Peter Mahn");
        peter.setFavoriteColor("green");
        peter.setWeight(150);
        peter.setHeight(160);
        peter.setHasCar(true);
        peter.read();
        System.out.println(peter.getName() + " is " + peter.getHeight() + "cm tall");
        System.out.println(peter.getName() + " is " + peter.getWeight() + "lbs");
        System.out.println(peter.getName() + " favorite color is  " + peter.getFavoriteColor() + "cm tall");

        //Book Class
        Book myBook = new Book();
        myBook.setTitle("How to Train Your Java");
        myBook.setAuthor("Maaike van Putten");
        myBook.setPages(120);

        System.out.println("Title: " + myBook.getTitle());
        System.out.println("Author: " + myBook.getAuthor());
        System.out.println("Pages: " + myBook.getPages());
    }
}
