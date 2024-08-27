import java.util.*;

public class seddelPoint {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        for (int i = 0; i < arr.length; i++) {
            int temp = 0;
            int col = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] < temp) {
                    temp = arr[i][j];
                    col = j;
                }
            }
            boolean flag = true;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][col] < arr[j][col]) {
                    flag = false;
                }
            }
            if (flag == true) {
                return;
            }
        }
    }
}
