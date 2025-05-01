package main.java.exercises.mod1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class BedtimeStories {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Please input file name: ");
       String userFile = scanner.nextLine();
        try{
            //Create new file stream
            FileInputStream fileInputStream = new FileInputStream(userFile);
            //Wrap fileinputstream with scanner to read text line by line
            Scanner fileReader = new Scanner(fileInputStream);

            //like a line counter, starts at one because computer will instead use 0
            int lineNumber= 1;

            //while there's more to read keep reading
            while(fileReader.hasNextLine()){
                String line = fileReader.nextLine();
                System.out.println(lineNumber + " " + line);
                lineNumber++;
            }
            fileReader.close();
        }
        catch (IOException e){
            System.out.println("File not found");
        }
        scanner.close();
    }


}
