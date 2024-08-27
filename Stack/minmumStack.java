package Stack;

import java.util.Scanner;
import java.util.Stack;

public class minmumStack {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        Stack<Integer> minst = new Stack<>();
        int n = scn.nextInt();
        int min = Integer.MAX_VALUE;

    }

    public static void push(Stack<Integer> st, Stack<Integer> minst, int n) {
        if (st.size() == 0) {
            st.push(n);
            minst.push(n);
            return;
        }
        if (n <= minst.peek()) {
            minst.push(n);
        } else {
        }
        st.push(n);
    }

    public static int pop(Stack<Integer> st, Stack<Integer> minst) {
        if (st.peek() == minst.peek()) {
            minst.pop();
        }
        return st.pop();

    }

    public static int min(Stack<Integer> minst) {
        return minst.pop();
    }
}
