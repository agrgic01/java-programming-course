package com.agrgic.Lessons.Section7.L92CompositionPart2;

public class Bedroom {

    private String name;
    private Floor floor;
    private Walls walls;
    private Chair chair;
    private Bed bed;

    public Bedroom(String name, Floor floor, Walls walls, Chair chair, Bed bed) {
        this.name = name;
        this.floor = floor;
        this.walls = walls;
        this.chair = chair;
        this.bed = bed;
    }

    public String getName() {
        return name;
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

} // Bedroom class
