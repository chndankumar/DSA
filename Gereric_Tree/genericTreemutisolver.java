package Gereric_Tree;

import java.util.ArrayList;

public class genericTreemutisolver {
    public static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();

        public Node(int data, ArrayList<Node> children) {
            this.data = data;
            this.children = children;
        }
    }

    static int size;
    static int min;
    static int max;
    static int height;

    public static void main(String[] args) {
        size = 0;
        min = Integer.MAX_VALUE;
        max = Integer.MIN_VALUE;
        height = 0;
        Node root = new Node(0, null);
        multisolver(root, 0);
    }

    private static void multisolver(Node root, int deapth) {
        if (root.children.size() == 0) {
            height = Math.max(height, deapth);
        }
        size++;
        min = Math.min(min, root.data);
        max = Math.max(max, root.data);
        for (Node child : root.children) {
            multisolver(child, deapth++);
        }
    }
}
