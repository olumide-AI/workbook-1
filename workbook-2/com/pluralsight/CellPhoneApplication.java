package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CellPhoneService cellPhoneOne = new CellPhoneService();

        //Prompt user for phone info
        System.out.println("What is the serial number? 2597153");
        int serialNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.println("What model is the phone? iPhone 15 Pro Max");
        String phoneModel = scanner.nextLine();

        System.out.println("Who is the carrier? Verizon");
        String carrier = scanner.nextLine();

        System.out.println("What is the phone number? 888-555-1234");
        String phoneNumber = scanner.nextLine();

        System.out.println("Who is the owner of the phone? Sandra");
        String phoneOwner = scanner.nextLine();

        //set values
        cellPhoneOne.setPhoneNumber(phoneNumber);
        cellPhoneOne.setCarrier(carrier);
        cellPhoneOne.setModel(phoneModel);
        cellPhoneOne.setOwner(phoneOwner);
        cellPhoneOne.setSerialNumber(serialNumber);

        //get values
        System.out.println("Phone Details:");
        System.out.println("Serial Number: " + cellPhoneOne.getSerialNumber());
        System.out.println("Model: " + cellPhoneOne.getModel());
        System.out.println("Carrier: " + cellPhoneOne.getCarrier());
        System.out.println("Phone Number: " + cellPhoneOne.getPhoneNumber());
        System.out.println("Owner: " + cellPhoneOne.getOwner());
    }
}
