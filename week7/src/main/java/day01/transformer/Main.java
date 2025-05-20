package day01.transformer;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Transformable> team = new ArrayList<>();

        team.add(new Transformer("Optimus Prime"));
        team.add(new Transformer("Bumblebee"));
        team.add(new Transformer("Starscream"));

        // Step 1: Transform all
        for (Transformable t : team) {
            t.transform();  // all we can call from the interface
        }

        System.out.println("\n--- Transformation Status ---");

        // Step 2: Check if each one is transformed
        for (Transformable t : team) {
            Transformer tf = (Transformer) t;  // cast back to original type
            System.out.println(tf.getName() + " transformed? " + tf.isTransformed());
        }
    }
}
