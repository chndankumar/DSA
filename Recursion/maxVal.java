package Recursion;

public class maxVal {
    public static void main(String[] args) {
        int n = 7;
        int[] arr = new int[n];
        int res = max(arr, 0);
    }

    private static int max(int[] arr, int i) {
        if (i == arr.length - 1) {
            return arr[i];
        }

        int res = max(arr, i + 1);
        res = Math.max(arr[i], res);
        return res;
    }
}
