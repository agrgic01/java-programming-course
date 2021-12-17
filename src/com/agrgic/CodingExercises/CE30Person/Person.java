package com.agrgic.CodingExercises.CE30Person;

public class Person {


    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return (age < 0 || age > 100) ? 0 : age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isTeen() {
        return age >= 13 && age <= 19;
    }

    public String getFullName() {

        firstName = firstName == null ? "" : firstName;
        lastName = lastName == null ? "" : lastName;

        if (firstName.isEmpty())
            return lastName;
        else if (lastName.isEmpty())
            return firstName;

        return (firstName + " " + lastName).trim();

    } // getFullName method


} // Person class
