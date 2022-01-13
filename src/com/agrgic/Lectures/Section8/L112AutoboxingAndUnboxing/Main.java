package com.agrgic.Lectures.Section8.L112AutoboxingAndUnboxing;

import java.util.ArrayList;

class IntClass {

    private int integerField;

    public IntClass(int integerField) {
        this.integerField = integerField;
    }

    public int getIntegerField() {
        return integerField;
    }

    public void setIntegerField(int integerField) {
        this.integerField = integerField;
    }

}


public class Main {

    public static void main(String[] args) {
        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Tim");

        //can't store primitive data types in ArrayList
        //ArrayList<int> intArrayList = new ArrayList<int>();

        ArrayList<IntClass> intClassArrayList = new ArrayList<>();
        intClassArrayList.add(new IntClass(54));
        // Integer integer = new Integer(54);
        // Double doubleValue = new Double(12.25);


        ArrayList<Integer> intArrayList = new ArrayList<>();

        for (int i = 0; i <= 10; i++) {
            intArrayList.add(Integer.valueOf(i));
        }

        for (int i = 0; i < intArrayList.size(); i++) {
            System.out.println(i + " -> " + intArrayList.get(intArrayList.get(i)).intValue());
        }


        Integer myIntValue = 56; //Integer.valueOf(56);
        int myInt = myIntValue; //myIntValue.intValue();


        ArrayList<Double> myDoubleValues = new ArrayList<>();

        for (double dbl = 0.0; dbl <= 10; dbl += 0.5) {
            myDoubleValues.add(Double.valueOf(dbl));
        }

        for (int i = 0; i < myDoubleValues.size(); i++) {
            System.out.println(i + " -> " + myDoubleValues.get(i).doubleValue());
        }

    }

} //Main class
