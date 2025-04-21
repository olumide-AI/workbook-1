package com.ltca.week03.day01.constructor;

//Basic constructors
public class Book {
    private String title;
    private String author;
    private int pages;

    //Constructor that takes all values
    public Book(String title, String author, int pages){
        this.title = title;
        this.author = author;
        this.pages = pages;
    }
    // second constructor with default values
    public Book (){
        this.title = "Untitled";
        this.author = "Unknown";
        this.pages = 0;

    }
    //Getters and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    // Methods that uses fields
    public void describe() {
        System.out.println("This book is titled " + getTitle() + " by " + getAuthor() + " with " + getPages() + " pages");
    }
}
