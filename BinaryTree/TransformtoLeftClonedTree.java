package BinaryTree;

public class TransformtoLeftClonedTree {
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
        transformTree(root);
    }

    private static void transformTree(Node root) {
        if (root == null) {
            return;
        }

        if (root.left != null) {
            transformTree(root.left);
        }

        if (root.right != null) {
            transformTree(root.right);
        }

        Node node = new Node(root.data, null, null);
        node.left = node.left;
        root.left = node;
    }
}
