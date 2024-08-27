package Stack;

import java.util.Scanner;

public class TwoStackInArray {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    int top1 = 0;
    int top2 = 0;

    public int size1() {
        return top1 + 1;
    }

    public int size2() {
        return arr.length - top2;
    }

    public int peek1() {
        if (size1() == 0) {
            return -1;
        } else {
            return arr[top1];
        }
    }

    public int peek2() {
        if (size1() == 0) {
            return -1;
        } else {
            return arr[top2];
        }
    }

    public int pop1() {
        if (size1() == 0) {
            return -1;
        } else {
            int val = arr[top1];
            top1--;
            return val;
        }
    }

    public int pop2() {
        if (size1() == 0) {
            return -1;
        } else {
            int val = arr[top2];
            top2++;
            return val;
        }
    }

    public void push1(int val) {
        if (top1 + 1 == top2) {
            System.out.println("Stack overflow");
        } else {
            top1++;
            arr[top1] = val;
        }
    }

    public void push2(int val) {
        if (top2 - 1 == top1) {
            System.out.println("Stack overflow");
        } else {
            top2--;
            arr[top2] = val;
        }
    }

}
