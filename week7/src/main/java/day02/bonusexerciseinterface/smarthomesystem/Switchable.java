package day02.bonusexerciseinterface.smarthomesystem;

public interface Switchable {
    void turnOn();
    void turnOff();

    default void toggle() {
        System.out.println("Toggling device...");
        turnOff(); // pretend it's on
        turnOn();
    }
}
