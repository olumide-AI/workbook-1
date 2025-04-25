package com.ltca.week03.day03.flashcardquizapp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainFlashcard {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        //Call flashcard list
        List<Flashcard> callFlashcards = flashcardList();
        int correctAnswer = 0;
        boolean trackAnswer = false;
        for (int i = 0; i < callFlashcards.size(); i++) {
            System.out.println(callFlashcards.get(i).getQuestion());
            String userAnswer = scanner.nextLine();
            trackAnswer = callFlashcards.get(i).checkAnswer(userAnswer);
            if (trackAnswer == true){
                correctAnswer ++;
            }
        }
        //Find the length
        int totalQuestion = callFlashcards.size();
        // Find the percentage correct
        float percentageCorrect = ((float) correctAnswer /totalQuestion)*100;
        System.out.println("Total questions: " + totalQuestion);
        System.out.println("Correct answers: " + correctAnswer);
        System.out.println("Percentage correct: " + percentageCorrect + "%");


    }
    //initalize new flashcards
    public static List<Flashcard> flashcardList(){
        List<Flashcard> flashcards = new ArrayList<>();
        flashcards.add(new Flashcard("What is the largest Ocean", "Pacific"));
        flashcards.add(new Flashcard("What is the biggest Mountain", "Mount Everest"));
        flashcards.add(new Flashcard("What is the largest Derset", "Sahara Desert"));
        return flashcards;
    }
}
