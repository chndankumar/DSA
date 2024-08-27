package Array;

import java.util.Scanner;

public class subSetOfArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int p = (int) Math.pow(2, n);
        for (int i = 0; i < p; i++) {
            int div = i;
            for (int j = 0; j < n; j++) {
                int d = div % 2;
                if (d == 0) {
                    System.out.print("-");
                } else {
                    System.out.print(arr[j]);
                }
                div = div / 2;
            }
            System.out.println();
        }
    }
}
