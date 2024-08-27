package Basic;

import java.util.Scanner;

public class inverseOfNum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int res = 0;
        int idx = 1;
        while (n != 0) {
            int d = n % 10;
            res = res + (int) Math.pow(10, d - 1) * idx;
            n = n / 10;
            idx++;
        }
        System.out.println(res);
    }
}
