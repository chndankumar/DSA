package Stack;

import java.util.Scanner;
import java.util.Stack;

public class prefix {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String exp = scn.nextLine();
        Stack<Integer> sol = new Stack<>();
        Stack<String> post = new Stack<>();
        Stack<String> infix = new Stack<>();

        for (int i = exp.length() - 1; i >= 0; i--) {
            char ch = exp.charAt(i);
            if (ch == '*' || ch == '/' || ch == '+' || ch == '-') {
                int n1 = sol.pop();
                int n2 = sol.pop();
                int val = solve(n1, n2, ch);
                sol.push(val);
                String postStr1 = post.pop();
                String postStr2 = post.pop();
                String postRes = postStr1 + postStr2 + ch;
                post.push(postRes);
                String inStr1 = infix.pop();
                String inStr2 = infix.pop();
                String infixRes = '(' + inStr1 + ch + inStr2 + ')';
                infix.push(infixRes);
            } else {
                post.push(ch + "");
                infix.push(ch + "");
                sol.push(ch - '0');
            }
        }
    }

    private static int solve(int n1, int n2, char ch) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'solve'");
    }
}
