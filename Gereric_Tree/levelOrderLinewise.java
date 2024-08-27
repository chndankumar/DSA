package Gereric_Tree;

import java.util.*;

public class levelOrderLinewise {
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
        int h = height(root);
        printTraversal(root);
        displayLevelOrder(root);
        displayLinewise(root);
    }

    private static void displayLinewise(Node root) {

        Queue<Node> parent = new ArrayDeque<>();
        Queue<Node> child = new ArrayDeque<>();
        parent.add(root);

        while (parent.size() != 0) {
            Node temp = parent.remove();
            System.out.println(temp.data);
            for (Node node : temp.children) {
                child.add(node);
            }

            if (parent.size() == 0) {
                Queue<Node> t = parent;
                parent = child;
                child = t;
            }
        }

    }

    private static void displayLevelOrder(Node root) {
        Queue<Node> que = new ArrayDeque<>();
        que.add(root);
        while (que.size() > 0) {
            Node temp = que.remove();
            System.out.println(temp.data);
            for (Node child : temp.children) {
                que.add(child);
            }
        }
    }

    private static void printTraversal(Node root) {
        System.out.println("node Pre" + root.data);

        for (Node child : root.children) {
            System.out.print("edge pre" + root.data + "-" + child.data);
            printTraversal(child);
            System.out.print("edge post" + root.data + "-" + child.data);
        }

        System.out.println("node post" + root.data);
    }

    private static int height(Node root) {
        if (root.children.size() == 0) {
            return 0;
        }
        int val = 0;
        for (Node child : root.children) {
            val = Math.max(val, height(child));
        }
        return val + 1;
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

        System.out.println();
        for (Node child : root.children) {
            display(child);
        }
    }
}
