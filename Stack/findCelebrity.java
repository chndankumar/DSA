package Stack;

import java.util.Scanner;
import java.util.Stack;

public class findCelebrity {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        Stack<Integer> st = new Stack<>();
        int celb = 0;
        st.push(celb);
        for (int i = 1; i < n; i++) {
            if (arr[celb][i] != 0 || arr[i][celb] != 1) {
                st.pop();
            }

        }
    }
}
