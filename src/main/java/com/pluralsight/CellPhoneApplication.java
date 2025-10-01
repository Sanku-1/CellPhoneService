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


        System.out.println("Serial Number: " + cellPhone1.getSerialNumber());
        System.out.println("Model: " + cellPhone1.getModel());
        System.out.println("Carrier: " + cellPhone1.getCarrier());
        System.out.println("Phone Number: " + cellPhone1.getPhoneNumber());
        System.out.println("Owner: " + cellPhone1.getOwner());


    }
}
