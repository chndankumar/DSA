package Stack;

import java.util.Scanner;
import java.util.Stack;

/**
 * postFix
 */
public class postFix {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String exp = scn.nextLine();
        Stack<Integer> sol = new Stack<>();
        Stack<String> infix = new Stack<>();
        Stack<String> pre = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            if (ch == '/' || ch == '+' || ch == '-' || ch == '*') {
                int n1 = sol.pop();
                int n2 = sol.pop();
                int res = solve(n1, n2, ch);
                String inStr1 = infix.pop();
                String inStr2 = infix.pop();
                String inRes = '(' + inStr2 + ch + inStr1 + ')';
                infix.push(inRes);
                String preStr1 = pre.pop();
                String preStr2 = pre.pop();
                String preRes = ch + preStr2 + preStr1;
                pre.push(preRes);
            } else {
                sol.push(ch - '0');
                pre.push(ch + "");
                infix.push(ch + "");
            }
        }
    }

    private static int solve(int n1, int n2, char ch) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'solve'");
    }
}