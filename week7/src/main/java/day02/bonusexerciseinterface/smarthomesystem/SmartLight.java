package day02.bonusexerciseinterface.smarthomesystem;

public class SmartLight implements Switchable{
    private boolean on = false;

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    @Override
    public void turnOn() {
        if(on == true){
            System.out.println("Light is on");
        }
    }

    @Override
    public void turnOff() {
        if(on == false){
            System.out.println("Light is off");
        }

    }
}
