package Basic;

import java.util.Scanner;

public class pythagorean {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int n3 = scn.nextInt();
        int max;
        if (n1 > n2) {
            if (n1 > n3) {
                max = n1;
            } else {
                max = n3;
            }
        } else {
            if (n2 > n3) {
                max = n2;
            } else {
                max = n3;
            }
        }
    }
}