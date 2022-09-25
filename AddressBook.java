package org.example;

import java.util.Scanner;

public class AddressBook {
    void addContactDetail() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Name ");
        String first_name = sc.next();
        System.out.println("Enter the last Name ");
        String last_name = sc.next();
        System.out.println("Enter the Address ");
        String address = sc.next();
        System.out.println("Enter City ");
        String city = sc.next();
        System.out.println("Enter State ");
        String state = sc.next();
        System.out.println("Enter Zip Code  ");
        int PinCode = sc.nextInt();
        System.out.println("Enter your Mobile Number ");
        String mobileNumber = sc.next();
        System.out.println("Enter Email Id  ");
        String email = sc.next();
        Contact add = new Contact(first_name, last_name, address, city, state, PinCode, mobileNumber, email);
        add.viewContact();
    }
}
