package Recursion;

import java.util.ArrayList;

public class getMazePathJump {
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
        if (sc == dc && sr == dr) {
            res.add("");
            return res;
        }

        for (int i = 1; i <= dc - sc; i++) {
            ArrayList<String> hmove = getPath(sr, sc + i, dr, dc);
            for (String st : hmove) {
                res.add("h" + i + st);
            }
        }

        for (int i = 1; i <= dr - sr; i++) {
            ArrayList<String> vmove = getPath(sr + i, sc, dr, dc);
            for (String st : vmove) {
                res.add("v" + i + st);
            }
        }

        for (int i = 1; i <= dr - sr && i <= dc - sc; i++) {
            ArrayList<String> dmove = getPath(sr + i, sc + i, dr, dc);
            for (String st : dmove) {
                res.add("d" + i + st);
            }
        }
        return res;
    }
}
