package Stack;

import java.util.Scanner;
import java.util.Stack;

public class dupclicateBracket {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String exp = scn.nextLine();
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            if (ch != ')' || ch != '}' || ch != ']') {
                st.push(ch);

            } else if (ch == ')') {

                if (st.peek() == '(') {
                    System.out.println(true);
                    break;
                }
                while (st.peek() != ch) {
                    st.pop();
                }
                st.pop();

            } else if (ch == '}') {
                if (st.peek() == '{') {
                    System.out.println(true);
                    break;
                }
                while (st.peek() != ch) {
                    st.pop();
                }
                st.pop();

            } else if (ch == ']') {
                if (st.peek() == '[') {
                    System.out.println(true);
                    break;
                }
                while (st.peek() != ch) {
                    st.pop();
                }
                st.pop();
            }
        }
    }
}
