package BinaryTree;

public class TraversalPreInPostOrder {
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
        printTraversal(root);
    }

    private static void printTraversal(Node root) {
        if (root == null) {
            return;
        }
        System.out.println(root.data + " in preOrder");
        printTraversal(root.left);
        System.out.println(root.data + " in inOrder");
        printTraversal(root.right);
        System.out.println(root.data + " in postOrder");
    }
}
