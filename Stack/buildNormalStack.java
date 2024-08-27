package Stack;

import java.util.Scanner;

public class buildNormalStack {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        int top = -1;
    }

    public static int size(int arr[], int top) {
        return top + 1;
    }

    public static void push(int[] arr, int top, int val) {
        if (top == arr.length - 1) {
            System.out.println("stack overflow");
        } else {
            top++;
            arr[top] = val;
        }
    }

    public static int peek(int[] arr, int top) {
        if (top == -1) {
            System.out.println("stack empty");
            return -1;
        } else {
            return arr[top];
        }
    }

    public static int pop(int[] arr, int top) {
        if (top == -1) {
            System.out.println("stack empty");
            return -1;
        } else {
            int res = arr[top];
            arr[top] = 0;
            top--;
            return res;
        }
    }

    public static void printStack(int[] arr, int top) {
        int temp = top;
        if (temp < 0) {
            System.out.println("stack is empty");
        }
        while (temp < 0) {
            System.err.println(arr[temp]);
            temp--;
        }
    }
}
