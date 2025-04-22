package com.ltca.week03.day01.loopsandarrays;

public class LoopsAndArrayExercise {
    public static void main(String[] args) {
        // 1. Print numbers with a for loop
        int[] numOneToFive = {1,2,3,4,5};
        for (int i = 0; i < numOneToFive.length; i++){
            //System.out.println(numOneToFive[i]);
        }
        // 2. Count backwards with a while loop
        int counter = 5;
        while (counter >0){
            //System.out.println(counter);
            counter--;
        }
        // 3. Greet each person
        String[] names = {"Alice","Bob","Charlie"};
        for (int i = 0; i < names.length; i++){
            //System.out.println("Hello, " + names[i] + "!");
        }
        // 4. Calculate the total
        int[] randomNum = {3,5,7,2,8};
        int total = 0;
        for (int i = 0; i < randomNum.length; i++){
            total = total+randomNum[i];
        }
        //System.out.println("Total sum: " + total);

        // 5. Print only even numbers
        int[] onlyEvenNum = {4, 7, 10, 15, 18};
        for (int i = 0; i<onlyEvenNum.length; i++){
            if(onlyEvenNum[i] % 2 == 0){
                //System.out.println(onlyEvenNum[i]);
            }
        }
        //6. Stop at a certain value (while loop)
        int[] plusTwo = {1, 3, 5, 7, 9};
        //int counter = 0;



    }
}