package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name");
        String firstName = getInput(scanner, "First name: ");
        String middleName = getInput(scanner, "Middle name: ");
        String lastName = getInput(scanner, "Last name: ");
        String suffix = getInput(scanner, "Suffix: ");

        String fullName = getFullName(firstName, middleName, lastName, suffix);

        displayFullName(fullName);
        scanner.close();



    }
    //Method for getting input from user and removing white spaces
    public static String getInput(Scanner scanner, String userPrompt){
        System.out.println(userPrompt);
        return scanner.nextLine().trim();
    }
    public static String getFullName(String firstName, String middleName, String lastName, String suffix){
        String fullName = firstName;
        if (!middleName.isEmpty()){
            fullName = fullName + " " + middleName;
        }

        fullName = fullName +" "+ lastName;

        if (!suffix.isEmpty()){
            fullName = fullName + ", " + suffix;
        }

        return fullName;
    }

    public static void displayFullName(String fullName){
        System.out.println("Full name: " + fullName);
    }

}
