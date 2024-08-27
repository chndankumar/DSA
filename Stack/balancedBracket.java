package Stack;

import java.util.Scanner;
import java.util.Stack;

public class balancedBracket {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String exp = scn.nextLine();
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            if (ch == ')') {
                if (st.empty() != false || st.peek() != '(') {
                    System.out.println("not balanced");
                    break;
                } else {
                    st.pop();
                }

            } else if (ch == '}') {
                if (st.empty() != false || st.peek() != '{') {
                    System.out.println("not balanced");
                    break;
                } else {
                    st.pop();
                }
            } else if (ch == ']') {
                if (st.empty() != false || st.peek() != '[') {
                    System.out.println("not balanced");
                    break;
                } else {
                    st.pop();
                }
            } else if (ch == '[' || ch == '{' || ch == '(') {
                st.push(ch);
            }
        }
        if (st.size() != 0) {
            System.out.println("not balanced");
        }
        System.out.println("balanced");
    }
}
