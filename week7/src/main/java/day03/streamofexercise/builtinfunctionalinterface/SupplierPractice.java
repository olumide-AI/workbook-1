package day03.streamofexercise.builtinfunctionalinterface;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class SupplierPractice {
    public static void main(String[] args) {
        Supplier<LocalDateTime> timeNow = () -> LocalDateTime.of(2025,10,10,5,5);

        System.out.println(timeNow.get());
    }
}
