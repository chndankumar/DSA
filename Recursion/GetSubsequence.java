package Recursion;

import java.util.ArrayList;

public class GetSubsequence {
    public static void main(String[] args) {
        String str = "abcd";
        ArrayList<String> st = printSubsequence(str);
    }

    private static ArrayList<String> printSubsequence(String str) {
        ArrayList<String> res = new ArrayList<>();

        if (str.length() == 0) {
            res.add("");
            return res;
        }

        char ch = str.charAt(0);
        res = printSubsequence(str.substring(1));
        ArrayList<String> fres = new ArrayList<>();
        for (String s : res) {
            res.add("" + s);
            res.add(ch + s);
        }
        return null;

    }
}
