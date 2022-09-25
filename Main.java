package org.example;

public class Main {
    public static void main(String[] args) {
        {
            System.out.println("Welcome to Address Book...");
            AddressBook addressBook1 = new AddressBook();
            AddressBook addressBook2 = new AddressBook();
            AddressBook addressBook3 = new AddressBook();
            addressBook1.operation();
            addressBook2.operation();
            addressBook3.operation();
        }
    }
}
