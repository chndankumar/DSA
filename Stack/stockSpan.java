package Stack;

import java.util.Scanner;
import java.util.Stack;

public class stockSpan {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();
        res[0] = 1;
        st.push(0);
        for (int i = 1; i < arr.length; i++) {
            while (st.size() != 0 && arr[st.peek()] <= arr[i]) {
                st.pop();
            }
            if (st.size() == 0) {
                res[i] = i + 1;
            } else {
                res[i] = i - st.peek();
            }
            st.push(i);
        }
    }
}
