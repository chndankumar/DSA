package Level_One_DSA.HashMapAndHeap;

import java.util.*;

public class KLargestElements {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int[] rank = { 23, 87, 19, 29, 48, 40, 67 };
        int k = 5;
        for (int i : rank) {
            if (pq.size() < k) {
                pq.add(i);
            } else {
                if (pq.peek() < i) {
                    pq.remove();
                    pq.add(i);
                }
            }
        }

        for (Integer n : pq) {
            System.out.println(n);
        }
    }
}
