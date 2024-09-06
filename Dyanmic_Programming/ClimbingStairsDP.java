package Dyanmic_Programming;

public class ClimbingStairsDP {
    public static void main(String[] args) {
        int n = 5;
        int res = countPath(n);
        System.out.println(res);
    }

    private static int countPath(int n) {
        int[] arr = new int[n + 1];
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                arr[i] = 0;
            } else if (i == 1) {
                arr[i] = 1;
            } else if (i == 2) {
                arr[i] = 2;
            } else {
                arr[i] = arr[i - 1] + arr[i - 2] + arr[i - 3];
            }
        }
        return arr[n];
    }
}
