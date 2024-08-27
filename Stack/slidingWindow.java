package Stack;

import java.util.Scanner;
import java.util.Stack;

public class slidingWindow {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int k = scn.nextInt();
        int[] nxt = new int[n];
        Stack<Integer> st = new Stack<>();
        nxt[n - 1] = n;
        st.push(n - 1);
        for (int i = arr.length - 1; i >= 0; i--) {
            while (st.size() != 0 && arr[st.peek()] <= arr[i]) {
                st.pop();
            }
            if (st.size() == 0) {
                nxt[i] = n;
            } else {
                nxt[i] = st.peek();
            }
            st.push(i);
        }
        for (int i = 0; i < n - k; i++) {
            int j = i;
            while (j < i + k) {
                if (nxt[j] > i + k) {
                    System.out.println(arr[i]);
                } else {
                    j = nxt[j];
                }
            }
        }
    }
}
