package java.task.igor;

public class Main {
    public static void main(String[] args) {
        //Making objects
        Input input = new Input();

        System.out.println(Priorities.getStudents(input.getInput()));
    }
}
