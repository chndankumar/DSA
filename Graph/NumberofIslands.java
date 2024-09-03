package Graph;

public class NumberofIslands {
    public static void main(String[] args) {
        int n = 7;
        int[][] arr = new int[n][n];
        boolean[][] visited = new boolean[n][n];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] == 0 && visited[i][j] == false) {
                    drawTree(arr, visited, i, j);
                    count++;
                }
            }
        }
    }

    private static void drawTree(int[][] arr, boolean[][] visited, int i, int j) {
        if (arr[i][j] == 1 || visited[i][j] == true || i == arr.length || j == arr.length || i < 0 || j < 0) {
            return;
        }
        visited[i][j] = true;
        drawTree(arr, visited, i + 1, j);
        drawTree(arr, visited, i, j + 1);
        drawTree(arr, visited, i - 1, j);
        drawTree(arr, visited, i - 1, j);

    }
}
