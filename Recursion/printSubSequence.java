package Recursion;

import java.util.Scanner;

public class printSubSequence {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        printSub(str, "");
    }

    private static void printSub(String str, String temp) {
        if (str.length() == 0) {
            System.out.println(temp);
            return;
        }
        char ch = str.charAt(0);
        printSub(str.substring(1), temp + "");
        printSub(str.substring(1), temp + ch);
    }
}
