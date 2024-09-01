package Level_One_DSA.HashMapAndHeap;

import java.util.*;

public class LongestConsecutive {
    public static void main(String[] args) {
        int[] arr = new int[7];
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i : arr) {
            if (hm.containsKey(hm)) {
                hm.put(i, hm.get(i) + 1);
            } else {
                hm.put(i, 1);
            }
        }

        for (int i : arr) {
            if (hm.containsKey(i - 1)) {
                hm.put(i, 0);
            } else {
                hm.put(i, 1);
            }
        }

        int res = 0;
        int size = 1;
        for (int i : arr) {
            if (hm.get(i) == 1) {
                int val = hm.get(i);
                int c = 1;
                while (hm.containsKey(val + c)) {
                    c++;
                }
                if (c > size) {
                    size = c;
                    res = val;
                }
            }
        }

        while (size != 0) {
            System.out.println(res);
            size--;
            res++;
        }

    }
}