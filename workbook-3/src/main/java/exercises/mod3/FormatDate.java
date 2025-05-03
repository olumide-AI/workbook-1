package main.java.exercises.mod3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class FormatDate {
    public static void main(String[] args) {
        LocalDateTime todayDate = LocalDateTime.now();
        System.out.println(todayDate);

        //FORMAT ONE dd/mm/yyyy
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        System.out.println("Format 1: " + todayDate.format(formatter1));

        //Format two yyyy/mm/dd
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        System.out.println("Format 2: " + todayDate.format(formatter2));

        //Format three in iso format
        DateTimeFormatter formatter3 = DateTimeFormatter.ISO_LOCAL_DATE;
        System.out.println("Format 3: " + todayDate.format(formatter3));

        //Format in words just date
        DateTimeFormatter formatter4 = DateTimeFormatter.ofPattern("MMMM,dd,yyyy");
        System.out.println("Format 4: " + todayDate.format(formatter4));

        //Format in words and hours and min
        DateTimeFormatter formatter5 = DateTimeFormatter.ofPattern("EEEE, MMM d, yyyy  HH:mm");
        System.out.println("Format 5: " + todayDate.format(formatter5));

        //format using on in local time zone
        DateTimeFormatter formatter6 = DateTimeFormatter.ofPattern("h:mm 'on' dd-MMM-yyyy");
        System.out.println("Format 6: " + todayDate.format(formatter6));

        // BONUS: GMT vs Local time
        ZonedDateTime gmt = ZonedDateTime.now(ZoneId.of("GMT"));
        ZonedDateTime local = ZonedDateTime.now();

        System.out.println("\nCurrent Local Time: " + local.format(formatter4));
        System.out.println("Current GMT Time:   " + gmt.format(formatter4));




    }


}
