package Basic;

import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int res = countDigit(n);
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
