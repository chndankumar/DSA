package Level_One_DSA.HashMapAndHeap;

import java.util.*;

public class HighFrequencyChar {
    public static void main(String[] args) {
        String str = "abaracadabara";
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            Character ch = str.charAt(i);
            if (hm.containsKey(ch)) {
                hm.put(ch, hm.get(ch) + 1);
            } else {
                hm.put(ch, 1);
            }
        }
        int max = Integer.MIN_VALUE;

        for (Character ch : hm.keySet()) {
            max = Math.max(max, hm.get(ch));
        }

    }
}
