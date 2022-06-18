package task.igor;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> st = Priorities.getStudents(Input.getInput());

        //Output
        System.out.println("\n\nOutput: ");
        for(Student elem : st) {
            System.out.println(elem.getName());
        }
    }
}
