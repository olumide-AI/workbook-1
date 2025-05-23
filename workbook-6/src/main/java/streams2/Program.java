package streams2;

import streams.Person;

import java.util.ArrayList;
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

        //1.
        System.out.println("Input a name. First or last name");
        String userName = scanner.nextLine();
        List<Person> matchedPerson = personList.stream()
                .filter(n -> n.getFirstName().toLowerCase().contains(userName) || n.getLastName().toLowerCase().contains(userName))
                        .toList();
        matchedPerson.forEach(n -> System.out.println(n.getFirstName() + " " + n.getLastName()));

        //2.
        double avgAge = personList.stream()
                .mapToInt((n) -> n.getAge())
                .average()
                .orElse(0);
        System.out.printf("Avg age: %.2f\n", avgAge);

        //3.
        int maxAge = personList.stream()
                .mapToInt(p -> p.getAge())
                .max()
                .orElse(0);
        System.out.println("Oldest age: " + maxAge);

        //4.

        int minAge = personList.stream()
                .mapToInt(p -> p.getAge())
                .min()
                .orElse(0);
        System.out.println("Youngest age: " + minAge);



    }
}
