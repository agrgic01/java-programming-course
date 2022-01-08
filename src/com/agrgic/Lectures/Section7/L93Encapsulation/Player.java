package com.agrgic.Lectures.Section7.L93Encapsulation;

public class Player {

    public String fullName;
    public int health;
    public String weapon;

    public void loseHealth(int damage) {

        health = health - damage;
        if (health <= 0) {
            System.out.println("Player knocked out");
            // Reduce number of lives remaining for the player
        }

    } // loseHealth method

    public int healthRemaining() {
        return health;
    }

}
