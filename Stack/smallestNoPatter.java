package Stack;

import java.util.Scanner;
import java.util.Stack;

public class smallestNoPatter {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        String ptr = scn.nextLine();
        String res = "";
        Stack<Integer> st = new Stack<>();
        int num = 1;
        for (int i = 0; i < ptr.length(); i++) {
            char ch = ptr.charAt(i);
            if (ch == 'd') {
                st.push(num);
                num++;
            } else {
                st.push(num);
                num++;
                while (st.size() != 0) {
                    res = res + st.pop();
                }
            }
        }
        st.push(num);
        while (st.size() != 0) {
            res = res + st.pop();
        }
        System.out.println(res);
    }
}
