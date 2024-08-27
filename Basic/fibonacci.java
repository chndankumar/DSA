package Basic;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        boolean res = isFibonacci(n);
        System.out.println(res);
    }

    public static boolean isFibonacci(int n) {
        int i = 0;
        int j = 1;
        int res = i + j;
        while (i <= n) {
            if (i == n) {
                return true;
            }
            i = j;
            j = res;
            res = j + i;
        }
        return false;
    }
}