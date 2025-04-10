public class ExerciseUsingMath {
    public static void main(String[] args) {
        // 1. Math.abs(x)
        int negativeFortyFive = -45;
        System.out.println(Math.abs(negativeFortyFive));

        // 2. Math.max(x, y)
        double threePointFive = 3.5;
        double sevenPointEight = 7.8;
        System.out.println(Math.max(threePointFive, sevenPointEight));

        // 3. Math.min(x, y)
        int ninetyNine = 99;
        int twentyThree = 23;
        System.out.println(Math.min(ninetyNine, twentyThree));

        // 4. Math.floor(x)
        double eightPointNine = 8.9;
        System.out.println(Math.floor(eightPointNine));

        // 5. Math.ceil(x)
        double fivePointTwo = 5.2;
        System.out.println(Math.ceil(fivePointTwo));

        // 6. Math.round(x)
        double ninePointSix = 9.6;
        System.out.println(Math.round(ninePointSix));

        // 7. Challenge: Temperature Converter
        double morningTemp = -3.7;
        double afternoonTemp = 12.4;

        //morningTemp = Math.abs(-3.7);
        //double absoluteDiff = (afternoonTemp - morningTemp);
        //7.1 Find absolute diff
        double absoluteDiff = Math.abs(morningTemp - afternoonTemp);
        System.out.println(absoluteDiff);

        //7.2 Find max temp
        System.out.println(Math.max(morningTemp, afternoonTemp));

        //7.3 Find min temp
        System.out.println(Math.min(morningTemp, afternoonTemp));

        //7.4 Round the afternoon temperature.
        System.out.println(Math.round(afternoonTemp));

        //7.5 Floor the morning temperature.
        System.out.println(Math.floor(morningTemp));

        // Math.random
        double random = Math.random();
        System.out.println("random numbers: " + random);

        // set  range from 0 - 100, ceiling will round up
        int randomInt = (int) Math.ceil(Math.random() * 100);
        System.out.println(randomInt);

        // Bonus: Let's level it up!
        // 1. Rounding Money Challenge
        double price = 10.876;
        //double roundedPrice = Math.round(price);
        //System.out.println(roundedPrice);
        System.out.printf("Rounded price; %.2f%n", price);

        //Without using print f
        double roundedNr = (double) Math.round(price * 100) /100;
        System.out.println("rounded money number: " +roundedNr);

        // 2. Time Challenge with Ceil
        int lengthOfVideoInSeconds = 320;
        int timeInMinutes = lengthOfVideoInSeconds/60;
        System.out.println("Real minutes: " + timeInMinutes);

        double timeInMinutes2 = lengthOfVideoInSeconds/60.0;
        System.out.println("rounded minutes: " + Math.ceil(timeInMinutes2));

        // 3. Rounding Down Money to Nearest 5 Cents
        // Using hint multiply by 20, floor, divide by 20
        double price2 = 3.87;
        price2 *= 20.0;
        price2 = Math.floor(price2);
        price2 /= 20.0;
        System.out.println(price2);
        System.out.printf("Rounded price: %.2f%n", price2);

        // 4. Crazy Casting Output
        // Answer is 8 int rounds down
        double x = 5.9;
        int y = (int)x + 3;
        System.out.println(y);

        // int rounds down to 8
        int z = (int)(x + 3);
        System.out.println(z);

        // 5. Max-Min Battle
        int a = 17;
        int b = 42;
        int c = 9;

        // Print the biggest one without using if or loops.
        int maxOfValue = Math.max(a,(Math.max(b,c)));
        System.out.println(maxOfValue);

        // 6. Rounding Total Price Up to Whole Euro
        double totalPrice = 17.23;
        System.out.println((int)Math.ceil(totalPrice));

        // 7. Casting Overflow Trap
        int x1 = 150;
        byte y1 = (byte)x1;
        System.out.println(y1);

        // 8. Big Final Boss: Mixed Math
        double start = -12.8;
        double end = 7.3;

        double absDistance = Math.abs(start - end);
        System.out.println(absDistance);
        System.out.println(Math.ceil(absDistance));
        System.out.println( (int) absDistance);









    }
}
