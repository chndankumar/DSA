package BinaryTree;

import Linklist.removeAny;

public class TransformBackfromLeftClonedTree {
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
        transformTreeBack(root);
    }

    private static void transformTreeBack(Node root) {
        if (root == null) {
            return;
        }

        root.left = root.left.left;
        if (root.left != null) {
            transformTreeBack(root.left);
        }
        if (root.right != null) {
            transformTreeBack(root.right);
        }
    }
}
