package Level_One_DSA.HashMapAndHeap;

import java.util.*;

public class introToPriorityQueue {
    public static void main(String[] args) {
        // by default lowest have high priority
        // if you want you reverse the order by putting "Collection.reverseOrder()"
        // add and remove will have time complexcity of log n while peek has o(1)

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int[] rank = { 23, 87, 19, 29, 48, 40, 67 };
        for (int i : rank) {
            pq.add(i);
        }
        for (Integer i : pq) {
            System.out.println(i);
        }
        System.out.println(pq.remove());
        System.out.println(pq.peek());

        // this can be use to
    }
}
