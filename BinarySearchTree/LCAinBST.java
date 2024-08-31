package BinarySearchTree;

public class LCAinBST {
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
        int num1 = 61;
        int num2 = 70;
        int num = getLCA(root, num1, num2);
    }

    private static int getLCA(Node root, int num1, int num2) {
        if (root == null) {
            return 0;
        }
        if (root.data > num1 && root.data > num2) {
            getLCA(root.left, num1, num2);
        } else if (root.data < num1 && root.data < num2) {
            getLCA(root, num1, num2);
        } else {
            return root.data;
        }
        return 0;
    }
}
