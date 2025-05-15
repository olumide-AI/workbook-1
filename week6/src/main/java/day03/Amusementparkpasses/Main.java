package day03.Amusementparkpasses;

public class Main {
    public static void main(String[] args) {
        Pass child = new ChildPass("Ella", 40.0);
        Pass adult = new AdultPass("John", 60.0);
        Pass senior = new SeniorPass("Gloria", 55.0);

        // Create group booking and add passes
        GroupBooking group = new GroupBooking();
        group.addPass(child);
        group.addPass(adult);
        group.addPass(senior);

        // Print summary
        group.printSummary();
    }
}
