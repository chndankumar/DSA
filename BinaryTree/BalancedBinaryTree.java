package BinaryTree;

public class BalancedBinaryTree {
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
        int height;
        boolean flag;
    }

    static boolean flag = true;

    public static void main(String[] args) {
        Node root = new Node(0, null, null);
        int h = isBalanced(root);
        Pair p = isBalancedwithPair(root);
    }

    private static Pair isBalancedwithPair(Node root) {
        if (root == null) {
            Pair p = new Pair();
            p.height = -1;
            p.flag = true;
        }

        Pair pl = isBalancedwithPair(root.left);
        Pair pr = isBalancedwithPair(root.right);

        Pair res = new Pair();
        int gap = Math.abs(pl.height - pr.height);
        res.flag = pl.flag && pr.flag && gap > 1;
        res.height = Math.max(pl.height, pr.height);
        return res;
    }

    private static int isBalanced(Node root) {
        if (root == null) {
            return -1;
        }

        int lh = isBalanced(root.left);
        int rh = isBalanced(root.left);
        int gap = Math.abs(rh - lh);
        if (gap > 1) {
            flag = false;
        }
        return Math.max(lh, rh) + 1;
    }
}
