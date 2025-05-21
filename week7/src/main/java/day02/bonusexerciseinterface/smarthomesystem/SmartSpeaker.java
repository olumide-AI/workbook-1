package day02.bonusexerciseinterface.smarthomesystem;

public class SmartSpeaker implements Switchable, Playable {
    private boolean on = false;

    @Override
    public void play(String song) {
        if (on == true) {
            System.out.println("Playing.." + song);
        } else {
            System.out.println("Smart speaker is off");
        }
    }

    @Override
    public void turnOn() {
        if (on == true) {
            System.out.println("Light is on");
        }
    }

    @Override
    public void turnOff() {
        if (on == false) {
            System.out.println("Light is off");
        }
    }
}

