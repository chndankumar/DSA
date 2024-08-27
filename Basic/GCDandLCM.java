package Basic;

import java.util.Scanner;

public class GCDandLCM {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int a;
        int b;
        if (n1 > n2) {
            a = n1;
            b = n2;
        } else {
            a = n2;
            b = n1;
        }
        while (a % b != 0) {
            int q = a % b;
            a = b;
            b = q;
        }
        System.out.println("GCD is " + b);
        int lcm = (n1 * n2) / b;
        System.out.println(lcm);
    }
}
