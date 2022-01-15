package com.agrgic.CodingExercises.CE45Banking;

import com.agrgic.Lectures.Section8.L113L114L115AutoboxingAndUnboxingChallenge.Branch;

import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> branches = new ArrayList<>();

    public Bank(String name) {
        this.name = name;
    }
}
