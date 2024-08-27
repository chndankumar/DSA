package Stack;

import java.util.Scanner;
import java.util.Stack;

public class nextGreaterElement {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();
        st.push(arr[n - 1]);
        res[n - 1] = -1;
        for (int i = arr.length - 2; i >= 0; i++) {
            if (st.peek() > arr[i]) {
                res[i] = st.peek();
            } else if (st.peek() <= arr[i]) {
                while (st.size() != 0 && st.peek() <= arr[i]) {
                    st.pop();
                }
                if (st.size() == 0) {
                    res[i] = -1;
                } else {
                    res[i] = st.peek();
                }
            }
            st.push(arr[i]);
        }
        /// alternate solution in we will move from left to right by removing the small
        /// value present in stack and becoming the answer for them and this will done
        /// by stroning the inderx value and some intex in left in the stack the we wil
        /// l assign -1 value for the those index

        int[] altRes = new int[n];
        st.clear();
        for (int i = 0; i < arr.length; i++) {
            while (st.size() != 0 && arr[st.peek()] < arr[i]) {
                altRes[st.peek()] = arr[i];
                st.pop();
            }
            st.push(i);
        }
        while (st.size() != 0) {
            altRes[st.pop()] = -1;
        }
    }

}
