package com.ltca.week03.day02.filewriting;

import java.io.*;
import java.util.Scanner;

public class FileExerciseLevelOne {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        //singleLineToFile();
        //readThatLineBack();
        //multipleLineArray();
        //readFileLineByLine();
        //askUserForLine( scanner);
        //saveUserLinesToFile("user_input.txt", 3);
        //countWords( scanner);


    }
    public static void singleLineToFile (){
        //Create a file named output.txt and write:
        //"Hello, file world!"
        FileWriter writer = null;
        try{
            writer = new FileWriter("output.txt");
            writer.write("Hello, file world!");
        }
        catch (IOException e){
            System.out.println("Some issues:" + e.getMessage());
            //e.printStackTrace();
        }
        finally {
            if(writer != null){
                try{
                    writer.close();
                }
                catch (IOException e){
                    throw new RuntimeException(e);
                }
            }
        }
    }
    //2. Read that line back
    public static void readThatLineBack(){
        //Read from output.txt and print the line to the console.
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("output.txt"))){
            String line;
            while((line = bufferedReader.readLine()) !=null){
                System.out.println(line);
            }
        }
        catch (IOException e){
            System.out.println("Problem is: " + e.getMessage());
        }
    }

    // 3.Write multiple lines from an array
    public static void multipleLineArray(){
        //Create a String[] with lines of text like a short poem.
        //Write all lines to a file, one per line.
        String[] firstLine = {"The boy is playing", "The girl is dancing"};
        try(FileWriter fileWriter = new FileWriter("stringarray.txt")){
            for (int i = 0; i<firstLine.length; i++){
                fileWriter.write(firstLine[i]+"\n");
            }

        } catch (IOException e){
            System.out.println("error: " + e.getMessage());
        }

    }
    // 4. Read file line-by-line and print
    public static void readFileLineByLine(){
        // Use BufferedReader to read your poem back, line by line.
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("stringarray.txt"))){
            String line;
            while((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
        }
        catch (IOException e){
            System.out.println("Problem: " + e.getMessage());
        }
    }
    // 5. Ask the user for lines and save to a file
    public static void askUserForLine(Scanner scanner){
        //Use Scanner to let the user type 3 lines.
        //Write each line to a file.
        System.out.println("Input first lines: ");
        String firstLine = scanner.nextLine();
        System.out.println("Input second lines: ");
        String secondLine = scanner.nextLine();
        System.out.println("Input third lines: ");
        String thirdLine = scanner.nextLine();
        try(FileWriter fw = new FileWriter("userinput.txt")) {
            fw.write(firstLine + "\n");
            fw.write(secondLine + "\n");
            fw.write(thirdLine + "\n");
            // end of the try block, invisible close() also when an exception is thrown
        } catch(IOException e) {
            System.out.println("Oh no: " + e.getMessage());
        }
    }
    //5b
    // Method to ask user for `lineCount` lines and write them to `filename`
//    public static void saveUserLinesToFile(Scanner scanner, String filename, int lineCount) {
//        try {
//            FileWriter writer = new FileWriter(filename);
//
//            for (int i = 1; i <= lineCount; i++) {
//                System.out.print("Enter line " + i + ": ");
//                String line = scanner.nextLine();
//                writer.write(line + "\n");
//            }
//
//            writer.close();
//            System.out.println(" Your lines were saved to " + filename);
//
//        } catch (IOException e) {
//            System.out.println("Error writing to file.");
//            e.printStackTrace();
//        }
    // 6. Count how many times a word appears
    public static void countWords(Scanner scanner){
        System.out.println("Input a word:");
        String userWord = scanner.nextLine();
        int count = 0;

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("stringarray.txt"))) {
            String line;
            while((line = bufferedReader.readLine()) != null) {
                //Perform code in here
                //Can't us (" ") we have to split with (\\"w+"), split based on words
                String[] splitWords = line.toLowerCase().split("\\W+");
                for (int i =0; i < splitWords.length; i++ ){
                    if (splitWords[i].equals(userWord)){
                        count ++;
                    }
                }

            }
        } catch(IOException e) {
            System.out.println("Problem: " + e.getMessage());
        }
        System.out.println("The word \"" + userWord + "\" appeared " + count + " times.");


    }

}
