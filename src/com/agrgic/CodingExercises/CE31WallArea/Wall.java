package com.agrgic.CodingExercises.CE31WallArea;

public class Wall {


    private double width;
    private double height;


    /* CONSTRUCTORS */
    public Wall() {
        this(0, 0);
    }

    public Wall(double width, double height) {

        this.width = width < 0 ? 0 : width;
        this.height = height < 0 ? 0 : height;

    }


    /* GETTERS */
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }


    /* SETTERS */
    public void setWidth(double width) {
        this.width = width < 0 ? 0 : width;
    }

    public void setHeight(double height) {
        this.height = height < 0 ? 0 : height;
    }


    /* METHODS */
    public double getArea() {
        return width * height;
    }


} // Wall class
