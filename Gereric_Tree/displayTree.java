package Gereric_Tree;

import java.util.*;

public class displayTree {
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
