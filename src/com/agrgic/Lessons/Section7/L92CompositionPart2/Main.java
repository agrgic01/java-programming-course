package com.agrgic.Lessons.Section7.L92CompositionPart2;

import com.agrgic.CodingExercises.CE31WallArea.Wall;

public class Main {

    public static void main(String[] args) {

        Floor floor = new Floor(4, 5);
        Walls walls = new Walls(4, "Blue", 2.4);
        Chair chair = new Chair("Razer", "Enki");
        Bed bed = new Bed(1, 3, 0.5);

        Bedroom bedroom = new Bedroom(floor, walls, chair, bed);
        bedroom.getFloor().cleanCarpet();
        bedroom.getFloor().cleanCarpet();
        bedroom.getWalls().hangPicture(0);
        bedroom.getWalls().hangPicture(5);

    } // main method

} // Main class
