package com.agrgic.Lessons.Section7.L93Encapsulation;

public class Main {

    public static void main(String[] args) {

        /*
        Player player = new Player();
        player.name = "Tim";
        player.health = 20;
        player.weapon = "Sword";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());

        damage = 11;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());
        */

        EnhancedPlayer player = new EnhancedPlayer("Tim", 500, "Sword");
        System.out.println("Initial health is " + player.getHealth());
        player.loseHealth(200);
        System.out.println(player.getHealth());

    } // main method

} // Main class
