package Stack;

import java.util.Scanner;
import java.util.Stack;

public class largestAreaHistoGram {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int[] lsv = new int[n];
        Stack<Integer> st = new Stack<>();
        lsv[0] = -1;
        for (int i = 0; i < arr.length; i++) {
            while (st.size() != 0 && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            if (st.size() == 0) {
                lsv[i] = -1;
            } else {
                lsv[i] = st.peek();
            }
        }
        int[] rsv = new int[n];
        rsv[n - 1] = n;
        for (int i = 0; i < arr.length; i++) {
            while (st.size() != 0 && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            if (st.size() == 0) {
                rsv[i] = n;
            } else {
                rsv[i] = st.peek();
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int val = (rsv[i] - lsv[i] - 1) * arr[i];
            max = Math.max(max, val);
        }
    }
}
