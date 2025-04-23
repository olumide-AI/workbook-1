package com.ltca.week03.day01.loopsandarrays;

import java.util.Arrays;
import java.util.Scanner;

public class LoopsAndArrayExerciseLevelTwo {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        //countJava();
        //largestNum();
        //compareArray();
        //copyArray();
        reverseArray();
    }
    // 8. Count how many times "Java" appears
    public static void countJava(){
        //Create a String[] with values: {"Java", "Python", "Java", "C#", "Java"}
        //Use a for loop to count how many times "Java" appears.
        String[] stringArray = {"Java", "Python", "Java", "C#", "Java"};
        int counter = 0;
        for(int i = 0; i<stringArray.length; i++){
            if (stringArray[i].equalsIgnoreCase("java")){
                counter ++;
            }
        }
        System.out.println("Java appears " + counter + " times");
    }
    // 9. Find the largest number
    public static void largestNum(){
        //Given int[] numbers = {12, 5, 90, 34, 7},
        // use a loop to find and print the largest number.
        int[] intNum = {12, 5, 90, 34, 7};
        int largestNum = intNum[0]; // Start with the first number as the largest
        for (int i =1; i<intNum.length; i++){
            if (intNum[i]>largestNum){
                largestNum = intNum[i];
            }
        }
        System.out.println("The largest number is " + largestNum);

    }
    // 10. Compare two arrays
    public static void compareArray(){
        //Create two int[] arrays: {1, 2, 3} and {1, 2, 4}
        //Use a for loop to check if they are equal (element by element). Print true or false.
        int[] firstArray = {1, 2, 3};
        int[] secondArray = {1, 2, 4};
        for (int i = 0; i <firstArray.length; i++){
            if (firstArray[i] == secondArray[i]){
                System.out.println("print true ");
            }
            else {
                System.out.println("print false ");
            }
        }
    }
    // Challenging: Copy one array to another
    public static void copyArray(){
        //Use a for loop to copy all values from array A into array B.
        int[] arrayA = {1, 2, 3, 4};
        int[] arrayB = new int[arrayA.length];
        for (int i =0; i<arrayA.length; i++){
            arrayB[i] = arrayA[i];
        }
        System.out.println("copy a into b is " + Arrays.toString(arrayB));

    }
    // 12. Reverse an array
    public static void reverseArray(){
        //Use a for loop to print the contents of an int[] in reverse order.
        //Input: {10, 20, 30} → Output: 30 20 10
        int[] numArray = {10, 20, 30};
        int[] reversedArray;
        for (int i = numArray.length - 1; i>=0;i--){
            System.out.println(numArray[i]);
        }
    }



}
