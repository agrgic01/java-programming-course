package com.agrgic.Lessons.Section7.L92CompositionPart2;

public class Chair {

    private String manufacturer;
    private String model;

    public Chair(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    /* methods */
    public void chairDescription() {
        System.out.println("Chair manufacturer is " + manufacturer + " and the model is " + model + ".");
    }

    public void spinChair() {
        System.out.println("You spin the chair, WHEE...");
    }


} // Chair class
