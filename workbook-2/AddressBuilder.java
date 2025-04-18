import java.util.Scanner;

public class AddressBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide the following information");
        String fullName = userFullname(scanner);

        //Billing info
        String billingAddress = billingAddress(scanner);

        //Shipping info
        String shippingAddress = shippingAddress(scanner);

        StringBuilder customerInfo = fullAddress(fullName, billingAddress, shippingAddress);

        disCustomerInfo(customerInfo);
    }
    public static String userFullname(Scanner scanner){
        System.out.println("Full name: ");
        return scanner.nextLine();
    }
    public static String billingAddress(Scanner scanner){
        System.out.println("Billing Street: ");
        String street = scanner.nextLine();
        System.out.println("Billing City: ");
        String city = scanner.nextLine();
        System.out.println("Billing State: ");
        String state = scanner.nextLine();
        System.out.println("Billing Zip: ");
        String zip = scanner.nextLine();

        return street + "\n" +city + ", " + state + " " + zip;
    }

    //Shipping info
    public static String shippingAddress(Scanner scanner) {
        System.out.println("Shipping Street: ");
        String street = scanner.nextLine();
        System.out.println("Shipping City: ");
        String city = scanner.nextLine();
        System.out.println("Shipping State: ");
        String state = scanner.nextLine();
        System.out.println("Shipping Zip: ");
        String zip = scanner.nextLine();

        return street + "\n" + city + "' " + state + " " + zip;
    }
    public  static StringBuilder fullAddress(String fullName, String billingInfo, String shippingInfo){
        StringBuilder builder = new StringBuilder();
        builder.append(fullName).append("\n");
        builder.append("Billing Address:\n").append(billingInfo).append("\n");
        builder.append("Shipping Address:\n").append(shippingInfo);
        return  builder;

    }
    public static void disCustomerInfo(StringBuilder info){
        System.out.println("\n" + info.toString());
    }


}
