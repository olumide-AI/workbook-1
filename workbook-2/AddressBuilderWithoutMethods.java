import java.util.Scanner;

public class AddressBuilderWithoutMethods {
    public static void main(String[] args) {
        //Initalize Scanner
        Scanner scanner = new Scanner(System.in);

        //initalize String builder method
        StringBuilder addressBuilder = new StringBuilder();

        // Get User name
        System.out.println("Full name: ");
        String fullName = scanner.nextLine();
        addressBuilder.append(fullName).append("\n");

        //Get Billing Address
        addressBuilder.append("Billing Address:\n");
        System.out.println("Billing Street");
        String billingStreet = scanner.nextLine();
        addressBuilder.append(billingStreet).append("\n");

        System.out.println("Billing City");
        String billingCity = scanner.nextLine();
        addressBuilder.append(billingCity).append(", ");

        System.out.println("Billing State");
        String billingState = scanner.nextLine();
        addressBuilder.append(billingState).append(" ");

        System.out.println("Billing Zip");
        String billingZip = scanner.nextLine();
        addressBuilder.append(billingZip);

        // Get Shipping Address
        addressBuilder.append("\n").append("Shipping Address:\n");
        System.out.print("Shipping Street: ");
        addressBuilder.append(scanner.nextLine()).append("\n");
        System.out.print("Shipping City: ");
        String shippingCity = scanner.nextLine();
        System.out.print("Shipping State: ");
        String shippingState = scanner.nextLine();
        System.out.print("Shipping Zip: ");
        String shippingZip = scanner.nextLine();
        addressBuilder.append(shippingCity).append(", ").append(shippingState).append(" ").append(shippingZip);

        //Output
        System.out.println(addressBuilder.toString());
    }
}
