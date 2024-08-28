package BinaryTree;

public class displayTree {
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
        Node node = new Node(0, null, null);
        diplay(node);
    }

    private static void diplay(Node node) {

        String res = "-" + node.data + "-";

        if (node.left != null) {
            res = node.left.data + res;
        } else {
            res = "." + res;
        }
        if (node.right != null) {
            res = res + node.right.data;
        } else {
            res = res + ".";
        }

        System.out.println(res);
        diplay(node.left);
        diplay(node.right);
    }
}
