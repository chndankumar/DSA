package Queue;

import java.util.Stack;

public class StackToQueueRemoveEffe {
    Stack<Integer> mainst = new Stack<>();
    Stack<Integer> helpst = new Stack<>();

    public void add(int val) {
        while (mainst.size() != 0) {
            helpst.push(mainst.pop());
        }
        mainst.push(val);

        while (helpst.size() != 0) {
            mainst.push(helpst.pop());
        }
    }

    public int remove() {
        return mainst.pop();
    }

    public int peek() {
        return mainst.peek();
    }
}
