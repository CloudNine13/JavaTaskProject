package com.igor.app;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> st = Priorities.getStudents(Input.getInput());

        //Output
        System.out.println("\nOutput: ");
        for(Student elem : st) {
            System.out.println(elem.getName());
        }
    }
}
