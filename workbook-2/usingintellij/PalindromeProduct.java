package usingintellij;

public class PalindromeProduct {
    public static void main(String[] args) {
        /*
            - Find the largest palindrom number made from product of two "3" digit
            numbers
            Hint:
            - We need nested loops that each go from 1 to 999.
            - Multiply the two loops counter together
            - Convert number to string using String.value0f()
            - Make a copy of the string
            - reverse it, if two stings are the same it's a palindrome
            - Keep your largest palindrome
         */

        //Find the sum of two 3 digits number
        // Ex. 111 * 222
        int largestPalindrome = 0;
        for (int i = 100; i <= 999; i++){
            for (int j =100; j <= 999; i++){
                int product = i*j;
                String stringOfProduct = String.valueOf(product);
                String reversedProduct = new StringBuilder(stringOfProduct).reverse().toString();
                if (reversedProduct.equals(stringOfProduct) && product > largestPalindrome){
                    largestPalindrome = product;
            }
        }
        }
        System.out.println(largestPalindrome + "is the largest palindrome");
    }
}
