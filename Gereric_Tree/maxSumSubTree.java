package Gereric_Tree;

import java.util.ArrayList;

public class maxSumSubTree {
    public static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();

        public Node(int data, ArrayList<Node> children) {
            this.data = data;
            this.children = children;
        }
    }

    static Node resNode;
    static int sum = Integer.MIN_VALUE;

    public static void main(String[] args) {
        Node root = new Node(0, null);
        int res = maxNode(root);
        System.out.println(res);
    }

    private static int maxNode(Node root) {
        int res = 0;
        for (Node child : root.children) {
            res = res + maxNode(child);
        }
        res = res + root.data;
        if (res >= sum) {
            sum = res;
            resNode = root;
        }
        return res;
    }

}
