package Recursion;

import java.util.ArrayList;

public class getStairPath {
    public static void main(String[] args) {
        int n = 2;
        ArrayList<String> res = getStep(n);
        System.out.println(res);
    }

    private static ArrayList<String> getStep(int n) {
        ArrayList<String> res = new ArrayList<>();
        if (n == 0) {
            res.add("");
            return res;
        } else if (n < 0) {
            return res;
        }

        ArrayList<String> path1 = getStep(n - 1);
        ArrayList<String> path2 = getStep(n - 2);
        ArrayList<String> path3 = getStep(n - 3);

        for (String st : path1) {
            res.add(1 + st);
        }
        for (String st : path2) {
            res.add(2 + st);
        }
        for (String st : path3) {
            res.add(3 + st);
        }

        // for (int i = 1; i <= n; i++) {
        // ArrayList<String> subRes = getStep(n - i);
        // for (String st : subRes) {
        // st = i + st;
        // res.add(st);
        // }
        // }
        return res;
    }
}
