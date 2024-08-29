package BinaryTree;

public class PrintSingleChildNodes {
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
        printParent(root);
    }

    private static void printParent(Node root) {
        if (root == null) {
            return;
        }

        if (root.left == null || root.right == null) {
            if (root.left != null) {
                System.out.println(root.left.data);
            } else if (root.right != null) {
                System.out.println(root.right.data);
            }
        }
        printParent(root.left);
        printParent(root.right);

    }

}
