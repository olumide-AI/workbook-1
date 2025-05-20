package day01.transformer2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Transformable> team = new ArrayList<>();

        team.add(new Transformer("Optimus Prime"));
        team.add(new Transformer("Bumblebee"));
        team.add(new Transformer("Starscream"));

        for (Transformable t : team) {
            t.transform();  // works as before
        }

        System.out.println("\n--- Transformation Status ---");

        // NO CASTING NEEDED
        for (Transformable t : team) {
            System.out.println(t.getName() + " transformed? " + t.isTransformed());
        }
    }

}
