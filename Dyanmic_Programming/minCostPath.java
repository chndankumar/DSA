package Dyanmic_Programming;

// need to check the edge case like if i<0 or j<arr.length
public class minCostPath {
    public static void main(String[] args) {
        int n = 7;
        int[][] arr = new int[n][n];
        int[][] dpArr = new int[n][n];

        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = arr.length - 1; j >= 0; j--) {
                dpArr[i][j] = Math.min(arr[i][j + 1], arr[i - 1][j]) + dpArr[i][j];
            }
        }
        int res = Math.min(dpArr[0][1], dpArr[1][0]);
    }
}
