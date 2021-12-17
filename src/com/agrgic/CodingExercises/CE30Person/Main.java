package com.agrgic.CodingExercises.CE30Person;

public class Main {


    public static void main(String[] args) {

        Person person = new Person();
        person.setFirstName("John");
        person.setLastName("Smith");
        System.out.println(person.getFirstName());
        System.out.println(person.getFullName());
        person.setFirstName("");
        System.out.println(person.getFullName());
        person.setAge(123);
        System.out.println(person.getAge());
        person.setAge(25);
        System.out.println(person.getAge());

    }


}
