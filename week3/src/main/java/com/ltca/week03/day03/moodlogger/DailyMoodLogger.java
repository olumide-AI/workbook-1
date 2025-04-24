package com.ltca.week03.day03.moodlogger;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DailyMoodLogger {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        //To - Do
        //Need a helper function to tie in user log method and writing and maybe saving



        //Use a loop to let the user choose between:
        //[1] Log a new mood
        //[2] View past moods
        //[3] Exit
        while (true){
            System.out.println("What would you like to do today? ");
            System.out.println("1 - Log a new mood");
            System.out.println("2 - View past mood");
            System.out.println("3 - Exit");
            System.out.println("Please enter a number (1,2,3)");
            //And exception error to handle wrong input
            //And if number is not 1,2,3 please enter a number 1,2,or3.
            int userChoice = scanner.nextInt();
            scanner.nextLine();

            if (userChoice == 1){
                //log new mood method
            } else if (userChoice == 2) {
                // Previous mood method
            } else if (userChoice == 3) {
                //Exit the loop
                System.out.println("Goodbye");
                break;
            }
            else {
                System.out.println("Invalid option. Please try again.");
            }
        }

    }
    //Ask User how they're feeling
    //Use local date to record date of entry
    //save each entry to a file in the format date: mood
    //User can show mood of previous mood

    //  How do i write without overwriting the file content

    //Log mood method
    public static String logUserMood(Scanner scanner){
        //Ask user what is your mood
        System.out.println("How're you feeling today? ");
        String userMood = scanner.nextLine();
        //Get the date and time of entry
        LocalDate entryDate = LocalDate.now();
        LocalTime entryTime = LocalTime.now();
        //Format date to be used in string using string formatter
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd MMM yyyy");
        String formattedEntryDate = entryDate.format(dateFormatter);
        //Format time entry
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");
        String formattedEntryTime = entryTime.format(timeFormatter);
        //Console Output
        return "On " + formattedEntryDate + "at " + formattedEntryTime + " you logged your feeling: " + userMood;
    }
    //Write mood to a file
    //My only concern will anytime i run it the file gets overwritten
    public static void writeUserMoodToFile(String moodEntry){
        try(FileWriter fileWriter = new FileWriter("moodFile/dailyusermoodfile.txt")){
            fileWriter.write(moodEntry + "\n");
        }
        catch (IOException e){
            System.out.println("Oh no: " + e.getMessage());
        }


    }

}
