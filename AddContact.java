package org.example;

import java.util.Scanner;

public class AddContact {
    private String first_name;
    private String last_name;
    private String address;
    private String city;
    private String state;
    private int zip_code;
    private int phone_number;
    private String email;
    Scanner sc = new Scanner(System.in);

    void addContact() {
        // AddContact addContact = new AddContact();
        System.out.println("Enter the First Name ");
        this.first_name = sc.next();
        System.out.println("Enter the last Name ");
        this.last_name = sc.next();
        System.out.println("Enter the Address ");
        this.address = sc.next();
        System.out.println("Enter City ");
        this.city = sc.next();
        System.out.println("Enter State ");
        this.state = sc.next();
        System.out.println("Enter Zip Code  ");
        this.zip_code = sc.nextInt();
        System.out.println("Enter your Mobile Number ");
        this.phone_number = sc.nextInt();
        System.out.println("Enter Email Id  ");
        this.email = sc.next();

    }

    @Override
    public String toString() {
        return first_name + " " + last_name + " " + address + " " + city + " " + city
                + " " + zip_code + " " + phone_number + " " + email;
    }

    public String getFirst_Name() {
        return first_name;
    }

    public void setFirst_Name(String first_Name) {
        this.first_name = first_Name;
    }

    public String getLast_Name() {
        return last_name;
    }

    public void setLast_Name(String last_Name) {
        this.last_name = last_Name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZip_code() {
        return zip_code;
    }

    public void setZip_code(int zip_code) {
        this.zip_code = zip_code;
    }

    public int getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(int phone_number) {
        this.phone_number = phone_number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
