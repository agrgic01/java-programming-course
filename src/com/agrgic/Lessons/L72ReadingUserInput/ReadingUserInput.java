package com.agrgic.Lessons.L72ReadingUserInput;

import java.util.Scanner;

public class ReadingUserInput {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth: ");
        int age = 2021 - scanner.nextInt();
        scanner.nextLine(); // handle next line character (enter key)

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Your name is " + name + " and you are " + age + " years old.");

        scanner.close();

    } // main method


} // ReadingUserInput class
