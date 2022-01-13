package com.agrgic.Lectures.Section8.L108L109L110L111ArrayListChallenge;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("091 111 111");


    public static void main(String[] args) {

        boolean quit = false;

        startPhone();
        printActions();

        while (!quit) {
            System.out.println("\nEnter action: (6 to show available actions)");

            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("\nShutting down...");
                    quit = true;
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;

                case 2:
                    addNewContact();
                    break;

                case 3:
                    updateContact();
                    break;

                case 4:
                    removeContact();
                    break;

                case 5:
                    queryContact();
                    break;

                case 6:
                    printActions();
                    break;
            }
        }

    } //main method

    private static void addNewContact() {
        System.out.println("Enter new contact name: ");
        String name = scanner.nextLine();

        System.out.println("Enter phone number: ");
        String phone = scanner.nextLine();

        Contact newContact = Contact.createContact(name, phone);

        if (mobilePhone.addNewContact(newContact))
            System.out.println("New contact added " + name + " -> " + phone);
        else
            System.out.println("Cannot add, contact '" + name + "' already exists");
    }


    private static void updateContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();

        Contact existingContactRecord = mobilePhone.queryContact(name);

        if (existingContactRecord == null) {
            System.out.println("Contact not found");
            return;
        }

        System.out.print("Enter new contact name: ");
        String newName = scanner.nextLine();

        System.out.print("Enter new contact phone number: ");
        String newPhone = scanner.nextLine();

        Contact updatedContact = Contact.createContact(newName, newPhone);

        if (mobilePhone.updateContact(existingContactRecord, updatedContact))
            System.out.println("Contact Updated Successfully");
        else
            System.out.println("Error Updating Contact");
    }


    private static void removeContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();

        Contact existingContact = mobilePhone.queryContact(name);

        if (existingContact == null) {
            System.out.println("Contact name not found");
            return;
        }

        if (mobilePhone.removeContact(existingContact))
            System.out.println("Contact Deleted");
        else
            System.out.println("Error Deleting Contact");
    }


    private static void queryContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();

        Contact existingContact = mobilePhone.queryContact(name);

        if (existingContact == null) {
            System.out.println("Contact name not found");
            return;
        }
        System.out.println("Name: " + existingContact.getName() + " phone number is " + existingContact.getPhoneNumber());
    }


    private static void startPhone() {
        System.out.println("Starting Phone...");
    }


    private static void printActions() {
        System.out.println("\rAvailable Actions:\npress");
        System.out.println(
                "0 - to shutdown\n" +
                        "1 - to print contacts\n" +
                        "2 - to add a new contact\n" +
                        "3 - to update an existing contact\n" +
                        "4 - to remove an existing contact\n" +
                        "5 - query if an existing contact exists\n" +
                        "6 - to print a list of available actions");
        System.out.println("\rChoose your action");
    }

} //Main class
