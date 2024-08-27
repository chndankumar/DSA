package Basic;

import java.util.Scanner;

public class digitsOfNum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int digit = countDigit(n);
        int div = (int) Math.pow(10, digit - 1);
        while (div != 0) {
            System.out.println(n / div);
            n = n % div;
            div = div / 10;
        }
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
