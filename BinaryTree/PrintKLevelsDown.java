package BinaryTree;

public class PrintKLevelsDown {
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
        int k = 2;
        printNode(root, 0, k);
    }

    private static void printNode(Node root, int i, int k) {
        if (root == null) {
            return;
        }
        if (i == k) {
            System.out.println(root.data);
            return;
        }

        if (root.left != null) {
            printNode(root, i++, k);
        }
        if (root.right != null) {
            printNode(root, i++, k);
        }
    }
}
