package com.pluralsight;

import java.awt.*;
import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        CellPhone cellPhone1 = new CellPhone();
        Scanner cellScanner = new Scanner(System.in);

        System.out.println("What is the serial number?:");
        cellPhone1.setSerialNumber(cellScanner.nextInt());

        cellScanner.nextLine();

        System.out.println("What model is the phone?:");
        cellPhone1.setModel(cellScanner.nextLine());

        System.out.println("Who is the carrier?:");
        cellPhone1.setCarrier(cellScanner.nextLine());

        System.out.println("What is the phone number?:");
        cellPhone1.setPhoneNumber(cellScanner.nextLine());

        System.out.println("Who is the owner of the phone?:");
        cellPhone1.setOwner(cellScanner.nextLine());





        CellPhone cellPhone2 = new CellPhone();

        System.out.println("What is the serial number?:");
        cellPhone2.setSerialNumber(cellScanner.nextInt());

        cellScanner.nextLine();

        System.out.println("What model is the phone?:");
        cellPhone2.setModel(cellScanner.nextLine());

        System.out.println("Who is the carrier?:");
        cellPhone2.setCarrier(cellScanner.nextLine());

        System.out.println("What is the phone number?:");
        cellPhone2.setPhoneNumber(cellScanner.nextLine());

        System.out.println("Who is the owner of the phone?:");
        cellPhone2.setOwner(cellScanner.nextLine());

        display(cellPhone1);
        display(cellPhone2);
        System.out.println(cellPhone1.dial(cellPhone2.getPhoneNumber()));
        System.out.println(cellPhone2.dial(cellPhone1.getPhoneNumber()));

        CellPhone cellPhone3 = new CellPhone(123456, "OnePlus 13", "Telus", "646-123-4566", "Edy");

        display(cellPhone3);

        System.out.println(cellPhone3.dial(cellPhone1));


    }


    public static void display(CellPhone phone) {
        System.out.println(phone.getOwner() + "'s Phone Properties:\n");
        System.out.println("Serial Number: " + phone.getSerialNumber());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Carrier: " + phone.getCarrier());
        System.out.println("Phone Number: " + phone.getPhoneNumber());
        System.out.println("Owner: " + phone.getOwner() + "\n");
    }

}
