package Array;

import java.util.Scanner;

public class sumOf2Array {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n1 = scn.nextInt();
        int[] arr1 = new int[n1];

        for (int i = 0; i < n1; i++) {
            arr1[i] = scn.nextInt();
        }

        int n2 = scn.nextInt();
        int[] arr2 = new int[n2];

        for (int i = 0; i < n2; i++) {
            arr2[i] = scn.nextInt();
        }
        int n;
        if (n1 > n2) {
            if (arr1[0] == 9) {
                n = n1 + 1;
            } else {
                n = n1;
            }
        } else {
            if (arr2[0] == 9) {
                n = n2 + 1;
            } else {
                n = n2;
            }
        }
        int[] arr = new int[n];
        int c = 0;
        for (int i = 1; i <= n; i++) {
            int d1 = 0;
            int d2 = 0;
            if (i <= n1) {
                d1 = arr1[n1 - i];
            }
            if (i <= n2) {
                d2 = arr2[n2 - i];
            }
            int d = (d1 + d2 + c) % 10;
            c = (d1 + d2 + c) / 10;
            arr[n - 1] = d;
        }
    }
}
