package com.igor.app;

public class Student {

    private final int id;
    private final String name;
    private final double cgpa;

    //Constructor
    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    //ID getter
    public int getID() { return this.id; }
    //Name getter
    public String getName() { return this.name; }
    //CGPA getter
    public double getCGPA() { return this.cgpa; }
}

