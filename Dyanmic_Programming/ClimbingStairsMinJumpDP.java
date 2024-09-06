package Dyanmic_Programming;

// not completed need to handle the cases where the jump is 0 aur mull
public class ClimbingStairsMinJumpDP {
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
                resArr[i] = 0;
            } else {
                int jump = arr[i];
                int min = 0;
                for (int j = i + 1; j <= jump && j < arr.length; j++) {
                    if (arr[j] == 0) {
                        min = Math.min(min, arr[j]);
                    }
                }
                resArr[i] = min;
            }
        }
        return 0;
    }
}
