package com.ltca.week03.day03.dateandtime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateAndTimeExercise {
    public static void main(String[] args) {
//        todayDate();
//        specificDate();
//        getPartsOfDate();
//        currentTime();
//        getSpecificTime();
//        createLocalDateTime();
//        currentLocalDateTime();
//        plusOneWeek();
//        minusThreeDays();
//        plusHrPlusMin();
//        addOneDay();
//        parseDateToString();
//        parseTimeFromString();
//        parseLdtFromString();
//        parseMoreLdt();
//        UsingDateTimeFormatter();
        formatTime();
        dateToFullSen();
        dateCheck();


    }
    //Level 1.
    //1. Print today's date
    public static void todayDate(){
        LocalDate todayDate = LocalDate.now();
        System.out.println("Today date is: " + todayDate);
    }
    //2. Print a specific date
    //Create a LocalDate for 25 December 2025 and print it.
    public static void specificDate(){
        LocalDate specificDate = LocalDate.of(1999, 10, 13);
        System.out.println("My birthday is: " + specificDate );
    }
    //3. Get parts of a date
    //Print the year, month, and day of a given LocalDate.
    public static void getPartsOfDate(){
        LocalDate partsOfDate = LocalDate.of(2024,3,26);
        System.out.println("My son was born on the " + partsOfDate.getDayOfMonth() +  "day");
        System.out.println("Of year "+partsOfDate.getYear() + " and month " + partsOfDate.getMonth());
    }
    //4.Print the current time
    //Create and print a LocalTime for the current time.
    public static void currentTime(){
        LocalTime currentTime = LocalTime.now();
        System.out.println("The current time is: " + currentTime);
    }
    //5. Create a specific time
    //Create a LocalTime for 15:30 and print it.
    public static void  getSpecificTime(){
        LocalTime specificTime = LocalTime.of(15,30);
        System.out.println("The time of our last break is: " + specificTime);

        //6. Print parts of a time
        //Given a LocalTime, print the hour and minute separately.
        System.out.println("At this hour " + specificTime.getHour() + " get this minute " + specificTime.getMinute());
    }

    //Level 2
    //7. Create a LocalDateTime from date and time
    //Combine a LocalDate and LocalTime to make a LocalDateTime.
    public static void createLocalDateTime(){
        LocalDate date = LocalDate.of(2024,12,25);
        LocalTime time = LocalTime.of(13,30);
        LocalDateTime createDateTime = date.atTime(time) ;
        System.out.println("Combined date and time is " + createDateTime);
    }
    // 8. Print the current date and time
    //Use LocalDateTime.now() and print the result.
    public static void currentLocalDateTime(){
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("My current local date time: " + currentDateTime);
    }
    // 9. Add 1 week to today’s date
    //Use .plusWeeks(1) on LocalDate and print the result.
    public static void plusOneWeek(){
        LocalDateTime plusOneWeek = LocalDateTime.now().plusWeeks(1);
        System.out.println("Local date time a week from now: " + plusOneWeek);
    }
    //10. Subtract 3 days from a specific date
    //Use .minusDays(3) on a LocalDate.
    public static void minusThreeDays(){
        LocalDateTime specificDate = LocalDateTime.of(1997,5, 1, 8, 50 );
        LocalDateTime minusThreeDays = specificDate.minusDays(3);
        System.out.println("Three days before my wife was born " + minusThreeDays);
    }
    // 11. Add 2 hours and 15 minutes to a LocalTime
    //Use .plusHours() and .plusMinutes() on a LocalTime.
    public static void plusHrPlusMin(){
        LocalTime specificTime = LocalTime.of(16, 40);
        LocalTime plusHrMin = specificTime.plusHours(2).plusMinutes(15);
        System.out.println("Adding 2 hours and 15 minutes to 16:40 " + plusHrMin);
    }
    // 12. Calculate tomorrow's datetime
    //Use LocalDateTime.now() and add 1 day to it.
    public static void addOneDay(){
        LocalDateTime currentDay = LocalDateTime.now();
        LocalDateTime tomorrow = currentDay.plusDays(1);
        System.out.println("Tomorrow is: " + tomorrow);
    }

    //Level 3
    // 13. Parse a date from a string (yyyy-MM-dd)
    //Convert a string like "2025-04-01" to a LocalDate.
    public static void parseDateToString(){
        String date = "2025-04-01";
        LocalDate parsedDate = LocalDate.parse(date);
        System.out.println("String date is: " + date + " while parsed date is: " + parsedDate);
    }
    // 14. Parse a time from a string (HH:mm)
    //Convert "09:30" to a LocalTime.
    public static void parseTimeFromString(){
        String time = "09:30";
        LocalTime formattedTime = LocalTime.parse(time);
        System.out.println("String '9:30' has been formatted to a local time format: " + formattedTime);
    }
    // 15. Parse a LocalDateTime from a string
    //Convert "2025-04-01T09:30" to a LocalDateTime.
    public static void parseLdtFromString(){
        String date = "2025-04-01T09:30";
        LocalDateTime localDateTimeFormat = LocalDateTime.parse(date);
        System.out.println("String has been converted to a ldt format: "+localDateTimeFormat);
    }
    //15b. Change formatting
    public static void parseMoreLdt(){
        String date = "09:30 2025-04-01";
        DateTimeFormatter formattedDate = DateTimeFormatter.ofPattern("HH:mm yyyy-MM-dd");
        LocalDateTime formatStringToDate = LocalDateTime.parse(date, formattedDate);
        System.out.println("Format string not in order like example above: " + formatStringToDate);
    }
    //16. Format a date using DateTimeFormatter
    //Format a LocalDate to the pattern "dd MMM yyyy".
    public static void UsingDateTimeFormatter(){
        LocalDate date = LocalDate.now();
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd MMM yyyy");
        //Format method returns a string
        String formattedDate = date.format(dateFormatter);
        System.out.println("Original date is: " + date + " While the formatted date is: " + formattedDate);
    }
    // 17. Format a time to show hours and minutes
    //Format a LocalTime to "HH:mm".
    public static void formatTime(){
        LocalTime breakTime = LocalTime.of(14,30);
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");
        String formattedTime = breakTime.format(timeFormatter);
        System.out.println("Original time is: " + breakTime + " While the formatted time is: " + formattedTime);
    }
    //18. Format a datetime to a full sentence
    //Example output: “April 22, 2025 at 9:30 AM”
    // patterns can be found here: https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
    public static void dateToFullSen(){
        LocalDateTime oceanBirthday = LocalDateTime.of(2024, 3,26,8,15);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MMMM d, yyyy 'at' h:mm a");
        String oceanFormattedBirthday = oceanBirthday.format(dateTimeFormatter);
        System.out.println("Ocean was born on " + oceanFormattedBirthday);
    }
    //19. Check if a date is before or after today
    //Use .isBefore() or .isAfter() to compare a LocalDate.
    public static void dateCheck(){
        LocalDate currentDate = LocalDate.now();
        LocalDate uncleKunleBirthday = LocalDate.of(2025,4,18);
        LocalDate yezinahBirthday = LocalDate.of(2025,4,26);

        boolean todayVsYezinah = currentDate.isAfter(yezinahBirthday);
        boolean todayVsUncleKunle = currentDate.isAfter(uncleKunleBirthday);
        System.out.println(todayVsYezinah);
        System.out.println(todayVsUncleKunle);

    }

}
