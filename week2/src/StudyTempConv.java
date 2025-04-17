import java.util.Scanner;
public class StudyTempConv {
    // --- conversion methods ---
    public static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static double celsiusToKelvin(double c) {
        return c + 273.15;
    }

    public static double fahrenheitToKelvin(double f) {
        return (f - 32) * 5 / 9 + 273.15;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // --- show menu ---
            System.out.println("\nChoose a conversion direction:");
            System.out.println("1. Celsius ➝ Fahrenheit");
            System.out.println("2. Fahrenheit ➝ Celsius");
            System.out.println("3. Celsius ➝ Kelvin");
            System.out.println("4. Fahrenheit ➝ Kelvin");
            System.out.println("Q. Quit");
            System.out.print("Your choice: ");

            String choice = scanner.nextLine().trim().toUpperCase();

            if (choice.equals("Q")) {
                System.out.println("Goodbye!");
                break;
            }

            double temp;
            System.out.print("Enter the temperature: ");
            try {
                temp = Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
                continue;
            }

            // --- convert and display result ---
            switch (choice) {
                case "1":
                    System.out.printf("%.1f°C = %.1f°F\n", temp, celsiusToFahrenheit(temp));
                    break;
                case "2":
                    System.out.printf("%.1f°F = %.1f°C\n", temp, fahrenheitToCelsius(temp));
                    break;
                case "3":
                    System.out.printf("%.1f°C = %.1fK\n", temp, celsiusToKelvin(temp));
                    break;
                case "4":
                    System.out.printf("%.1f°F = %.1fK\n", temp, fahrenheitToKelvin(temp));
                    break;
                default:
                    System.out.println("Invalid option. Please choose 1, 2, 3, 4, or Q.");
            }
        }

        scanner.close();
    }
}

