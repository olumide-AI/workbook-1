package com.ltca.week03.day01.loopsandarrays;

public class LoopsAndArrayExerciseLevelThree {
    public static void main(String[] args) {
        // create an array of 3 books and use a loop to print each book's title.
        Book[] arrayBooks = {new Book("java","maaike" , 1000),
                new Book("python", "evan", 301),
                new Book("javascript", "ivan", 299)};

        for(int i =0; i<arrayBooks.length;i++){
            System.out.println(arrayBooks[i].getTitle());
        }

        //14. Count books by a certain author
        int counter = 0;
        for (int i=0; i<arrayBooks.length;i++){
            if (arrayBooks[i].getAuthor().equalsIgnoreCase("maaike")){
                counter ++;
            }
        }
        System.out.println("Maaike has written " + counter + " books");

        // 15. Print books with more than X pages
        //Loop through a Book[] and print the titles of books that have more than 300 pages.
        for (int i =0; i<arrayBooks.length;i++){
            if (arrayBooks[i].getPages()>300){
                System.out.println(arrayBooks[i].getAuthor() + " has written a book of over 300 pages");
            }
        }

    }
}
