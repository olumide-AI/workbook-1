package day03.streamofexercise.numbertester;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {2, 5, 10, 13, 20};
        NumberTester numberTester = (n) -> n%2 == 0;
        System.out.println("Even numbers" +numberTester.toString());

//        NumberTester numberTester1 = (n) -> n%2 != 0;
//        System.out.println("Old numbers" + numberTester1.toString());

        // Test each number
        for (int num : numbers) {
            if (numberTester.test(num)) {
                System.out.println(num + " is even");
            } else {
                System.out.println(num + " is odd");
            }
        }
    }


}
