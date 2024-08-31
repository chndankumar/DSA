package BinarySearchTree;

import java.util.*;

public class rangeInBST {
    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(0, null, null);
        int n1 = 27;
        int n2 = 71;
        printNode(root, n1, n2);
    }

    private static void printNode(Node root, int n1, int n2) {
        if (root == null) {
            return;
        }

        if (n1 < root.data || n2 < root.data) {
            printNode(root.left, n1, n2);
        }
        if (n1 <= root.data && n2 <= root.data) {
            System.out.println(root.data);
        }
        if (n1 > root.data || n2 > root.data) {
            printNode(root.right, n1, n2);
        }

    }
}