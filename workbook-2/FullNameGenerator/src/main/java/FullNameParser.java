import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
        //scanner load
        Scanner scanner = new Scanner(System.in);
        //Instructions
        System.out.println("Enter name in format (first last) or (first middle last");
        System.out.println("Don't ignore the whitespace thank you");

        String userName = getUserName(scanner, "Please enter you name appropriately: ");

        //No return so we don't need to assign a variable sinceit voiud
        parserFunction(userName);


        //close scanner
        scanner.close();

    }
    public static String getUserName(Scanner scanner, String userNamePrompt){
        System.out.println(userNamePrompt);
        return scanner.nextLine().trim();
    }
    public static void parserFunction(String fullName){
        String[] splits = fullName.split(" ");
        if (splits.length ==2){
            System.out.println("First name is: " + splits[0]);
            System.out.println("Middle name is: (N/A) ");
            System.out.println("Last name is: " + splits[1]);
        }
        if (splits.length == 3){
            System.out.println("First name is: " + splits[0]);
            System.out.println("Middle name is: " + splits[1]);
            System.out.println("Last name is: " + splits[2]);
        }
    }
}
