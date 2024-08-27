package Array;

import java.util.Scanner;

public class spanOfArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int s = Integer.MAX_VALUE;
        int l = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (s > arr[i]) {
                s = arr[i];
            }
            if (l < arr[i]) {
                l = arr[i];
            }
        }
        System.out.println(l - s);
        ;
    }
}
