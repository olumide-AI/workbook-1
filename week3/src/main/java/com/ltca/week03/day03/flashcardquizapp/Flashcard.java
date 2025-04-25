package com.ltca.week03.day03.flashcardquizapp;

public class Flashcard {
    private String question;
    private String answer;

    public Flashcard(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }
    //getters and setters

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public boolean checkAnswer(String userAnswer) {
        if (getAnswer().equalsIgnoreCase(userAnswer)) {
            System.out.println("Correct");
            return true;
        }
        else {
            System.out.println("Incorrect answer");
            return false;
        }

    }
}