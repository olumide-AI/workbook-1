package day04.generics;

public class Main {
    public static void main(String[] args) {
        Bag<Laptop> laptopBag = new Bag<>();
        laptopBag.add(new Laptop("Apple"));
        laptopBag.add(new Laptop("Lenovo"));
        laptopBag.add(new Laptop("Microsoft"));
        laptopBag.add(new Laptop("Dell"));
        laptopBag.printContents();
        System.out.println("First laptop from the list is: " + laptopBag.getFirstItem());
        System.out.println();

        Bag<Chihuahua> chihuahuaBag = new Bag<>();
        chihuahuaBag.add(new Chihuahua("jojo"));
        chihuahuaBag.add(new Chihuahua("ropo"));
        chihuahuaBag.add(new Chihuahua("koko"));
        chihuahuaBag.add(new Chihuahua("popo"));
        chihuahuaBag.printContents();
        System.out.println("First Chihuahua from the list is: " + chihuahuaBag.getFirstItem());
        System.out.println();

        Bag<String> stringBag = new Bag<>();
        stringBag.add("Olu");
        stringBag.add("mide");
        stringBag.add("kola");
        stringBag.add("wole");
        stringBag.printContents();
        System.out.println("First String from the list is: " + stringBag.getFirstItem());


    }


}
