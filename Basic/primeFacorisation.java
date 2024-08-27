package Basic;

import java.util.Scanner;

public class primeFacorisation {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int div = 2;
        while (n != 1) {
            if (n % div != 0) {
                div++;
            } else {
                n = n / div;
                System.out.println(div);
            }
        }
        {

        }
    }
}