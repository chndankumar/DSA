package Dyanmic_Programming;

public class MaximumGoldDP {
    public static void main(String[] args) {
        int n = 7;
        int[][] arr = new int[n][n];
        int[][] dpArr = new int[n][n];

        for (int col = arr.length - 2; col >= 0; col--) {
            for (int row = arr.length - 1; row >= 0; row--) {
                if(col == arr[0].length){
                    dpArr[row][col]= arr[][];
                }
            }
        }
        int res = Math.min(dpArr[0][1], dpArr[1][0]);
    }
}
