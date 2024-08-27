package Recursion;

public class printMazePathWithJump {
    public static void main(String[] args) {
        int sc = 1;
        int sr = 1;
        int dc = 3;
        int dr = 3;
        printPath(sr, sc, dr, dc, "");
        System.out.println(num);
    }

    static int num = 0;

    private static void printPath(int sr, int sc, int dr, int dc, String res) {
        if (sc == dc && sr == dr) {
            System.out.println(res);
            num++;
            return;
        }

        for (int i = 1; i <= dc - sc; i++) {
            printPath(sr, sc + 1, dr, dc, res + 'h' + i);
        }
        for (int i = 1; i <= dr - sr; i++) {
            printPath(sr + 1, sc, dr, dc, res + 'v' + i);
        }

        for (int i = 1; i <= dc - sc && i <= dr - sr; i++) {
            printPath(sr + 1, sc + 1, dr, dc, res + 'd' + i);
        }
    }
}
