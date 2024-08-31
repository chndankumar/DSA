package BinaryTree;

public class LargestBSTsubTree {
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
        int size;
        Node node;
        boolean isBTS;
        int min;
        int max;
    }

    public static void main(String[] args) {
        Node root = new Node(0, null, null);
        Pair p = getBST(root);
    }

    private static Pair getBST(Node root) {
        Pair pl = getBST(root.left);
        Pair pr = getBST(root.right);
        Pair res = new Pair();
        res.isBTS = pl.isBTS && pr.isBTS && (root.data >= pl.max && root.data <= pr.min);
        if (res.isBTS == true) {
            res.size = pl.size + pr.size + 1;
            res.max = pr.max;
            res.min = pl.min;
            res.node = root;
            return res;
        } else {
            if (pl.size > pr.size) {
                pl.isBTS = false;
                return pl;
            } else {
                pr.isBTS = false;
                return pr;
            }
        }
    }
}
