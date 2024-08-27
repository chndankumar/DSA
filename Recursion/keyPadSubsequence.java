package Recursion;

import java.util.ArrayList;

public class keyPadSubsequence {
    public static void main(String[] args) {
        String str = "576";
        ArrayList<String> res = getCombination(str);
        System.out.println(res);
    }

    static String[] arr = { ".", "abc", "def", "ghi", "jkl", "mnop", "qrst", "uv", "w", "xyz" };

    private static ArrayList<String> getCombination(String str) {
        ArrayList<String> res = new ArrayList<>();

        if (str.length() == 0) {
            res.add("");
            return res;
        }

        char ch = str.charAt(0);
        ArrayList<String> subRes = getCombination(str.substring(1));
        String s = arr[ch - '0'];

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            for (String st : subRes) {
                st = c + st;
                res.add(st);
            }
        }
        return res;

    }
}
