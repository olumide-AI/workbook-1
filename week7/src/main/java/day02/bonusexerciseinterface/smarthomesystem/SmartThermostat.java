package day02.bonusexerciseinterface.smarthomesystem;

public class SmartThermostat implements  AdjustableTemperature{
    private int temperature = 20;
    @Override
    public void setTemperature(int degrees) {
        this.temperature = degrees;
        System.out.println("Thermostat set to " + degrees + "celsius");
    }

    @Override
    public int getTemperature() {
        return temperature;
    }
}
