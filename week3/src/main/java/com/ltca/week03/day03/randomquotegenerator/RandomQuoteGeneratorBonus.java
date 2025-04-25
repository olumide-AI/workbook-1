package com.ltca.week03.day03.randomquotegenerator;
import java.io.*;
import java.util.*;
public class RandomQuoteGeneratorBonus {
    // Reusable Scanner for user input
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String directoryName = "quotes_data";    // Folder to store quotes
        String fileName = "quotes.txt";          // File to read/write quotes

        // Step 1: Setup the file and folder (adds quotes if file doesn't exist)
        initializeQuoteFile(directoryName, fileName);

        // Step 2: Show menu until the user exits
        while (true) {
            System.out.println("\nWhat would you like to do?");
            System.out.println("[1] Show all quotes");
            System.out.println("[2] Show a random quote");
            System.out.println("[3] Add a new quote");
            System.out.println("[4] Exit");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    showAllQuotes(directoryName, fileName);
                    break;
                case "2":
                    showRandomQuote(directoryName, fileName);
                    break;
                case "3":
                    addNewQuote(directoryName, fileName);
                    break;
                case "4":
                    System.out.println("Goodbye! Keep the inspiration going.");
                    return; // exit the program
                default:
                    System.out.println("Invalid option. Please type 1, 2, 3 or 4.");
            }
        }
    }

    // ------------------ Method: Create folder and file, append quotes if needed ------------------

    public static void initializeQuoteFile(String directoryName, String fileName) {
        File directory = new File(directoryName);

        // Create directory if it doesn't exist
        if (!directory.exists()) {
            if (directory.mkdirs()) {
                System.out.println("Created folder: " + directoryName);
            } else {
                System.out.println("Error: Could not create directory.");
                return;
            }
        }

        File quoteFile = new File(directoryName + File.separator + fileName);

        try (FileWriter writer = new FileWriter(quoteFile, true)) {
            // true = append mode (won’t overwrite existing quotes)

            List<String> quotes = getHardcodedQuotes(); // Get quotes from your method

            for (String quote : quotes) {
                writer.write(quote + "\n");
            }

            System.out.println("Initial quotes added to file.");

        } catch (IOException e) {
            System.out.println("Error while creating or writing to file.");
            e.printStackTrace();
        }
    }

    // ------------------ Method: Read all quotes from file ------------------

    public static List<String> loadQuotesFromFile(String directoryName, String fileName) {
        List<String> quotes = new ArrayList<>();
        File quoteFile = new File(directoryName + File.separator + fileName);

        try (BufferedReader reader = new BufferedReader(new FileReader(quoteFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                quotes.add(line.trim());
            }
        } catch (IOException e) {
            System.out.println("Error reading from file.");
            e.printStackTrace();
        }

        return quotes;
    }

    // ------------------ Method: Print all quotes from the file ------------------

    public static void showAllQuotes(String directoryName, String fileName) {
        List<String> quotes = loadQuotesFromFile(directoryName, fileName);

        System.out.println("\n--- All Quotes ---");
        for (String quote : quotes) {
            System.out.println("- " + quote);
        }
    }

    // ------------------ Method: Print one random quote ------------------

    public static void showRandomQuote(String directoryName, String fileName) {
        List<String> quotes = loadQuotesFromFile(directoryName, fileName);

        if (quotes.isEmpty()) {
            System.out.println("No quotes found in the file.");
            return;
        }

        Random random = new Random();
        int randomIndex = random.nextInt(quotes.size());

        System.out.println("\n--- Your Random Quote ---");
        System.out.println(quotes.get(randomIndex));
    }

    // ------------------ Method: Add a new quote to the file ------------------

    public static void addNewQuote(String directoryName, String fileName) {
        System.out.println("Type your new quote:");
        String newQuote = scanner.nextLine().trim();

        if (newQuote.isEmpty()) {
            System.out.println("You entered an empty quote. Try again.");
            return;
        }

        File quoteFile = new File(directoryName + File.separator + fileName);

        try (FileWriter writer = new FileWriter(quoteFile, true)) {
            writer.write(newQuote + "\n");
            System.out.println("Quote added successfully!");
        } catch (IOException e) {
            System.out.println("Error writing new quote to file.");
            e.printStackTrace();
        }
    }

    // ------------------ Method: Return your original hardcoded quote list ------------------

    public static List<String> getHardcodedQuotes() {
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

        return randomQuotes;
    }
}
