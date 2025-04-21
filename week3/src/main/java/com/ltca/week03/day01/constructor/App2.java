package com.ltca.week03.day01.constructor;

public class App2 {
    public static void main(String[] args) {
        //Create first book
        Book bookOne = new Book("the day of the boss", "Preston", 200);

        //Create second book
        Book bookTwo = new Book("Jesus has come", "John", 365);

        //Create third book
        Book bookThree = new Book("Love of family", "Rosario", 500);

        //Create book with no argument
        Book bookFour = new Book();

        //Call describe method
        bookOne.describe();
        bookTwo.describe();
        bookThree.describe();
        bookFour.describe();
    }
}
