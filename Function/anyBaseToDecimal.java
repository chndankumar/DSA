package Function;

import java.util.Scanner;

public class anyBaseToDecimal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int res = 0;
        int p = 0;
        while (n != 0) {
            int d = n % 10;
            d = (int) Math.pow(b, p) * d;
            res = res + d;
            n = n / 10;
            p++;
        }
        System.out.println(res);
    }
}
