package com.agrgic.Lessons.Section7.L92CompositionPart2;

import com.agrgic.CodingExercises.CE31WallArea.Wall;

public class Main {

    public static void main(String[] args) {

        Floor floor = new Floor(4, 5);
        System.out.println("floor area is: " + floor.getArea());

        Walls walls = new Walls(4, "Blue", 2.4);
        walls.wallsDescription();

        Chair chair = new Chair("Razer", "Enki");
        chair.chairDescription();

        Bed bed = new Bed(1, 3, 0.5);
        System.out.println("bed volume is: " + bed.bedVolume());

        Bedroom bedroom = new Bedroom("Alens", floor, walls, chair, bed);
        bedroom.getFloor().cleanCarpet();
        bedroom.getFloor().cleanCarpet();
        bedroom.getWalls().hangPicture(0);
        bedroom.getWalls().hangPicture(5);
        bedroom.getChair().spinChair();
        bedroom.getBed().makeBed();
        bedroom.getBed().makeBed();
        bedroom.getBed().unmakeBed();
        bedroom.getBed().unmakeBed();
        bedroom.getBed().makeBed();



    } // main method

} // Main class
