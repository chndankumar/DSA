package Recursion;

public class printMazePath {
    public static void main(String[] args) {
        int sc = 1;
        int sr = 1;
        int dc = 3;
        int dr = 3;
        printPath(sr, sc, dr, dc, "");
    }

    private static void printPath(int sr, int sc, int dr, int dc, String res) {
        if (sr == dr && sc == dc) {
            System.out.println(res);
            return;
        }
        if (sr < dr) {
            printPath(sr + 1, sc, dr, dc, res + "v");
        }
        if (sc < dc) {
            printPath(sr, sc + 1, dr, dc, res + "h");
        }
    }
}
