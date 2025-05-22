package day03.streamofexercise.palindrome;

public class Main {
    public static void main(String[] args) {
        String[] words = {"level", "banana", "madam", "world", "racecar", "hello"};

        Checker<String> isPalindrome = (n) -> {
            String reversed = new StringBuilder(n).reverse().toString();
            return n.equalsIgnoreCase(reversed);
        };
        // Use it on each word
        for (String word : words) {
            if (isPalindrome.check(word)) {
                System.out.println(word + " is a palindrome");
            } else {
                System.out.println(word + " is NOT a palindrome");
            }
        }
        //way to solve for isPalindrome
//        word -> {
//            int len = word.length();
//            for (int i = 0; i < len / 2; i++) {
//                if (word.charAt(i) != word.charAt(len - 1 - i)) {
//                    return false;
//                }
//            }
//            return true;
//        word -> IntStream.range(0, word.length() / 2)
//                .allMatch(i -> word.charAt(i) == word.charAt(word.length() - 1 - i))

    }

}
