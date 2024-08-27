
// need to try onced
import java.util.Scanner;

public class shellRoatate {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        int s = 2;
        int r = 2;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        int sc = s - 1;
        int sr = s - 1;
        int dr = arr.length - s;
        int dc = arr.length - s;

        int size = 2 * (arr.length - 2 * s) - 2 * (arr[0].length - 2 * s) - 4;

        r = r % size;
        if (r <= 0) {
            r = size + r;
        }

        int[] helper = new int[size];
        int k = 0;

        for (int i = sr, j = sc; i < dr; i++) {
            helper[k] = arr[i][j];
        }

        for (int i = dr, j = sc + 1; j < dc; j++) {
            helper[k] = arr[i][j];
        }

        for (int i = dr - 1, j = dc; j < dc; i--) {
            helper[k] = arr[i][j];
        }

        for (int i = sr, j = dc - 1; j < dc; j--) {
            helper[k] = arr[i][j];
        }

    }
}
