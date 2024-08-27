package Basic;

import java.util.Scanner;

public class reverseNum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int res = 0;
        while (n != 0) {
            int que = n % 10;
            res = res * 10 + que;
            n = n / 10;
        }
        System.out.println(res);
    }
}
