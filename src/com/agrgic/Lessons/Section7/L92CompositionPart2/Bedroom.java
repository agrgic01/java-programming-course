package com.agrgic.Lessons.Section7.L92CompositionPart2;

public class Bedroom {

    private Floor floor;
    private Walls walls;
    private Chair chair;
    private Bed bed;

    public Bedroom(Floor floor, Walls walls, Chair chair, Bed bed) {
        this.floor = floor;
        this.walls = walls;
        this.chair = chair;
        this.bed = bed;
    }

    public Floor getFloor() {
        return floor;
    }

    public Walls getWalls() {
        return walls;
    }

    public Chair getChair() {
        return chair;
    }

    public Bed getBed() {
        return bed;
    }

    /* methods */
    public void hideObject() {

    }

} // Bedroom class
