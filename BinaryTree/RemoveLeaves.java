package BinaryTree;

public class RemoveLeaves {
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
        Node node = removeLeaf(root);
    }

    private static Node removeLeaf(Node root) {
        if (root == null) {
            return null;
        }

        if (root.left == null && root.right == null) {
            return null;
        }

        Node lc = removeLeaf(root.left);
        Node rc = removeLeaf(root.right);
        root.left = lc;
        root.right = rc;
        return root;
    }
}
