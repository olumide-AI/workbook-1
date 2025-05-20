package day01.calculator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Calculable> calculables = new ArrayList<>();
        Adder adder = new Adder(40, 20);
        Multiplier multiplier = new Multiplier(120, 12);

        calculables.add(adder);
        calculables.add(multiplier);

        for (Calculable calculable: calculables){
            if (calculable instanceof Adder){
                System.out.println("sum: " + calculable.calculate());
            } else if (calculable instanceof Multiplier) {
                System.out.println("Product: " + calculable.calculate());
            }
            else{
                System.out.println("Operation not recoginzed ");
            }
        }
    }
}
