import java.util.Scanner;

public class TempreatureConverterMaiikeExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String celsiusOrFah = userPrompt(scanner);
        double userTemp = getTemperature(scanner);
        double convertedTemp = convertTemp(celsiusOrFah, userTemp);
        disTemp(celsiusOrFah, userTemp, convertedTemp);
    }
    /*
        Ask user if they want to convert celsius to fahrenhi or f to c
        ask for the temp
        convert
        display result
        *maybe converting back and forth to kelvin
        *add a loop to try again
     */
    public static String userPrompt(Scanner scanner){
        System.out.println("Would you like to convert celsius to fahrenheit or fahrenheit to celsius ");
        System.out.println("Input c to convert fahrenheit to celsius and f to convert celsius to fahrenheit");
        return scanner.nextLine();
    }
    public static double getTemperature(Scanner scanner){
        System.out.println();
        System.out.println("Input your temperature: ");
        return scanner.nextDouble();
    }

    public static double convertTemp(String userCorF, double userTemp){
        if (userCorF.equalsIgnoreCase("c")){
            //means convert fahrenheit to celsius
            return (userTemp - 32)*((double) 5 /9);
        }
        else if (userCorF.equalsIgnoreCase("f")){
            //means convert celsius to fahrenheit
            return (userTemp * (9.0/5.0) + 32 );
        }
        else{
            System.out.println("can't convert");
        }
        return userTemp;
    }

    public static void disTemp(String userCorF, double usertemp, double convertedTemp){
        if (userCorF.equalsIgnoreCase("c")) {
            System.out.printf("%.1f fahrenheit is %.1f in celsius ", usertemp, convertedTemp);
        }
        else if (userCorF.equalsIgnoreCase("f")){
            System.out.printf("%.1f celsius is %.1f in fahrenheit ", usertemp, convertedTemp);
        }
    }
}
