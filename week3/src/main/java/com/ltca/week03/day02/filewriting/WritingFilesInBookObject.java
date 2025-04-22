package com.ltca.week03.day02.filewriting;
import java.io.FileWriter;
import java.io.IOException;
public class WritingFilesInBookObject {
    public static void main(String[] args) {
        //7. Save an array of Book objects to file
        Book[] books = {
                new Book("Clean code","Robert C. Martin" ),
                new Book("Effective Java", "Joshua Bloch"),
                new Book("Head First Java", "Kathy Sierra")
        };

            try(FileWriter fw = new FileWriter("books.txt")) {
                for (int i = 0; i < books.length; i++){
                    fw.write(books[i] + "\n");
                }
                // end of the try block, invisible close() also when an exception is thrown
            } catch(IOException e) {
                System.out.println("Oh no: " + e.getMessage());
            }

    }

}
