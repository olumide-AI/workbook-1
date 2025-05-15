package day04.generics;

import java.util.ArrayList;
import java.util.List;

public class LaptopBag {
    private List<Laptop>  laptops = new ArrayList<>();

    public void add(Laptop laptop){
        laptops.add(laptop);
    }

    public void printContents(){
        for (Laptop laptop: laptops){
            System.out.println("Laptop: " + laptop.getBrand());
        }
    }
}
