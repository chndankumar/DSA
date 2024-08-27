package Function;

import java.util.Scanner;

public class anyBaseSubstraction {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int b = scn.nextInt();
        int sub = 0;
        int p = 1;
        int c = 0;
        while (n1 != 0 || n2 != 0) {
            int d1 = n1 % 10;
            int d2 = n2 % 10;
            n1 = n1 / 10;
            n2 = n2 / 10;
            if ((n2 - c) < n1) {
                n2 = n2 + b;
                c = 1;
            } else {
                c = 0;
            }
            int d = n2 - n1;
            sub = (d * p) + sub;
            p = p * 10;
        }
    }
}
