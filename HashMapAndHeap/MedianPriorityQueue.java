package Level_One_DSA.HashMapAndHeap;

import java.util.*;

/**
 * MediumPriorityQueue
 */
public class MedianPriorityQueue {
    public static class MedianQueue {
        PriorityQueue<Integer> max = new PriorityQueue<>();
        PriorityQueue<Integer> min = new PriorityQueue<>(Collections.reverseOrder());
        int peek = min.peek();
        int size = min.size() + max.size();

        public void add(int data) {
            if (size == 0) {
                min.add(data);
            }
            if (data > peek) {
                max.add(data);
                if (min.size() < max.size()) {
                    min.add(max.remove());
                }
            } else {
                min.add(data);
                if (min.size() - max.size() > 1) {
                    max.add(min.remove());
                }
            }
        }

        public int remove() {
            if (size <= 0) {
                return -1;
            }
            int res = min.remove();
            if (min.size() < max.size()) {
                min.add(max.remove());
            }
            return res;
        }
    }
}