package Level_One_DSA.HashMapAndHeap;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class MergeKSortedList {
    public static class Pair implements Comparable<Pair> {
        int lidx;
        int idx;
        int val;

        public Pair(int lidx, int idx, int val) {
            this.idx = idx;
            this.lidx = lidx;
            this.val = val;
        }

        @Override
        public int compareTo(Pair o) {
            return this.val - o.val;
        }

    }

    public static void main(String[] args) {

        List<List<Integer>> listOfList = new ArrayList<>();
        PriorityQueue<Pair> pq = new PriorityQueue<>();

        for (int i = 0; i < listOfList.size(); i++) {
            pq.add(new Pair(i, 0, listOfList.get(i).get(0)));
        }
        List<Integer> li = new ArrayList<>();

        while (pq.size() != 0) {
            Pair p = pq.remove();
            li.add(p.val);
            int lidx = p.lidx;
            List<Integer> l = listOfList.get(lidx);
            int idx = p.idx;
            if (l.size() > idx + 1) {
                Integer nval = l.get(idx + 1);
                pq.add(new Pair(lidx + 1, idx + 1, nval));
            }
        }
    }
}
