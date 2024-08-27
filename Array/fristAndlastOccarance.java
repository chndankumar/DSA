package Array;

import java.util.Scanner;

public class fristAndlastOccarance {
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
        int fi = -1;
        while (lo < hi) {
            int min = (lo + hi) / 2;
            if (k < arr[min]) {
                hi = min - 1;
            } else if (k > arr[min]) {
                lo = min + 1;
            } else {
                fi = min;
                hi = min - 1;
            }
        }

        lo = 0;
        hi = arr.length - 1;
        int li = arr.length;
        while (li < hi) {
            int min = (lo + hi) / 2;
            if (k < arr[min]) {
                hi = min - 1;
            } else if (k > arr[min]) {
                li = min + 1;
            } else {
                li = min;
                lo = min + 1;
            }
        }
    }
}
