package day02.bonusexerciseinterface.smarthomesystem;

public class SmartFan implements Switchable, AdjustableTemperature {
    private int temp = 0;
    private boolean on = false;

    @Override
    public void setTemperature(int degrees) {
        this.temp = degrees;
        System.out.println("Thermostat set to " + degrees + "celsius");
    }

    @Override
    public int getTemperature() {
        return temp;
    }

    @Override
    public void turnOn() {
        if (on == true) {
            System.out.println("Fan is on");
        }
    }

    @Override
    public void turnOff() {
        if (on == false) {
            System.out.println("Fan is off");
        }
    }
}
