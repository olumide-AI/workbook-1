package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CellPhoneService cellPhoneOne = new CellPhoneService();

        //Prompt user for phone info
        System.out.println("What is the serial number for phone one? 2597153");
        int serialNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.println("What model is the phone for phone one? iPhone 15 Pro Max");
        String phoneModel = scanner.nextLine();

        System.out.println("Who is the carrier for phone one? Verizon");
        String carrier = scanner.nextLine();

        System.out.println("What is the phone number for phone one? 888-555-1234");
        String phoneNumber = scanner.nextLine();

        System.out.println("Who is the owner of the phone for phone one? Sandra");
        String phoneOwner = scanner.nextLine();

        //set values for Phone 1
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

        //Prompt user for phone info 2
        CellPhoneService cellPhoneTwo = new CellPhoneService();

        System.out.println("What is the serial number for phone two? 2597153");
        int serialNumber2 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("What model is the  phone two? iPhone 15 Pro Max");
        String phoneModel2 = scanner.nextLine();

        System.out.println("Who is the carrier for  phone two? Verizon");
        String carrier2 = scanner.nextLine();

        System.out.println("What is the phone number for  phone two? 888-555-1234");
        String phoneNumber2 = scanner.nextLine();

        System.out.println("Who is the owner of  phone two? Sandra");
        String phoneOwner2 = scanner.nextLine();

        //set values for phone 2
        cellPhoneTwo.setPhoneNumber(phoneNumber2);
        cellPhoneTwo.setCarrier(carrier2);
        cellPhoneTwo.setModel(phoneModel2);
        cellPhoneTwo.setOwner(phoneOwner2);
        cellPhoneTwo.setSerialNumber(serialNumber2);

        //get values
        System.out.println("Phone Details:");
        System.out.println("Serial Number: " + cellPhoneTwo.getSerialNumber());
        System.out.println("Model: " + cellPhoneTwo.getModel());
        System.out.println("Carrier: " + cellPhoneTwo.getCarrier());
        System.out.println("Phone Number: " + cellPhoneTwo.getPhoneNumber());
        System.out.println("Owner: " + cellPhoneTwo.getOwner());

        // Display both phones
        System.out.println("\n Cell Phone Details:");
        display(cellPhoneOne);
        display(cellPhoneTwo);

        // User-triggered dial from phone 1
        System.out.print("\n" + cellPhoneOne.getOwner() + ", enter a number to call: ");
        String numberToCall = scanner.nextLine();
        cellPhoneOne.dial(cellPhoneOne.getOwner(), numberToCall);

        // Phone1 calls phone2
        System.out.println("\nNow phone 1 calls phone 2:");
        cellPhoneOne.dial(cellPhoneTwo.getOwner(), cellPhoneTwo.getPhoneNumber());

        // Phone2 calls phone1
        System.out.println("Now phone 2 calls phone 1:");
        cellPhoneTwo.dial(cellPhoneTwo.getOwner(), cellPhoneOne.getPhoneNumber());

        scanner.close();
    }
    public static void display(CellPhoneService phone) {
        System.out.println("-------------------------------");
        System.out.println("Owner:        " + phone.getOwner());
        System.out.println("Phone Number: " + phone.getPhoneNumber());
        System.out.println("Model:        " + phone.getModel());
        System.out.println("Carrier:      " + phone.getCarrier());
        System.out.println("Serial #:     " + phone.getSerialNumber());
    }
}
