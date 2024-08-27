package Queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueToStackPushEffec {
    Queue<Integer> mainQ = new ArrayDeque<>();
    Queue<Integer> helpQ = new ArrayDeque<>();

    public int pop() {
        while (mainQ.size() != 1) {
            helpQ.add(mainQ.remove());
        }
        int val = mainQ.remove();
        while (helpQ.size() != 0) {
            mainQ.add(helpQ.remove());
        }
        return val;
    }

    public int peek() {
        while (mainQ.size() != 0) {
            helpQ.add(mainQ.remove());
        }
        int val = mainQ.remove();
        while (helpQ.size() != 0) {
            mainQ.add(helpQ.remove());
        }
        mainQ.add(val);
        return val;
    }

    public void push(int val) {
        mainQ.add(val);
    }
}
