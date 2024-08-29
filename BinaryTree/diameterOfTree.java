package BinaryTree;

public class diameterOfTree {
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

    static int dia = 0;

    public static void main(String[] args) {
        Node root = new Node(0, null, null);
        int h = diameter(root);
    }

    private static int diameter(Node root) {
        if (root == null) {
            return 0;
        }
        int l = diameter(root.left);
        int r = diameter(root.right);
        dia = Math.max(diameter(root), r + r + 2);
        return Math.max(l, r);
    }
}
