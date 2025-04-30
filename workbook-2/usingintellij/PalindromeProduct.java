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
        int product = 0;
        String currentLargestPalindrome = "";
        String largestPalindrome = "";
        for (int i = 1; i <= 999; i++){
            for (int j =1; j <= 999; i++){
                product = i*j;
            }
            String stringOfProduct = String.valueOf(product);
            String copiedProduct = new String(stringOfProduct);
            StringBuilder reversedProduct = new StringBuilder(copiedProduct);
            reversedProduct.reverse().toString();
            if (reversedProduct.equals(stringOfProduct)){
                currentLargestPalindrome = stringOfProduct;
            }
        }
        if (Integer.parseInt(currentLargestPalindrome) > Integer.parseInt(largestPalindrome)){
            largestPalindrome = currentLargestPalindrome;
        }
        else {
            largestPalindrome = largestPalindrome;
        }
        System.out.println(largestPalindrome);
    }
}
