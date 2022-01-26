package com.agrgic.Lectures.Section9.L125L126InterfaceChallenge;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Player tim = new Player("Tim", 10, 15);
        System.out.println(tim.toString());
        saveObject(tim);

        tim.setHitPoints(8);
        System.out.println(tim);
        tim.setWeapon("Stormbringer");
        saveObject(tim);
        // loadObject(tim);
        System.out.println(tim);

        ISaveable werewolf = new Monster("Dankan", 20, 40);
        System.out.println("Strength = " + ((Monster) werewolf).getStrength());
        saveObject(werewolf);

    } // "main" method

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" + "1 to enter a string\n" + "0 to quit");
        while (!quit) {
            System.out.println("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        } // "readValues" method

        return values;
    } // "readValues" method

    public static void saveObject(ISaveable objectToSave) {
        for (int i = 0; i < objectToSave.write().size(); i++) {
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device.");
        }
    } // "saveObject" method

    public static void loadObject(ISaveable objectToLoad) {
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    } // "loadObject" method

} // "Main" class
