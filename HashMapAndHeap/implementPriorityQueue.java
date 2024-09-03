package Level_One_DSA.HashMapAndHeap;

import java.util.ArrayList;

public class implementPriorityQueue {
    ArrayList<Integer> li = new ArrayList<>();

    public void add(int data) {
        li.add(data);
        upheapify(li.get(data));
    }

    public int remove() {
        if (li.size() == 0) {
            return -1;
        }
        swap(0, li.size() - 1);
        int res = li.remove(li.size() - 1);
        // here we frist swap value to last then remove just beacause in arraylist
        // remove from any index make log n beacuse after removel shift the value so we
        // remove from last and this is o1
        downheapify(0);
        return res;
    }

    private void downheapify(int i) {
        if (i == li.size() - 1) {
            return;
        }
        int min = i;
        int lc = i * 2 + 1;
        int rc = i * 2 + 2;
        if (li.size() > lc && li.get(lc) < li.get(i)) {
            min = lc;
        }
        if (li.size() > rc && li.get(lc) < li.get(min)) {
            min = rc;
        }
        if (min != i) {
            swap(i, min);
            upheapify(min);
        }
    }

    private void upheapify(Integer idx) {
        int p = (idx - 1) / 2;
        if (li.get(p) < li.get(idx)) {
            return;
        }
        swap(p, idx);
        upheapify(p);
    }

    private void swap(int p, Integer idx) {
        int pVal = li.get(p);
        int chVal = li.get(idx);
        li.set(idx, pVal);
        li.set(p, chVal);
    }
}
