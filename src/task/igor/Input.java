package task.igor;

import java.util.ArrayList;
import java.util.List;

public class Input {
    private Input() {}
    public static List<String> getInput() {
        List<String> input = new ArrayList<>();
        input.add("12");
        input.add("ENTER John 3.75 50");
        input.add("ENTER Mark 3.8 24");
        input.add("ENTER Shafaet 3.7 35");
        input.add("SERVED");
        input.add("SERVED");
        input.add("ENTER Samiha 3.85 36");
        input.add("SERVED");
        input.add("ENTER Ashley 3.9 42");
        input.add("ENTER Maria 3.6 46");
        input.add("ENTER Anik 3.95 49");
        input.add("ENTER Dan 3.95 50");
        input.add("SERVED");
        return input;
    }
}
