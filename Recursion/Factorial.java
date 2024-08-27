package Recursion;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int res = printFactorial(n);
        System.out.println(res);
    }

    private static int printFactorial(int n) {
        if (n == 1) {
            return 1;
        }
        int res = printFactorial(n - 1);
        return res * n;
    }

}
