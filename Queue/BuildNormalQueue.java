package Queue;

import java.util.Scanner;

import Stack.buildNormalStack;

public class BuildNormalQueue {
    int[] arr;
    int size = 0;
    int front = -1;

    void buildNormalStack(int[] arr, int size, int front) {
        this.arr = arr;
        this.size = size;
        this.front = front;
    }

    public int size() {
        return this.size;
    }

    public void add(int val) {
        // check space is aviable or not
        if (size == arr.length) {
            System.out.println("quest is full");
            return;
        }

        int rear = (front + size) % arr.length;
        arr[rear] = val;
        size++;
    }

    public int remove() {
        if (size == 0) {
            return -1;
        } else {
            int val = arr[front];
            front = (front + 1) % arr.length;
            size--;
            return val;
        }

    }

    public int peek() {
        if (size == 0) {
            return -1;
        } else {
            return arr[front];
        }
    }

    public void display (){
        int rear = size+front;
        int temp = front;
        while(temp<rear){
            int idx = temp%arr.length;
            System.out.println(arr[idx]);
        }
    }
}
