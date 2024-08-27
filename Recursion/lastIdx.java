package Recursion;

public class lastIdx {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = new int[n];
        int res = last(arr, 0, 7);
    }

    private static int last(int[] arr, int i, int j) {
        if (i == arr.length) {
            return -1;
        }
        int res = last(arr, i + 1, j);
        if (res < 0 && arr[i] == j) {
            res = i;
        }
        return res;
    }
}
