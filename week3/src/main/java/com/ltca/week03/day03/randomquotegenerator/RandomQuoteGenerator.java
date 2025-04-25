package com.ltca.week03.day03.randomquotegenerator;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RandomQuoteGenerator {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        while (true){
            System.out.println("Press Enter to see a quote, or type Exit to stop");
            String userInput = scanner.nextLine();
            if (userInput.equalsIgnoreCase("enter")){
                //Display a random quote
                System.out.println(pickRandomQuote(getRandomQuotes()));
            } else if (userInput.equalsIgnoreCase("exit")) {
                System.out.println("Thank you have a good day!");
                break;
            } else{
                System.out.println("Invalid Input! Please type enter or exit");
            }
        }

    }
    public static List<String> getRandomQuotes(){
        List<String> randomQuotes = new ArrayList<>();
        randomQuotes.add("I can do all things through Christ who strengthens me. – Philippians 4:13");
        randomQuotes.add("For I know the plans I have for you, declares the Lord. – Jeremiah 29:11");
        randomQuotes.add("The Lord is my shepherd, I shall not want. – Psalm 23:1");
        randomQuotes.add("Be still, and know that I am God. – Psalm 46:10");
        randomQuotes.add("Love is patient, love is kind. – 1 Corinthians 13:4");
        randomQuotes.add("Trust in the Lord with all your heart. – Proverbs 3:5");
        randomQuotes.add("Do to others as you would have them do to you. – Luke 6:31");
        randomQuotes.add("Let all that you do be done in love. – 1 Corinthians 16:14");
        randomQuotes.add("Even though I walk through the valley of the shadow of death... – Psalm 23:4");
        randomQuotes.add("God is our refuge and strength, an ever-present help in trouble. – Psalm 46:1");
        randomQuotes.add("Cast all your anxiety on Him because He cares for you. – 1 Peter 5:7");
        randomQuotes.add("With man this is impossible, but with God all things are possible. – Matthew 19:26");
        randomQuotes.add("Blessed are the peacemakers. – Matthew 5:9");
        randomQuotes.add("The steadfast love of the Lord never ceases. – Lamentations 3:22");
        randomQuotes.add("Therefore do not worry about tomorrow. – Matthew 6:34");
        randomQuotes.add("For we live by faith, not by sight. – 2 Corinthians 5:7");
        randomQuotes.add("Your word is a lamp to my feet and a light to my path. – Psalm 119:105");
        randomQuotes.add("Create in me a clean heart, O God. – Psalm 51:10");
        randomQuotes.add("Let everything that has breath praise the Lord. – Psalm 150:6");
        randomQuotes.add("Be strong and courageous. Do not be afraid. – Joshua 1:9");
        return  randomQuotes;
    }
    public static String pickRandomQuote(List<String> quotes){
        Random random = new Random();
        int specificIndex = random.nextInt(quotes.size());
        return quotes.get(specificIndex);
    }
    public static void initializeQuoteFile(String directoryName, String fileName) {
        // Step 1: Create the directory if it doesn't exist
        File directory = new File(directoryName);
        if (!directory.exists()) {
            boolean dirCreated = directory.mkdirs(); // Create all parent directories if needed
            if (dirCreated) {
                System.out.println("Directory '" + directoryName + "' created.");
            } else {
                System.out.println("Failed to create directory.");
                return; // Exit early if directory creation failed
            }
        }

        // Step 2: Prepare the full file path
        File quoteFile = new File(directoryName + File.separator + fileName);

        try (FileWriter writer = new FileWriter(quoteFile, true)) {
            // 'true' = append mode, so it doesn't erase the file each time

            List<String> quotes = getRandomQuotes(); // Get your hardcoded list

            // Step 3: Write each quote into the file if it's not already there
            for (String quote : quotes) {
                writer.write(quote + "\n"); // Add a newline after each quote
            }

            System.out.println("Quotes added to: " + quoteFile.getAbsolutePath());

        } catch (IOException e) {
            // Step 4: Handle any errors during file writing
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}
