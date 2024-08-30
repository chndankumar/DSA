package BinaryTree;

public class isBinarySearchTree {
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

    public static class Pair {
        boolean isBST;
        int min;
        int max;

        public Pair() {

        }

        public Pair(int min, int max, boolean isBST) {
            this.max = min;
            this.max = max;
            this.isBST = isBST;
        }
    }

    static boolean flag = true;

    public static void main(String[] args) {
        Node root = new Node(0, null, null);
        Pair p = isBST(root);
    }

    private static Pair isBST(Node root) {
        if (root == null) {
            Pair p = new Pair();
            p.min = Integer.MAX_VALUE;
            p.max = Integer.MIN_VALUE;
            p.isBST = true;
        }

        Pair lp = isBST(root.left);
        Pair rp = isBST(root.right);
        Pair res = new Pair();
        res.isBST = lp.isBST && rp.isBST && (root.data >= lp.max && root.data <= rp.min);
        res.max = rp.max;
        res.min = rp.min;
        return res;
    }
}
