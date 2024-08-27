package Array;

import java.util.Scanner;

public class rotateArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int k = scn.nextInt();

        inverse(arr, 0, n - k - 1);
        inverse(arr, n - k, n - 1);
        inverse(arr, 0, n - 1);
    }

    public static void inverse(int[] arr, int li, int hi) {
        while (li < hi) {
            int t = arr[li];
            arr[li] = arr[hi];
            arr[hi] = t;
        }

    }
}
