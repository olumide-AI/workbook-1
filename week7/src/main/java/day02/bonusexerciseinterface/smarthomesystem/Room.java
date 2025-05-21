package day02.bonusexerciseinterface.smarthomesystem;

import java.util.ArrayList;
import java.util.List;

public class Room implements Switchable {
    private String name;
    private List<Switchable> switchables = new ArrayList<>();
    private List<MotionDetectedListener> listeners = new ArrayList<>();

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

    @Override
    public void turnOn() {
        System.out.println("Turning ON all devices in " + name);
        switchables.forEach(Switchable::turnOn);

    }

    @Override
    public void turnOff() {
        System.out.println("Turning OFF all devices in " + name);
        switchables.forEach(Switchable::turnOff);
    }

    public void triggerMotionEvent() {
        System.out.println("🔔 Motion detected in " + name);
        for (MotionDetectedListener listener : listeners) {
            listener.onMotion();
        }
    }
    public void registerMotionListener(MotionDetectedListener listener) {
        listeners.add(listener);
    }
}
