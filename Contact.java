package org.example;

public class Contact {
    private String first_name;
    private String last_name;
    private String address;
    private String city;
    private String state;
    private int pinCode;
    private String mobileNumber;
    private String email;

    public Contact(String first_name, String last_name, String address, String city, String state, int pinCode, String mobileNumber, String email) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.pinCode = pinCode;
        this.mobileNumber = mobileNumber;
        this.email = email;
    }
      @Override
    public String toString(){
        return first_name + " " + last_name + " " + address + " "
                + city + " " + state + " " + pinCode + " " + mobileNumber + " "
                + email;
    }

//    void viewContact() {
//        System.out.println("Contact Detail are..........");
//        System.out.println("Name = " + first_name + " " + last_name + " ");
//        System.out.println("Address = " + address);
//        System.out.println("City = " + city);
//        System.out.println("State  = " + state);
//        System.out.println("Zip Code = " + pinCode);
//        System.out.println("Mobile Number = " + mobileNumber);
//        System.out.println("Email Address = " + email);
//    }
}
