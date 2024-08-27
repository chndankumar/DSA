package Gereric_Tree;

import java.util.ArrayList;

public class preAndSuccNode {
    public static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();

        public Node(int data, ArrayList<Node> children) {
            this.data = data;
            this.children = children;
        }
    }

    static Node preNode = null;
    static Node postNode = null;

    public static void main(String[] args) {
        int num = 0;
        Node root = new Node(num, null);
        getPreAndSussNode(root, num);
    }

    private static void getPreAndSussNode(Node root, int num) {
        if (root.data == num) {

        }
    }
}
