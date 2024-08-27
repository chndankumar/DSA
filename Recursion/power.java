package Recursion;

import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int x = scn.nextInt();
        int res = pow(x, n);
        System.out.println(res);
    }

    private static int pow(int x, int n) {

        if (x == 0) {
            return 0;
        } else if (x == 1) {
            return 1;
        }
        if (n == 1) {
            return x;
        }

        int res = pow(x, n / 2);
        if (n % 2 == 1) {
            return res * res * x;
        }
        return res * res;
    }
}
