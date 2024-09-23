package Graph;

import java.util.*;

import Linklist.removeAny;

public class RottanOrange {
    public static void main(String[] args) {

    }

    public void updateMatrix(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        int[][] visited = new int[n][m];
        int countZero = 0;
        Queue<Cell> que = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 0) {
                    countZero++;
                    visited[i][j] = 0;
                    que.add(new Cell(i, j, 0));
                } else {
                    visited[i][j] = -1;
                }
            }
        }
        int[] helpeRow = { 0, 0, 1, -1 };
        int[] helpCol = { 1, -1, 0, 0 };
        while (que.size() != 0) {
            int row = que.peek().row;
            int col = que.peek().col;
            int dist = que.peek().dist;
            que.remove();
            for (int i = 0; i < 4; i++) {
                int r = row + helpeRow[i];
                int c = col + helpeRow[i];
                if (r >= 0 && c >= 0 && r < n && c < m && mat[r][c] == 1) {
                    if (visited[r][c] == 0 || visited[r][c] > dist + 1) {
                        que.add(new Cell(r, c, dist + 1));
                    }
                }
            }
        }
    }

    public void solve(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'O') {
                    boolean res = capture(board, i, j);
                }
            }
        }
    }

    private boolean capture(char[][] board, int i, int j) {
        if (i < 0 || j < 0 || i == board.length || j == board[0].length) {
            return false;
        }
        if (board[i][j] == 'X') {
            return true;
        }
        board[i][j] = 'X';
        boolean res1 = capture(board, i + 1, j);
        boolean res2 = capture(board, i - 1, j);
        boolean res3 = capture(board, i, j + 1);
        boolean res4 = capture(board, i, j - 1);
        if (res1 || res2 || res3 || res4) {
            board[i][j] = 'O';
            return false;
        }
        return true;
    }

    public class Cell {
        int row;
        int col;
        int dist = 0;

        public Cell(int row, int col, int dist) {
            this.col = col;
            this.row = row;
            this.dist = dist;
        }
    }
}
