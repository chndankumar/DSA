package Gereric_Tree;

import java.util.ArrayList;
import java.util.Stack;

public class preAndPostOrderIterative {
    public static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();

        public Node(int data, ArrayList<Node> children) {
            this.data = data;
            this.children = children;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(0, null);
        Stack<Node> curr = new Stack<>();
        Stack<Node> child = new Stack<>();
        curr.push(root);
        while (curr.size() != 0) {
            Node temp = curr.pop();
            System.out.println(temp.data);
            int n = temp.children.size() - 1;
            for (int i = n; i >= 0; i--) {
                child.push(temp.children.get(i));
            }
            if (child.size() > 0) {
                curr.push(child.pop());
            }
        }
    }

}
