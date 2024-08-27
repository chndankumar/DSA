package Function;

import java.util.Scanner;

public class decimalToAnyBase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int res = 0;
        int p = 0;
        while (n != 0) {
            int d = n % b;
            d = (int) Math.pow(10, p) * d;
            res = res + d;
            n = n / b;
            p++;
        }
        System.out.println(res);
    }
}
