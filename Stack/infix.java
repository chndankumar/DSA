package Stack;

import java.util.Scanner;
import java.util.Stack;

public class infix {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        String exp = scn.nextLine();
        Stack<Character> oper = new Stack<>();
        Stack<Integer> opnd = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            if (ch == '*' || ch == '-' || ch == '/' || ch == '+') {

                while (oper.size() != 0 && oper.peek() != '(' && checkPrecedence(oper.peek(), ch)) {
                    char ch1 = oper.peek();
                    int n1 = opnd.pop();
                    int n2 = opnd.pop();
                    int res = solve(n1, n2, ch1);
                    opnd.push(res);
                }
                oper.push(ch);

            } else if (ch == ')') {

                while (oper.peek() != '(') {
                    char ch1 = oper.pop();
                    int n1 = opnd.pop() - '0';
                    int n2 = opnd.pop() - '0';
                    int res = solve(n1, n2, ch1);
                    opnd.push(res);
                }
                oper.pop();

            } else if (ch == '(') {
                oper.push(ch);

            } else {
                opnd.push(ch - '0');
            }
        }

    }

    private static int solve(int n1, int n2, char ch) {
        if (ch == '/') {
            return n2 / n1;
        } else if (ch == '*') {
            return n2 * n1;
        } else if (ch == '-') {
            return n2 - n1;
        } else {
            return n2 + n1;
        }

    }

    public static boolean checkPrecedence(char ch1, char ch2) {
        int val1 = precedence(ch1);
        int val2 = precedence(ch2);
        if (val1 >= val2) {
            return true;
        } else {
            return false;
        }
    }

    private static int precedence(char ch) {
        if (ch == '*' || ch == '/') {
            return 2;
        } else {
            return 1;
        }
    }
}
