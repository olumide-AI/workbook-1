package day03.streamofexercise.javastreamapiexercises;

import java.util.List;

public class FirstEmail {
    public static void main(String[] args) {
        List<String> emails = List.of("admin@example.com", "info@company.com", "user@gmail.com", "lg3@gmail.com");

        String result = emails.stream()
                .filter((m) -> m.contains("@gmail.com"))
                .findFirst()
                .orElse(null);
        System.out.println(result);

    }
}
