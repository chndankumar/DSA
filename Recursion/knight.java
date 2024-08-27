package Recursion;

public class knight {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        printStep(arr, 2, 2, 0, "");
    }

    private static void printStep(int[][] arr, int row, int col, int count, String res) {

        if (count == arr.length * arr.length) {
            System.out.println(res);
            arr[row][col] = 0;
            return;
        } else if (row >= arr[0].length || col >= arr[0].length || row < 0 || col < 0 || arr[row][col] == 1) {
            return;
        }

        arr[row][col] = 1;
        printStep(arr, row - 2, col + 1, count + 1, res + row + "-" + col);
        printStep(arr, row - 2, col - 1, count + 1, res + row + "-" + col);
        printStep(arr, row - 1, col + 2, count + 1, res + row + "-" + col);
        printStep(arr, row + 1, col + 2, count + 1, res + row + "-" + col);
        printStep(arr, row + 2, col + 1, count + 1, res + row + "-" + col);
        printStep(arr, row + 2, col - 1, count + 1, res + row + "-" + col);
        printStep(arr, row + 1, col - 2, count + 1, res + row + "-" + col);
        printStep(arr, row - 1, col - 2, count + 1, res + row + "-" + col);
        arr[row][col] = 1;

    }
}
