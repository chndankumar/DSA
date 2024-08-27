package Stack;

import java.util.Scanner;
import java.util.Stack;

public class infixConversion {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        String exp = scn.nextLine();
        Stack<Character> oper = new Stack<>();
        Stack<String> pre = new Stack<>();
        Stack<String> post = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            if (ch == '*' || ch == '/' || ch == '-' || ch == '+') {
                while (oper.size() != 0 && oper.peek() != '(' && checkPrecedence(oper.peek(), ch)) {
                    char op = oper.pop();
                    String preStr1 = pre.pop();
                    String preStr2 = pre.pop();
                    String preRes = op + preStr2 + preStr1;
                    pre.push(preRes);
                    String postStr1 = post.pop();
                    String postStr2 = post.pop();
                    String postRes = postStr2 + postStr1 + op;
                    post.push(postRes);
                }
                oper.push(ch);
            }
            if (ch == ')') {
                while (oper.peek() != '(') {
                    char op = oper.pop();
                    String preStr1 = pre.pop();
                    String preStr2 = pre.pop();
                    String preRes = op + preStr2 + preStr1;
                    pre.push(preRes);
                    String postStr1 = post.pop();
                    String postStr2 = post.pop();
                    String postRes = postStr2 + postStr1 + op;
                    post.push(postRes);
                }
                oper.pop();
            } else if (ch == '(') {
                oper.push(ch);
            } else {
                pre.push(ch + "");
                post.push(ch + "");
            }

        }
    }

    private static boolean checkPrecedence(char ch1, char ch2) {
        int val1 = precedence(ch1);
        int val2 = precedence(ch2);
        if (val1 >= val2) {
            return true;
        } else {
            return false;
        }
    }

    private static int precedence(char ch) {
        if (ch == '/' || ch == '*') {
            return 2;
        } else {
            return 1;
        }
    }
}
