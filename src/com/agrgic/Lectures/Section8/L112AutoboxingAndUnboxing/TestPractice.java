package com.agrgic.Lectures.Section8.L112AutoboxingAndUnboxing;

import java.util.ArrayList;

class IntTestClass {

    private int myInt;

    public IntTestClass(int myInt) {
        this.myInt = myInt;
    }

    public int getMyInt() {
        return myInt;
    }

    public void setMyInt(int myInt) {
        this.myInt = myInt;
    }

}

public class TestPractice {

    public static void main(String[] args) {
        ArrayList<IntTestClass> intArrayList = new ArrayList<>();
        intArrayList.add(new IntTestClass(54));
        System.out.println(intArrayList.get(0).getMyInt());
        intArrayList.add(new IntTestClass(32));
        System.out.println(intArrayList.get(1).getMyInt());

        ArrayList<Integer> newIntArrayList = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            newIntArrayList.add(i);
        }
        for (int i = 0; i < newIntArrayList.size(); i++) {
            System.out.println(newIntArrayList.get(i));
        }

        Integer myIntValue = 56;
        int myInt = myIntValue;
        System.out.println(myInt);

        Double myDoubleValue = 54.45;
        double myDouble = myDoubleValue;
        System.out.println(myDouble);

    }

} //TestPractice
