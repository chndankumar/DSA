package Queue;

import java.util.Stack;

public class StackToQueueAddEffe {
    Stack<Integer> mainst = new Stack<>();
    Stack<Integer> helpst = new Stack<>();

    public void add(int val) {
        mainst.push(val);
    }

    public int remove() {
        while (mainst.size() != 1) {
            helpst.push(mainst.pop());
        }
        int val = mainst.pop();
        while (helpst.size() != 0) {
            mainst.push(helpst.pop());
        }
        return val;
    }

    public int peek() {
        while (mainst.size() != 1) {
            helpst.push(mainst.pop());
        }
        int val = mainst.peek();
        while (helpst.size() != 0) {
            mainst.push(helpst.pop());
        }
        return val;
    }
}
