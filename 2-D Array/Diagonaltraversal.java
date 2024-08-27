import java.util.Scanner;

public class Diagonaltraversal {
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
            int k = i;
            for (int j = 0; j < arr.length; j++) {
                System.out.println(arr[j][k]);
                k++;
            }
        }

    }
}
