package Recursion;

public class nQueen {
    public static void main(String[] args) {
        int[][] arr = new int[4][4];
        printCombination(arr, 0, "");
    }

    private static void printCombination(int[][] arr, int row, String res) {
        if (arr.length == row) {
            System.out.println(res);
            return;
        }

        for (int col = 0; col < arr.length; col++) {

            if (isSafe(arr, row, col)) {

                arr[row][col] = 1;
                printCombination(arr, row + 1, res + row + "-" + col + ", ");
                arr[row][col] = 0;

            }
        }
    }

    private static boolean isSafe(int[][] arr, int row, int col) {

        for (int k = row; k >= 0; k--) {
            if (arr[k][col] == 1) {
                return false;
            }
        }

        int n = row - 1;
        int m = col - 1;
        while (n >= 0 && m >= 0) {
            if (arr[n][m] == 1) {
                return false;
            }
            n--;
            m--;
        }

        n = row - 1;
        m = col + 1;
        while (n >= 0 && m < arr[0].length) {
            if (arr[n][m] == 1) {
                return false;
            }
            n--;
            m++;
        }
        return true;
    }
}
