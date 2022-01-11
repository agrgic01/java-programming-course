package com.agrgic.Lectures.Section8.L105L106L107ListAndArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();


    public static void main(String[] args) {

        boolean quit = false;
        int choice = 0;

        printInstructions();

        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    processArrayList();
                    break;
                case 7:
                    quit = true;
                    break;
            }
        }

    } //main method


    public static void printInstructions() {

        System.out.println("\r");
        System.out.println("Press");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search for an item on the list.");
        System.out.println("\t 6 - To quit the application");

    } //printInstructions method


    public static void addItem() {

        System.out.print("Please enter the grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());

    } //addItem method


    public static void modifyItem() {

        System.out.print("Enter item name: ");
        String position = scanner.nextLine();

        System.out.print("Enter replacement item: ");
        String newItem = scanner.nextLine();

        groceryList.modifyGroceryItem(position, newItem);

    } //modifyItem method


    public static void removeItem() {

        System.out.print("Enter item name: ");
        groceryList.removeGroceryItem(scanner.nextLine());

    } //removeItem method


    public static void searchForItem() {

        System.out.print("Enter item to search for: ");
        String searchItem = scanner.nextLine();

        if (groceryList.onFile(searchItem))
            System.out.println("Found " + searchItem + " in our grocery list.");
        else
            System.out.println(searchItem + " is not in the shopping list.");

    } //searchForItem method


    public static void processArrayList() {

        ArrayList<String> newArray = new ArrayList<>(groceryList.getGroceryList());

        ArrayList<String> nextArray = new ArrayList<>(groceryList.getGroceryList());

        String[] myArray = new String[groceryList.getGroceryList().size()];
        myArray = groceryList.getGroceryList().toArray(myArray);

    }


} //Main class
