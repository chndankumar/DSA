package Dyanmic_Programming;

public class Printfibonacci {
    public static void main(String[] args) {
        int n = 10;
        // int res = printFibonacci(n);
        int[] arr = new int[n + 1];
        // int res1 = printFibonacciMemo(n, arr);
        int res2 = printFibonacciTab(n);
        System.out.println(res2);
    }

    private static int printFibonacciTab(int n) {

        int[] arr = new int[n + 1];
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                arr[i] = 0;
            } else if (i == 1) {
                arr[i] = 1;
            } else {
                int n1 = arr[i - 1];
                int n2 = arr[i - 2];
                arr[i] = n1 + n2;
            }
        }
        return arr[n];

    }

    private static int printFibonacciMemo(int n, int[] arr) {
        if (n == 0 || n == 1) {
            arr[n] = n;
            return n;
        }

        System.out.println("Hello" + n);
        int n1;
        int n2;
        if (arr[n - 1] != 0) {
            n1 = arr[n - 1];
        } else {
            n1 = printFibonacciMemo(n - 1, arr);
        }
        if (arr[n - 2] != 0) {
            n2 = arr[n - 2];
        } else {
            n2 = printFibonacciMemo(n - 2, arr);
        }
        int res = n1 + n2;
        arr[n] = res;
        return res;
    }

    // recursion approach
    private static int printFibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        System.out.println("Hello" + n);
        int n1 = printFibonacci(n - 2);
        int n2 = printFibonacci(n - 1);
        return n1 + n1;
    }

}
