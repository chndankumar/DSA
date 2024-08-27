package Recursion;

public class findFrist {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = new int[n];
        int res = fristIdx(arr, 0, 7);
    }

    private static int fristIdx(int[] arr, int i, int val) {

        if (i == arr.length) {
            return -1;
        } else if (arr[i] == val) {
            return i;
        }

        int res = fristIdx(arr, i + 1, val);
        return res;
    }
}
