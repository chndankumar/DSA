package Recursion;

import java.util.ArrayList;

public class getMazePath {
    public static void main(String[] args) {
        int sc = 0;
        int sr = 0;
        int dc = 2;
        int dr = 2;
        ArrayList<String> res = getPath(sr, sc, dr, dc);
        System.out.println(res);
    }

    private static ArrayList<String> getPath(int sr, int sc, int dr, int dc) {
        ArrayList<String> res = new ArrayList<>();
        if (sc == dc && sr == sc) {
            res.add("");
            return res;
        } else if (sc > dc || sr > dr) {
            return res;
        }
        ArrayList<String> rmove = getPath(sr + 1, sc, dr, dc);
        ArrayList<String> cmove = getPath(sr, sc + 1, dr, dc);
        for (String st : rmove) {
            res.add('v' + st);
        }
        for (String st : cmove) {
            res.add('h' + st);
        }
        return res;

    }
}
