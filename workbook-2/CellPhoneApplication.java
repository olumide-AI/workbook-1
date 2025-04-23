import java.util.Scanner;

public class CellPhoneApplication {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        cellPhoneOne( scanner);

    }

    public static void cellPhoneOne(Scanner scanner) {
        //Prompt user and collect info
        System.out.println("What is the serial number? EX.2597153");
        int serialNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.println("What model is the phone? EX. iPhone 15 Pro Max");
        String model = scanner.nextLine();
        System.out.println("Who is the carrier? EX. Verizon");
        String carrier = scanner.nextLine();
        System.out.println("What is the phone number? EX. 888-555-1234");
        String phoneNumber = scanner.nextLine();
        System.out.println("Who is the owner of the phone? EX. Sandra");
        String owner = scanner.nextLine();

        //Use the setters of your CellPhone object to add the values entered by the user.
        //Create new cellphone
        CellPhone iphone = new CellPhone();
        iphone.setSerialNumber(serialNumber);
        iphone.setModel(model);
        iphone.setCarrier(carrier);
        iphone.setPhoneNumber(phoneNumber);
        iphone.setOwner(iphone.setOwner(owner));

        //Using the getters of the CellPhone print the properties of the phone
        // to the screen.
        System.out.println("Cell Phone Info:");
        System.out.println("Serial Number: " + iphone.getSerialNumber());
        System.out.println("Model: " + iphone.getModel());
        System.out.println("Carrier: " + iphone.getCarrier());
        System.out.println("Phone Number: " + iphone.getPhoneNumber());
        System.out.println("Owner: " + iphone.getOwner());

    }
}
