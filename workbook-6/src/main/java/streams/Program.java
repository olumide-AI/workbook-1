package streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Program {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Olumide", "Kolawole", 25));
        personList.add(new Person("Lania", "Kolawole", 28));
        personList.add(new Person("Ocean", "Kolawole", 1));
        personList.add(new Person("Oladipupo", "Kolawole", 21));
        personList.add(new Person("Oluwanifemi", "Kolawole", 23));
        personList.add(new Person("Katina", "Potter", 52));
        personList.add(new Person("Maya", "Potter", 26));
        personList.add(new Person("Lilly", "Potter", 23));
        personList.add(new Person("Adeola", "Kolawole", 50));
        personList.add(new Person("Nila", "Kolawole", 30));

        //Using a for loop, create a new List of people whose name was a match,
        // display the names of the people in that list
        System.out.println("Input a name. First or last name");
        String userName = scanner.nextLine();
        for(Person foundPerson: personList){
            if (foundPerson.getFirstName().equalsIgnoreCase(userName) || foundPerson.getLastName().equalsIgnoreCase(userName)){
                System.out.println(foundPerson.getFirstName() + " " + foundPerson.getLastName());
            }
        }
        //Calculate the average age of all people in the original list and display it.
        int personsAge = 0;
        for(Person person: personList){
            personsAge += person.getAge();
        }
        int avgListAge = personsAge/personList.size();
        System.out.println("Avg age in the original list: " + avgListAge);

        //Display the age of the oldest person in the list.
        List<Integer> ageList = new ArrayList<>();
        for (Person person: personList){
            ageList.add(person.getAge());
        }
        int maxAge = Collections.max(ageList);

        System.out.println("Oldest ages from the list is: " + maxAge);

        //Display the age of the youngest person in the list.
        int minAge = Collections.min(ageList);
        System.out.println("Youngest ages from the list is: " + minAge);















//        // Step 2: Filter matching people
//        List<Person> matches = new ArrayList<>();
//        for (Person p : people) {
//            if (p.getFirstName().toLowerCase().contains(search) ||
//                    p.getLastName().toLowerCase().contains(search)) {
//                matches.add(p);
//            }
//        }
//
//        System.out.println("Matching people:");
//        for (Person p : matches) {
//            System.out.println("- " + p.getFullName());
//        }
//
//        // Step 3: Average, oldest, youngest age
//        int totalAge = 0;
//        int maxAge = Integer.MIN_VALUE;
//        int minAge = Integer.MAX_VALUE;
//
//        for (Person p : people) {
//            int age = p.getAge();
//            totalAge += age;
//            if (age > maxAge) maxAge = age;
//            if (age < minAge) minAge = age;
//        }
//
//        double averageAge = (double) totalAge / people.size();
//        System.out.printf("Average age: %.1f\n", averageAge);
//        System.out.println("Oldest age: " + maxAge);
//        System.out.println("Youngest age: " + minAge);
//
    }
}
