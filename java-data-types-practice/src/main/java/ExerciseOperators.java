public class ExerciseOperators {
    public static void main(String[] args) {
        //1. Create 3 variables an int, double, char and print them
        int num = 5;
        double decimalNum = 5.8;
        char letterS = 's';
        System.out.println(num + " " + decimalNum + " " + letterS );

        //2. Add two int variables and print the result.
        int num2 = 6;
        int sumOfNum = num + num2;
        System.out.println(sumOfNum);

        // 3. Divide an int by another int and print the result.
        int num3 = 10;
        int divOfNum = num3 / num;
        System.out.println(divOfNum);

        // 4. Divide an int by a double and print the result. What data type is the result?
        double num4 = 12.0;
        double doubleDivision = num4 / num2;
        System.out.println(doubleDivision);

        // 5. Store your age in an int. Calculate and print: "In 10 years I will be: ..."
        int age = 25;
        int inTenYears = age + 10;
        System.out.println("in ten years i will be: " + inTenYears);

        // 6. Create a byte with value 100. Add 28 to it and store it in an int. Print it.
        byte byteValue = 100;
        //int calcByte = (int) byteValue + 28;
        int calcByte = (byte) (byteValue + 28);
        System.out.println(calcByte);

        //7. Create a double with value 5.7. Cast it to int and print both
        double num5 = 5.7;
        System.out.println(num5);
        int castedDouble = (int) num5;
        System.out.println(castedDouble);

        // 8. Multiply a float and an int. Store the result in a double. Print it
        float numSix = 0.89f;
        double floatTimesInt = numSix * num3;
        System.out.println(floatTimesInt);

        // 9. Store a char 'A' in a variable. Add 1 to it and print the result. (What happens?)
        char letterA = 'A';
        System.out.println(letterA + 1);  // I think it uses A ascii number calculation
        System.out.println(++letterA); // change to next letter
        //Converting form upper to lower case
        char bigB = 'B';
        System.out.println((char)(bigB +32));
        char lowK = 'k';
        System.out.println((char)(lowK-32));

        // 10. Create two variables:
        int a = 9;
        int b = 2;
        System.out.println(a/b); //integer division
        System.out.println(a%b); // remainder 1

        // 11. Store your weight in a double. Store your height in a double. Calculate and print BMI:
        double myWeight = 86.18;
        double myHeight = 1.75;
        double myBmi = myWeight / (myHeight*2);
        System.out.println(myBmi);

        // 12. Calculate the average of 3 double numbers. Print the result.
        double avgDouble = (myWeight + myHeight + num5) /3;
        System.out.println(avgDouble);

        // 13. BONUS: Explore the compound assignment operator (+=, *=, etc.) to modify a variable step by step.
        // Print after each step.
        double plusEqualTo = 10.0;
        plusEqualTo += myWeight;
        System.out.println(plusEqualTo);

        double multiplyEqualTo = 2.0;
        multiplyEqualTo *= myHeight;
        System.out.println(multiplyEqualTo);

        double minusEqualTo = 5.0;
        minusEqualTo -= 1.1;
        System.out.println(minusEqualTo);

        double divideEqualTo = 144;
        divideEqualTo /= 12;
        System.out.println(divideEqualTo);

        // 14. Create a short with value 30000. Multiply it by 2. What happens? Fix it using casting.
        short shortValue = 30000;
        //int calcShortValue = (int) shortValue * 2;
        //Fixed
        short calcShortValue = (short)(shortValue *2);
        System.out.println(calcShortValue);

        //Fixed
        short newShort = (short)(shortValue *2);

        // 15. Create a variable double price = 10.99. Create int quantity = 5.
        // Calculate total cost and cast the result to int. Print it.
        double price = 10.99;
        int quantity = 5;
        int totalCost = (int)price * quantity;
        System.out.println(totalCost);

        // 16. Create an int with value 130. Cast it to byte. Print it. Explain the weirdness.
        // It gave a negative value, probably because the max is 128 and it did that computer thing of -
        int numSeven = 130;
        byte byteConv = (byte) numSeven;
        System.out.println(byteConv);


        // 17. Create a variable char letter = 'z'. Subtract 2 from it and print the resulting character
        char letter = 'z';
        System.out.println(letter - 2);

        // 18. Store a long value of 2 billion (2000000000). Add 1 billion to it. Print the result.
        long twoBillionValue = 2000000000;
        long oneBillionValue = 1000000000;
        System.out.println(twoBillionValue - oneBillionValue);

        // 19. Calculate the area of a circle:
        double radius = 4.5;
        double area = Math.PI * radius * radius;
        System.out.println(area);

        // 20. Mixing it all:

        // 21. Mini Challenge: Time Calculator (Operators & Casting Only)
        /*
        The Story:
        A bakery is tracking its oven usage time. Every day, the ovens are on for a certain number of minutes.
        You are asked to convert total oven minutes into:
        Full hours
        Remaining minutes
         */
        // The Challenge:
        // 1. Create an int variable with the total number of minutes the ovens were on.
        int totalMinutes = 350;

        /*
        Calculate:
        Full hours
        Remaining minutes
         */
        int fullHours = totalMinutes/60;
        System.out.println(fullHours);

        int remainingMinutes = totalMinutes%60;
        System.out.println(remainingMinutes);

        System.out.println("That is " + fullHours + " hours " + "and " + remainingMinutes + " minutes" );

        // 4. Add a double variable for electricity cost per hour → e.g., 2.75 euros/hour.
        double electricityCostPerHour = 2.75;
        double totalElectricityCost = electricityCostPerHour * fullHours;
        System.out.println("Cost for " + fullHours + " hour(s) = " + totalElectricityCost + " euros");










    }
}
