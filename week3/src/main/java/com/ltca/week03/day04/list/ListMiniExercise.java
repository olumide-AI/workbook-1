package com.ltca.week03.day04.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListMiniExercise {
    public static void main(String[] args) {
        //favArtist();
        //favNum();

        // Create book instance using list
        List<Book> books = new ArrayList<>();
        books.add(new Book("Psalms", "King David"));
        books.add(new Book("Proverbs", "King Solomon"));
        books.add(new Book("Exodus", "Moses"));

        for(int i = 0; i < books.size(); i++){
            System.out.println(books.get(i).displayBooks());
        }
        System.out.println("------------------------------");

        books.remove(2);
        books.add(new Book("Ephesians", "Apostle Paul"));
        for(int i = 0; i < books.size(); i++){
            System.out.println( books.get(i).getTitle());
            System.out.println(books.get(i).getAuthor() + "\n");
        }

    }
    //Create list of your favorite Artists
    public static void favArtist(){
        List<String> favArtist = new ArrayList<>();
        favArtist.add("Nathaniel Bassey");
        favArtist.add("Dunsin Oyenkan");
        favArtist.add("Jesus Image");

        for(int i =0; i < favArtist.size(); i++){
            System.out.println(favArtist.get(i));
        }
        favArtist.removeFirst();
        //favArtist.remove(1);
        favArtist.add("Hillsong Untd");
        System.out.println();

        for(int i =0; i < favArtist.size(); i++){
            System.out.println(favArtist.get(i));
        }
    }
    // Create a list of your fav numbers
    public static void favNum(){
        List<Integer> favNum = new ArrayList<>();
        favNum.add(1);
        favNum.add(13);
        favNum.add(7);
        favNum.add(3);
        favNum.add(26);
        favNum.add(12);

        for(int i =0; i<favNum.size(); i++){
            System.out.println(favNum.get(i));
        }
        Collections.sort(favNum);
        System.out.println("Sorted Numbers: " + favNum);
        int total = 0;
        for(int i =0; i<favNum.size(); i++){
            total += favNum.get(i);
        }
        System.out.println("Total sum of fav number is: " + total);
    }

}
