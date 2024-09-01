package Level_One_DSA.HashMapAndHeap;

import java.util.*;

public class introtoHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("india", 200);
        hm.put("chaina", 250);
        hm.put("USA", 25);
        hm.put("Russia", 20);
        hm.put("itly", 15);
        // will print the all the key and pair seperated by comma
        System.out.println(hm);

        Integer num = hm.get("ndia");
        // will print the null as India is not present in the map
        System.out.println(num);

        num = hm.get("india");
        // will print the value for that key
        System.out.println(num);

        // will return ture and falue depend upon the value present in hasmap
        System.out.println(hm.containsKey("shee lanka"));

        // return the Set that contain all unique value
        Set<String> key = hm.keySet();

        // run the loop on each
        for (String keys : hm.keySet()) {
            num = hm.get(keys);
            System.out.println(num);
        }

        hm.put("usa", null);
        System.out.println(hm.get("usa"));
        // remove the value
        hm.remove("itly");

        System.out.println(hm);

    }
}
