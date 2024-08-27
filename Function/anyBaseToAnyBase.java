package Function;

import java.util.Scanner;

public class anyBaseToAnyBase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int tbase = scn.nextInt();
        int res = anyBaseToDecimal(n, b);
        res = decimalToAnyBase(res, tbase);
    }

    public static int anyBaseToDecimal(int n, int b) {
        int res = 0;
        int p = 0;
        while (n != 0) {
            int d = n % 10;
            d = (int) Math.pow(b, p) * d;
            res = res + d;
            p++;
            n = n / 10;
        }
        return res;
    }

    public static int decimalToAnyBase(int n, int b) {
        int res = 0;
        int p = 0;
        while (n != 0) {
            int d = n % b;
            d = (int) Math.pow(10, p) * d;
            res = res + d;
            p++;
            n = n / b;
        }
        return res;
    }
}
