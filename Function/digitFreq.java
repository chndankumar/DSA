package Function;

import java.util.Scanner;

public class digitFreq {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int f = scn.nextInt();
        int res = getFreq(n, f);
        System.out.println(res);
    }

    public static int getFreq(int n, int f) {
        int res = 0;
        while (n != 0) {
            if (f == n % 10) {
                res++;
            }
            n = n / 10;
        }
        return res;
    }
}
