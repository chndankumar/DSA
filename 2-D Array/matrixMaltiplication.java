import java.util.Scanner;

public class matrixMaltiplication {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int m1 = scn.nextInt();
        int[][] arr1 = new int[n1][m1];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                arr1[i][j] = scn.nextInt();
            }
        }
        int m2 = scn.nextInt();
        int[][] arr2 = new int[m2][n1];

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                arr2[i][j] = scn.nextInt();
            }
        }

        // column 1 == row2;
        // new array will be of row1 and column 2

        int[][] resArr = new int[n1][m2];

        int res = 1;
        for (int i = 0; i < arr1.length; i++) {

            for (int j = 0; j < arr2[0].length; j++) {

                int k = 0;
                int sum = 0;
                while (k < arr2.length) {
                    int num = arr1[i][k] * arr2[k][j];
                    sum = sum + num;
                }
                resArr[i][j] = sum;
            }
        }
    }
}