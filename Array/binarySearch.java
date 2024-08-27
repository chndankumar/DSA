package Array;

import java.util.Scanner;

/**
 * binarySearch
 */
public class binarySearch {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int k = scn.nextInt();
        int lo = 0;
        int hi = n - 1;
        while (lo < hi) {
            int min = (hi + lo) / 2;
            if (k == arr[min]) {
                System.out.println(min);
                break;
            } else if (k < arr[min]) {
                hi = min - 1;
            } else if (k > arr[min]) {
                lo = min + 1;
            }
        }
        System.out.println("not found");

    }
}