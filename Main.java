package org.example;

public class Main {
    public static  void main(String[] args) {
        System.out.println("Welcome to Address Book System");
        AddressBook address1 = new AddressBook();
        AddressBook address2 = new AddressBook();
        System.out.println("Enter First Contact Detail ...");
        address1.addContactDetail();
        System.out.println("*****************************************************");
        System.out.println("Enter Second Contact Detail ");
        address2.addContactDetail();
    }
}
