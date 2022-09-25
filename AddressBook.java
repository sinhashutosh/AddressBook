package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    static final int Add_Contact = 1;
    static final int Edit_Address_book = 2;
    Scanner sc = new Scanner(System.in);
    boolean status = false;

    public void operation() {
        ArrayList<AddContact> list = new ArrayList<AddContact>();
        System.out.println("If You want to Add Contact Enter 1 ");
        int choice = sc.nextInt();
        if (choice == Add_Contact) {
            AddContact add = new AddContact();
            add.addContact();
            list.add(add);
            status = true;
            while (status) {
                System.out.println("Enter 1 for Add Contact ");
                System.out.println("Enter 2 for Edit Contact ");
                System.out.println("Enter 0 for exit ");
                choice = sc.nextInt();
                if (choice == 0) {
                    status = false;
                }
                if (choice == Add_Contact) {
                    add.addContact();
                    list.add(add);
                } else if (choice == Edit_Address_book) {
                    System.out.println("Enter first name of contact to edit");
                    String fname = sc.next();
                    for (int i = 0; i < list.size(); i++) {
                        if (fname.equalsIgnoreCase(list.get(i).getFirst_Name())) {
                            AddContact newentry = new AddContact();
                            newentry.addContact();
                            list.set(i, newentry);
                            System.out.println("Editing Done... ");
                            break;
                        }
                    }
                }
            }

        } else {
            status = false;
        }
        for (int j = 0; j < list.size(); j++) {
            System.out.println("entered addresses are" + list.get(j));
        }
    }
}

