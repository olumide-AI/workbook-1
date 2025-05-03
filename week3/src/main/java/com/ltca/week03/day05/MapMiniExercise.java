package com.ltca.week03.day05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapMiniExercise {
    public static void main(String[] args) {
        //stringToString();
        //stringToInteger();
        //stringToObject();
        //stringToListOfPet();
        objectToList();

    }

    public static Map<String, String> stringToString() {
        Map<String, String> smallDictionary = new HashMap<>();
        smallDictionary.put("Lucid", "Transparently clear, easily understandable");
        smallDictionary.put("Erudite", "Learned, having or showing great knowledge or learning");
        smallDictionary.put("Impeccable", "Exemplary, flawless");

        String wordMeaning = smallDictionary.get("Lucid");
        if (wordMeaning != null) {
            System.out.println("Meaning of Lucid is: " + wordMeaning);
        } else {
            System.out.println("Meaning doesn't exit in our dictionary");
        }
        //Replace the meaning of one of the words.
        smallDictionary.put("Impeccable", "Extra good");

        //Check if a certain word exists in the map.
        if (smallDictionary.containsKey("Lucid")) {
            System.out.println("Word is available.");
        } else {
            System.out.println("Word is not available");
        }

        //Print all keys (the words).
        for (String key : smallDictionary.keySet()) {
            System.out.println("All the keys available are: " + key);
        }

        //Print all values (the meanings).
        for (String values : smallDictionary.values()) {
            System.out.println("Values: " + values);
        }
        return smallDictionary;
    }

    // Method to store names of people and their ages.
    public static Map<String, Integer> stringToInteger() {
        Map<String, Integer> nameToAge = new HashMap<>();
        nameToAge.put("olumide", 25);
        nameToAge.put("Lania", 28);
        nameToAge.put("Ocean", 1);
        nameToAge.put("Mom", 51);

        int wifeAge = nameToAge.get("Lania");
        System.out.println("My wife turns " + wifeAge + " today");

        int sonAge = nameToAge.get("Ocean");
        System.out.println("Ocean will be " + (sonAge + 1) + " next year");

        nameToAge.remove("olumide");

        //Loop over the map and print: "Name: [name], Age: [age]".
        for (String key : nameToAge.keySet()) {
            System.out.println(key + ": " + "[" + nameToAge.get(key) + "]");
        }
        return nameToAge;
    }

    public static Map<String, Pet> stringToObject() {
        Map<String, Pet> ownerAndPet = new HashMap<>();
        Pet wifePet = ownerAndPet.put("Lania", new Pet("Punyo", "some dog", 10, true));
        Pet oluPet = ownerAndPet.put("Olu", new Pet("Sifon", "German Shepherd", 15, true));
        Pet lavenderCat = ownerAndPet.put("Lavender", new Pet("Miles", "some cat", 5, true));

        ownerAndPet.put("Lavender", new Pet("Miles brother", "some cat", 5, true));

        for (String keys : ownerAndPet.keySet()) {
            System.out.println("Owner: [" + keys + "] -> Pet: [" + ownerAndPet.get(keys).getName() + "] the [" + ownerAndPet.get(keys).getType() + "] ");
        }
        return ownerAndPet;
    }

    public static void stringToListOfPet() {

        Map<String, List<Pet>> ownerToMultiplePets = new HashMap<>();
        List<Pet> sarahPets = new ArrayList<>();
        sarahPets.add(new Pet("Rocky", "black cat", 3, true));
        sarahPets.add(new Pet("Jojo", "some white cat", 6, false));
        ownerToMultiplePets.put("Sarah", sarahPets);

        List<Pet> wifeyPet = new ArrayList<>();
        wifeyPet.add(new Pet("Punyo", "little dog", 0, false));
        ownerToMultiplePets.put("Wife", wifeyPet);

        //Retrieve and print all pet names for a specific person.
        String jojo = ownerToMultiplePets.get("Sarah").get(1).getName();
        System.out.println("Sarah 2nd pet name is " + jojo );

        System.out.println("All of sarah pets");
        for (Pet pet: ownerToMultiplePets.get("Sarah")){
            System.out.println("-" + pet.getName());
        }

        //Add a new pet to one person’s list.
        wifeyPet.add(new Pet("Max", "future dog", 1, true));

        //Remove a pet from someone’s list.
        //By going through sarah list of pets from the hashmap
        //Look through the list to find any et who matched the ket
        Pet petToRemove = null;
        for (Pet pet : sarahPets){
            if (pet.getName().equals("rocky")){
                petToRemove = pet;
                break;
            }
        }
        //Remove pet from list
        if (petToRemove != null){
            sarahPets.remove(petToRemove);
        }


        // I want to confirm if it's truly been removed ?
        System.out.println("All of sarah pets");
        for (Pet pet: ownerToMultiplePets.get("Sarah")){
            System.out.println("-" + pet.getName());
        }

        // Loop over the map and print each person’s name and all their
        // pets' names and types. (You'll need a loop in a loop)
        System.out.println("\nAll people and their pets:");
        for (String person : ownerToMultiplePets.keySet()){
            System.out.println(person + "'s pets:");
            for (Pet pet : ownerToMultiplePets.get(person)){
                System.out.println(" - " + pet.getName() + " the " + pet.getType());
            }
        }

    }
    public static void objectToList(){
        Map<Person, List<Pet>> personToPet = new HashMap<>();
        Person john = new Person(20, "john");
        Person peter = new Person(25, "peter");

        List<Pet> johnPets = new ArrayList<>();
        johnPets.add(new Pet("max", "dog", 3, true));

        List<Pet> peterPets = new ArrayList<>();
        peterPets.add(new Pet("jungle", "cat", 2,true));

        personToPet.put(john,johnPets);
        personToPet.put(peter,peterPets);

        System.out.println("John pets are: ");
        for (Pet pet : personToPet.get(john)){
            System.out.println(pet.getName());
        }

        //Add new to peter
        personToPet.get(peter).add(new Pet("cody", "sheep", 1, true));

        //Looping
        System.out.println("\nAll people and their pets:");
        for (Person person : personToPet.keySet()) {
            System.out.println("Person: [" + person.getName() + "], Age: [" + person.getAge() + "] has pets:");

            List<Pet> pets = personToPet.get(person);
            for (Pet pet : pets) {
                System.out.println(" - Name: " + pet.getName()
                        + ", Type: " + pet.getType()
                        + ", Age: " + pet.getAge()
                        + ", Has Fur: " + (pet.hasFur() ? "Yes" : "No"));
            }

            System.out.println(); // extra line between people
        }

    }
    public static void groupToPets() {
        // --- STEP 1: Create two Person objects ---
        Person alice = new Person(28, "Alice");
        Person bob = new Person(30, "Bob");

        // --- STEP 2: Add these persons to a List to represent the household ---
        List<Person> roommates = new ArrayList<>();
        roommates.add(alice);
        roommates.add(bob);

        // --- STEP 3: Create a list of pets shared by this household ---
        List<Pet> sharedPets = new ArrayList<>();
        sharedPets.add(new Pet("Whiskers", "Cat", 2, true));
        sharedPets.add(new Pet("Fido", "Dog", 5, true));

        // --- STEP 4: Create a HashMap that maps List<Person> to List<Pet> ---
        Map<List<Person>, List<Pet>> householdToPets = new HashMap<>();

        // --- STEP 5: Add the group of roommates and their pets to the map ---
        householdToPets.put(roommates, sharedPets);

        // --- STEP 6: Retrieve and print the names of all shared pets ---
        System.out.println("Shared pets for the household:");
        for (Pet pet : householdToPets.get(roommates)) {
            System.out.println("- " + pet.getName());
        }

        // --- STEP 7: Loop over all entries in the map and print details ---
        System.out.println("\nAll households and their shared pets:");

        for (Map.Entry<List<Person>, List<Pet>> entry : householdToPets.entrySet()) {
            List<Person> people = entry.getKey(); // the group of people in the household
            List<Pet> pets = entry.getValue();    // the list of pets they share

            // Print all names in the household
            System.out.print("Household with: ");
            for (int i = 0; i < people.size(); i++) {
                Person person = people.get(i);
                System.out.print(person.getName());
                if (i < people.size() - 1) {
                    System.out.print(", ");
                }
            }

            // Print pet names
            System.out.print(" share pets: ");
            for (int i = 0; i < pets.size(); i++) {
                Pet pet = pets.get(i);
                System.out.print(pet.getName());
                if (i < pets.size() - 1) {
                    System.out.print(", ");
                }
            }

            System.out.println(); // Move to the next line after one household
        }
    }


}
