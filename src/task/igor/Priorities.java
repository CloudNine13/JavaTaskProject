package task.igor;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Priorities {

    private Priorities(){}
    public static List<Student> getStudents(List<String> events) {
        // 8 students
        System.out.println("Number of events: " + events.get(0));
        List<Student> students = new ArrayList<>();

        for(int i = 1; i <= events.size() - 1; i++) {
            if (events.get(i).equals("SERVED")) {
                filterStudents(students);
            } else {
                // Adding new Student to List<Student>
                students.add(stringToStudent(events.get(i)));
            }
        }
        return students;
    }

    //Splitting strings and adding them to Student
    private static Student stringToStudent(String strings) {
        String[] parts = strings.split(" ");
        int id = Integer.parseInt(parts[3]);
        String name = parts[1];
        double cgpa = Double.parseDouble(parts[2]);
        return new Student(id, name, cgpa);
    }

    private static void filterStudents(List<Student> st) {
        // Sorted by CGPA
        st.sort(Comparator.comparingDouble(Student::getCGPA).reversed());
        // Filtered the same CGPA
        boolean sameCGPA = st.stream().skip(1).anyMatch(o -> o.getCGPA() == st.get(0).getCGPA());
        if(sameCGPA) {
            // Sorted by name
            st.sort(Comparator.comparing(Student::getName));

            /* This if does not filter anything because there is no same names in task input*/
            if(checkName(st)) {
                // Sorted by ID
                st.sort(Comparator.comparingInt(Student::getID));
            }
        }
        // Only one element should be removed
        st.remove(0);
    }

    private static boolean checkName(List<Student> st) {
        //Checking with hashset if list has same names
        List<String> matchArray = st.stream().map(Student::getName).collect(Collectors.toList());
        HashSet<String> matchSet = new HashSet<>(matchArray);
        return matchArray.size() > matchSet.size();
    }
}


