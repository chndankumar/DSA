package Dyanmic_Programming;

public class ClimbingStairsNjumpDP {
    public static void main(String[] args) {
        int n = 7;
        int[] arr = new int[n + 1];
        int res = countPath(n, arr);
        System.out.println(res);
    }

    private static int countPath(int n, int[] arr) {
        int[] resArr = new int[n + 1];
        for (int i = arr.length - 1; i >= 0; i--) {
            if (i == arr.length - 1) {
                resArr[i] = 1;
            } else {
                int jump = arr[i];
                int c = 0;
                for (int j = i + 1; j <= jump && j < arr.length; j++) {
                    c = c + arr[j];
                }
                resArr[i] = c;
            }
        }
        return 0;
    }
}
