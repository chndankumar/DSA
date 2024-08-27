package Basic;

import java.util.Scanner;

public class rotateNum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int digit = countDigit(n);
        k = k % digit;
        if (k < 0) {
            k = digit + k;
        }
        int res;
        int div = (int) Math.pow(10, k);
        res = n % div;
        res = res * (int) Math.pow(10, digit - k) + n / div;
        System.out.println(res);
    }

    public static int countDigit(int n) {
        if (n == 0) {
            return 1;
        }
        int res = 0;
        while (n != 0) {
            n = n / 10;
            res++;
        }
        return res;
    }
}
