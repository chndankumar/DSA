package Array;

import java.util.Scanner;

public class diffOfTwoArray {
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

        int[] res = new int[n2];
        int c = 0;
        for (int i = 1; i <= n2; i++) {
            int d1 = 0;
            if (i <= n1) {
                d1 = arr1[n1 - i];
            }
            int d2 = arr2[n2 - i] - c;
            if (d2 < d1) {
                d2 = d2 + 10;
                c = 1;
            } else {
                c = 0;
            }
            int d = (d2 - d1) % 10;
            res[n2 - i] = d;
        }
    }
}
