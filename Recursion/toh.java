package Recursion;

public class toh {
    public static void main(String[] args) {
        int n = 3;
        int sc = 10;
        int des = 11;
        int help = 12;
        printStep(n, sc, des, help);
    }

    private static void printStep(int n, int sc, int des, int help) {
        if (n == 1) {
            System.out.println(n + "[" + sc + "->" + des + "]");
            return;
        }
        printStep(n - 1, sc, help, des);
        System.out.println(n + "[" + sc + "->" + des + "]");
        printStep(n - 1, help, des, sc);
    }
}
