package BinaryTree;

public class tiltOfTree {
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

    static int tilt = 0;

    public static void main(String[] args) {
        Node root = new Node(tilt, null, null);
        int sum = getTilt(root);
    }

    private static int getTilt(Node root) {
        if (root == null) {
            return 0;
        }
        int ls = getTilt(root.left);
        int rs = getTilt(root.right);

        int lt = Math.abs(ls - rs);
        tilt += lt;
        int s = ls + rs + root.data;
        return s;
    }
}
