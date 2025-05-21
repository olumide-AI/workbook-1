package day02.bonusexerciseinterface.smarthomesystem;

import java.util.ArrayList;
import java.util.List;

public class Room {
    private String name;
    private List<Switchable> switchables = new ArrayList<>();

    public Room(String name) {
        this.name = name;
    }

    public void addDevice(Switchable s) {
        switchables.add(s);
    }

    public void allOn() {
        switchables.forEach(Switchable::turnOn);
    }

    public void allOff() {
        switchables.forEach(Switchable::turnOff);
    }
}
