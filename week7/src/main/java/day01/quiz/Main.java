package day01.quiz;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();

        System.out.println(date.getDayOfMonth());
    }
}
