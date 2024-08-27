package Array;

import java.util.Scanner;

public class barChart {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int l = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (l < arr[i]) {
                l = arr[i];
            }
        }

        while (l > 0) {
            for (int i : arr) {
                if (arr[i] >= l) {
                    System.out.println(" * ");
                } else {
                    System.out.println("    ");
                }
            }
            l--;
        }
    }
}
