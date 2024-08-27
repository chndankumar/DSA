package Stack;

import java.util.Scanner;
import java.util.Stack;

import Basic.reverseNum;

/**
 * minStack2
 */
public class minStack2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Stack<Integer> st = new Stack();
        int min;
    }

    public static void add(int val, Stack<Integer> st, int min) {
        if (st.size() == 0) {
            st.push(val);
            min = val;
        } else {
            if (val < min) {
                st.push(val + (val - min));
                min = val;
            } else {
                st.push(val);
            }
        }
    }

    public static int pop(Stack<Integer> st, int min) {
        int res;
        if (st.peek() < min) {
            res = min;
            min = min + min - st.pop();
        } else {
            res = st.pop();
        }
        return res;
    }

    public static int peek(Stack<Integer> st, int min) {
        if (st.peek() < min) {
            return min;
        } else {
            return st.peek();
        }
    }
}