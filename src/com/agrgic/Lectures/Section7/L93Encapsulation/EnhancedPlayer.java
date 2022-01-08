package com.agrgic.Lectures.Section7.L93Encapsulation;

public class EnhancedPlayer {

    /* fields */
    private String name;
    private int hitPoints = 100;
    private String weapon;

    /* constructor */
    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;

        if (health > 0 && health <= 100)
        this.hitPoints = health;

        this.weapon = weapon;
    }

    /* methods */
    public void loseHealth(int damage) {
        hitPoints = hitPoints - damage;
        if(hitPoints <= 0)
            System.out.println("Player has been knocked out");
    } // loseHealth method

    public int getHealth() {
        return hitPoints;
    }

} // EnhancedPlayer class
