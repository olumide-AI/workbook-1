package com.ltca.week03.day02.filewriting;

public class Book {
    private String title;
    private String author;

    //constructor
    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }

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
    //Method for styling
    public String toFileFormat() {
        return title + ";" + author;
    }

    public String toString() {
        return title + " by " + author;
    }


}
