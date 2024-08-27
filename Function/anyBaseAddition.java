package Function;

import java.util.Scanner;

public class anyBaseAddition {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int b = scn.nextInt();
        int sum = 0;
        int c = 0;
        int p = 1;
        while (n1 != 0 || n2 != 0) {
            int d1 = n1 % 10;
            int d2 = n2 % 10;
            int tem = (d1 + d2 + c) % b;
            c = (d1 + d2 + c) / b;
            sum = (tem * p) + sum;
            n1 = n1 / 10;
            n2 = n2 / 10;
            p = p * 10;
        }
        if (c != 0) {
            sum = (c * p) + sum;
        }
        System.out.println(sum);
    }
}