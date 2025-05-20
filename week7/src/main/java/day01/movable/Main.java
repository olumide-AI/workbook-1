package day01.movable;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Movable> movables = new ArrayList<>();
        movables.add(new Car("toyota"));
        movables.add(new Bicycle("trek"));

        for (Movable movable: movables){
            movable.move();
        }
    }


}
