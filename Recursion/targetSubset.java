package Recursion;

public class targetSubset {
    public static void main(String[] args) {
        int[] arr = new int[7];
        int tSum = 50;
        int res = 0;
        printSubset(arr, 0, tSum, res, "");
    }

    private static void printSubset(int[] arr, int idx, int tSum, int res, String set) {
        if (idx == arr.length) {
            if (tSum == res) {
                System.out.println(set);
                return;
            } else {
                return;
            }
        }

        int temp = arr[idx];
        printSubset(arr, idx + 1, tSum, res + temp, set + temp);
        printSubset(arr, idx + 1, tSum, res, set);

    }
}
