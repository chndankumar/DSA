package Recursion;

public class allindex {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = new int[n];
        int[] res = idx(arr, 0, 7, -1);
    }

    private static int[] idx(int[] arr, int i, int j, int k) {
        if (i == arr.length) {
            if (k != -1) {
                return null;
            } else {
                return new int[k + 1];
            }
        }

        if (arr[i] == j) {
            int[] res = idx(arr, i, j, k + 1);
            res[k + 1] = i;
            return res;
        } else {
            return idx(arr, i, j, k);
        }
    }
}
