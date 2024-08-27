package Gereric_Tree;

import java.util.*;

public class MaxOfTree {

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
        display(root);
        int s = size(root);
        int m = maxVal(root);
    }

    private static int maxVal(Node root) {

        int max = Integer.MIN_VALUE;
        for (Node child : root.children) {
            max = Math.max(max, maxVal(child));
        }
        max = Math.max(max, root.data);
        return max;
    }

    private static int size(Node root) {
        int s = 1;
        if (root.children.size() == 0) {
            return 1;
        }
        for (Node child : root.children) {
            s = s + size(child);
        }
        return s;
    }

    private static void display(Node root) {
        System.out.println(root.data);
        if (root.children.size() == 0) {
            return;
        }
        for (Node child : root.children) {
            System.out.print(child.data);
        }
        System.out.println();
        for (Node child : root.children) {
            display(child);
        }
    }
}
