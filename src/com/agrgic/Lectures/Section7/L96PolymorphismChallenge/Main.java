package com.agrgic.Lectures.Section7.L96PolymorphismChallenge;

public class Main {

    public static void main(String[] args) {

        System.out.println("*RANDOM CAR GENERATOR* \n");

        for (int i = 0; i < 5; i++) {
            Car car = randomNumber();
            System.out.println(car.getName() + "\n CYLINDERS: " + car.getCylinders() + "\n TOP SPEED: " + car.topSpeed() + "\n ENGINE TYPE: " + car.engineType() + "\n SEATS MATERIAL: " + car.seatsMaterial() + "\n");
        }

    } // main method

    public static Car randomNumber() {

        int randomNum = (int) (Math.random() * 3) + 1;

        return switch (randomNum) {
            case 1 -> new buba();
            case 2 -> new fico();
            case 3 -> new peglica();
            default -> null;
        };

    } // randomNumber method

} // Main class

