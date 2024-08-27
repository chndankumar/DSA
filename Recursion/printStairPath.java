package Recursion;

public class printStairPath {
    public static void main(String[] args) {
        int n = 4;
        printPath(n, "");
    }

    private static void printPath(int n, String res) {

        if (n == 0) {
            System.out.println(res);
            return;
        } else if (n < 0) {
            return;
        } else {
            printPath(n - 1, res + "1");
            printPath(n - 2, res + "2");
            printPath(n - 3, res + "3");
        }
    }

}