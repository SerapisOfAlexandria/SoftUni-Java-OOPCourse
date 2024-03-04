package _05_Inheritance._04_StackOfStrings;

import java.util.ArrayList;
import java.util.List;

public class StackOfStrings {
    private List<String> data;

    public StackOfStrings() {
        this.data = new ArrayList<>();
    }

    public void push(String item) {
        this.data.add(data.size() , item);
    }

    public String pop() {
        if (!this.data.isEmpty()) {
            return this.data.remove(0);
        }
        return null;
    }

    public String peek() {
        return this.data.get(data.size() - 1);
    }

    public boolean isEmpty() {
        return this.data.isEmpty();
    }

}
