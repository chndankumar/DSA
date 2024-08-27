package Array;

import java.util.Scanner;

/**
 * ceilandFloor of an number
 */
public class ceilandFloor {
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
        int ceil = 0;
        int floor = 0;
        while (lo < hi) {
            int min = (hi + lo) / 2;
            if (min == arr[min]) {
                System.out.println(min);
                ceil = arr[min];
                floor = arr[min];
                break;
            } else if (k < arr[min]) {
                hi = min - 1;
                ceil = arr[min];
            } else if (k > arr[min]) {
                lo = min + 1;
                floor = arr[min];
            }
        }
    }
}