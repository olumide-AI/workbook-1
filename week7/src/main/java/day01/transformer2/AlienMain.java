package day01.transformer2;

import java.util.ArrayList;
import java.util.List;

public class AlienMain {
    public static void main(String[] args) {
        List<Transformable> team = new ArrayList<>();
        team.add(new Transformer("Optimus Prime"));
        team.add(new AlienTransformer("Zarnox"));
        team.add(new Transformer("Bumblebee"));
        team.add(new AlienTransformer("Kraxx"));

        // Transform all
        for (Transformable t : team) {
            t.transform();
        }

        System.out.println("\n--- Transformation Status ---");
        for (Transformable t : team) {
            System.out.println(t.getName() + " transformed? " + t.isTransformed());
        }

        System.out.println("\n--- Battle Simulation ---");
        for (Transformable t : team) {
            if (t.isTransformed()) {
                System.out.println(t.getName() + " attacks! 💥");
            } else {
                System.out.println(t.getName() + " cannot fight (not transformed).");
            }
        }
    }

}
