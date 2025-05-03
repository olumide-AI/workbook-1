package main.java.exercises.mod3;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class SearchEngineLogger {
    private static final String LOG_FILE = "logs.txt";
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        logAction("launch");

        while (true) {
            System.out.print("Enter a search term (X to exit): ");
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("X")) {
                logAction("exit");
                System.out.println("Exiting...");
                break;
            }

            logAction("search : " + input);
            System.out.println("Searching for: " + input + " (simulated)");
        }

        scanner.close();
    }

    // Logs a line with timestamp and the action
    public static void logAction(String action) {
        String timestamp = LocalDateTime.now().format(FORMATTER);
        try (FileWriter writer = new FileWriter(LOG_FILE, true)) {
            writer.write(timestamp + " " + action + "\n");
        } catch (IOException e) {
            System.out.println("Logging error: " + e.getMessage());
        }
    }
}
