package Recursion;

public class floodFill {
    public static void main(String[] args) {
        int[][] arr = new int[5][7];
        int sc = 0;
        int sr = 0;
        int dc = 6;
        int dr = 7;
        printPath(arr, sr, sc, dr, dc, "");
    }

    private static void printPath(int[][] arr, int sr, int sc, int dr, int dc, String res) {
        if (sc == dc && sr == dr) {
            System.out.println(res);
            return;
        } else if (sc <= 0 || sr <= 0 || sc > dc || sr > dr) {
            return;
        } else if (arr[sr][sc] == 1) {
            return;
        }
        arr[sr][sc] = 1;
        printPath(arr, sr + 1, sc, dr, dc, res);
        printPath(arr, sr - 1, sc, dr, dc, res);
        printPath(arr, sr, sc + 1, dr, dc, res);
        printPath(arr, sr, sc - 1, dr, dc, res);
        arr[sr][sc] = 0;
    }
}
