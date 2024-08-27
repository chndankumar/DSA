package Queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueToStack {
    Queue<Integer> mainQ;
    Queue<Integer> helpQ;

    public void queueToStack() {
        mainQ = new ArrayDeque<>();
        helpQ = new ArrayDeque<>();
    }

    public int size() {
        return mainQ.size();
    }

    public void push(int val) {
        helpQ.add(val);
        while (mainQ.size() != 0) {
            helpQ.add(mainQ.remove());
        }
        Queue<Integer> poiter = mainQ;
        mainQ = helpQ;
        helpQ = poiter;
        helpQ.clear();
    }

    public int remove() {
        return mainQ.remove();
    }

}
