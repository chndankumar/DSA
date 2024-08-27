package Basic;

import java.util.Scanner;

public class primeNo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        boolean res = isPrime(n);
        System.out.println(res);
    }

    public static boolean isPrime(int n) {
        int d = 2;
        while (d * d <= n) {
            if (n % d == 0) {
                return false;
            }
            d++;
        }
        return true;
    }
}
