package Level_One_DSA.HashMapAndHeap;

import java.util.*;

public class SortnearlySortedArr {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int[] arr = { 2, 3, 1, 4, 6, 7, 5, 8, 9 };
        int k = 2;
        for (int i : arr) {
            if (pq.size() == k + 1) {
                System.out.println(pq.remove());
            }
            pq.add(i);
        }
        while (pq.size() != 0) {
            System.out.println(pq.remove());
        }
    }
}
