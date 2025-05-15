package genericexercise;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // ---- Test with Integers ----
        FixedList<Integer> numbers = new FixedList<>(3);
        System.out.println(numbers.add(10));  // true (now [10])
        System.out.println(numbers.add(3));   // true (now [10,3])
        System.out.println(numbers.add(92));  // true (now [10,3,92])
        System.out.println(numbers.add(43));  // false (list is full)
        System.out.println("Size: " + numbers.size());           // 3
        System.out.println("MaxSize: " + numbers.getMaxSize());  // 3
        System.out.println(numbers.getItems());                   // [10, 3, 92]
        System.out.println();

        // ---- Test with Dates ----
        FixedList<LocalDate> dates = new FixedList<>(2);
        System.out.println(dates.add(LocalDate.now()));               // true
        System.out.println(dates.add(LocalDate.now().plusDays(1)));   // true
        System.out.println(dates.add(LocalDate.now().plusDays(2)));   // false: no room
        System.out.println("Dates: " + dates);                        // [2025-05-15, 2025-05-16]
        System.out.println();

    }
}
