package com.ltca.week03.day05;

import java.util.HashMap;
import java.util.Map;

public class MapMiniExercise {
    public static void main(String[] args) {
        //stringToString();
        //stringToInteger();
        stringToObject();

    }
    public static Map<String, String> stringToString(){
        Map<String, String> smallDictionary = new HashMap<>();
        smallDictionary.put("Lucid", "Transparently clear, easily understandable");
        smallDictionary.put("Erudite", "Learned, having or showing great knowledge or learning");
        smallDictionary.put("Impeccable", "Exemplary, flawless");

        String wordMeaning = smallDictionary.get("Lucid");
        if (wordMeaning != null){
            System.out.println("Meaning of Lucid is: "  + wordMeaning);
        }
        else {
            System.out.println("Meaning doesn't exit in our dictionary");
        }
        //Replace the meaning of one of the words.
        smallDictionary.put("Impeccable", "Extra good");

        //Check if a certain word exists in the map.
        if (smallDictionary.containsKey("Lucid")){
            System.out.println("Word is available.");
        }
        else{
            System.out.println("Word is not available");
        }

        //Print all keys (the words).
        for (String key : smallDictionary.keySet()){
            System.out.println("All the keys available are: " +key);
        }

        //Print all values (the meanings).
        for (String values: smallDictionary.values()){
            System.out.println("Values: " + values);
        }
        return smallDictionary;
    }
    // Method to store names of people and their ages.
    public static Map<String, Integer> stringToInteger(){
        Map<String, Integer> nameToAge = new HashMap<>();
        nameToAge.put("olumide",25);
        nameToAge.put("Lania", 28);
        nameToAge.put("Ocean", 1);
        nameToAge.put("Mom", 51);

        int wifeAge = nameToAge.get("Lania");
        System.out.println("My wife turns " + wifeAge + " today");

        int sonAge = nameToAge.get("Ocean");
        System.out.println("Ocean will be " + (sonAge + 1) + " next year");

        nameToAge.remove("olumide");

        //Loop over the map and print: "Name: [name], Age: [age]".
        for (String key: nameToAge.keySet()){
            System.out.println(key + ": " +"[" + nameToAge.get(key) + "]");
        }
        return nameToAge;
    }
    public static void stringToObject(){
        Map<String, Pet> ownerAndPet = new HashMap<>();
        Pet wifePet = ownerAndPet.put("Lania", new Pet("Punyo", "some dog", 10, true));
        Pet oluPet = ownerAndPet.put("Olu", new Pet("Sifon", "German Shepherd", 15, true));
        Pet lavenderCat = ownerAndPet.put("Lavender", new Pet("Miles", "some cat", 5, true));

        ownerAndPet.put("Lavender", new Pet("Miles brother", "some cat", 5, true));

        for (String keys: ownerAndPet.keySet()){
            System.out.println("Owner: [" + keys + "] -> Pet: [" + ownerAndPet.get(keys).getName() +  "] the [" + ownerAndPet.get(keys).getType() +"] " );
        }
    }

}
