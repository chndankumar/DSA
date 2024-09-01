package Level_One_DSA.HashMapAndHeap;

import java.util.*;

public class GetCommonElement1 {
    public static void main(String[] args) {
        int[] arr1 = new int[7];
        int[] arr2 = new int[7];
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i : arr1) {
            if (hm.containsKey(hm)) {
                hm.put(i, hm.get(i) + 1);
            } else {
                hm.put(i, 1);
            }
        }

        for (int i : arr2) {
            // if (hm.get(i) != null) {
            // System.out.println(i);
            // hm.put(i, null);
            // }
            if (hm.containsKey(i)) {
                System.out.println(i);
                hm.remove(i);
            }
        }
    }
}
