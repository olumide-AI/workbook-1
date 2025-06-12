package northwindshippers.app;

import northwindshippers.dao.ShipperDao;
import northwindshippers.model.Shipper;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

/*
 * This class controls user journey through each function operation
 * it listens to the user
 * passes instructions to the database
 * displays results
 */
public class ShipperApp {
    /**
     * “We use constructor injection to pass ShipperDAO into the App class.
     * This promotes clean architecture and testability.
     * The Scanner is created in the constructor so each instance manages its own input.
     * Both are marked final to enforce immutability and protect state.”
     */
    private final ShipperDao  shipperDao;
    private final Scanner scanner;

    public ShipperApp(ShipperDao shipperDao){
        this.shipperDao = shipperDao;
        this.scanner = new Scanner(System.in);
    }

    public void run(){
        try{
            int newId = createShipper();
            displayShippers();

            updateShipperPhoneById();
            displayShippers();

            deleteShipperById(newId);
            displayShippers();

        }
        catch (SQLException e){
            System.out.println("Database error");
        }
        catch (NumberFormatException e){
            System.out.println("Invalid Number input. ");
        }
    }

    private int createShipper() throws SQLException {
        System.out.println("Enter company name: ");
        String companyName = scanner.nextLine();
        System.out.println("Enter Phone Number: ");
        String phoneNumber = scanner.nextLine();

        Shipper shipper = new Shipper(companyName, phoneNumber);
        int newShipperId = shipperDao.addShipper(shipper);
        System.out.println("New shipper has been added with ID: " + newShipperId);
        return newShipperId;
    }

    private void updateShipperPhoneById() throws SQLException {
        System.out.println("Enter shipper ID to update: ");
        int shipperId = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter new phone number: ");
        String newPhoneNumber = scanner.nextLine();
        shipperDao.updatePhoneById(shipperId,newPhoneNumber);
        System.out.println("Phone number has been updated.");
    }

    private void deleteShipperById(int shipperId) throws SQLException {
        if (shipperId <= 3){
            System.out.println("These ID's are referenced on another table and can't be deleted");
        }
        else{
            shipperDao.deleteShipperById(shipperId);
            System.out.println("Shipper has been deleted");
        }
    }

    private void displayShippers() throws SQLException {
        List<Shipper> shipperList = shipperDao.displayAllShippers();
        System.out.println("Current Shippers: ");
        for(Shipper shipper: shipperList){
            System.out.println(" - " + shipper);
        }
    }
}
