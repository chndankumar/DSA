package Function;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int r = scn.nextInt();
        int npr = fact(n) / fact(n - r);
    }

    public static int fact(int n) {
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res = i * res;
        }
        return res;
    }
}
