package com.epam.p01creational.p01singleton.p1simple;

public class Student {

    private String name;
    private String lastName;
    private String group;

    private Student() {
    }

    public void study() {
        System.out.print("Learning");
    }
}
