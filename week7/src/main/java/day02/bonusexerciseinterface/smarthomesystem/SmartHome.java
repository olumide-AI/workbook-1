package day02.bonusexerciseinterface.smarthomesystem;

public class SmartHome {
    public static void main(String[] args) {
        // Devices
        SmartLight light = new SmartLight();
        SmartSpeaker speaker = new SmartSpeaker();
        SmartThermostat thermostat = new SmartThermostat();

        // Room
        Room livingRoom = new Room("Living Room");
        livingRoom.addDevice(light);
        livingRoom.addDevice(speaker);

        // Register motion response
        livingRoom.registerMotionListener(() -> {
            livingRoom.turnOn();
            speaker.play("Welcome Home playlist");
        });

        // Simulate automation
        System.out.println(" Evening mode activated...");
        livingRoom.turnOn();
        thermostat.setTemperature(21);
        speaker.play("Chill playlist");

        // Simulate event
        System.out.println("\n Motion Event:");
        livingRoom.triggerMotionEvent();
    }
}
