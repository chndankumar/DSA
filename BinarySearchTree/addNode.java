package BinarySearchTree;

public class addNode {
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
        int num = 57;
        addLastNode(root, num);
    }

    private static void addLastNode(Node root, int num) {

        if (root.data > num) {
            if (root.left == null) {
                root.left = new Node(num, null, null);
                return;
            } else {
                addLastNode(root.right, num);
            }
        } else {
            if (root.right == null) {
                root.right = new Node(num, null, null);
                return;
            } else {
                addLastNode(root.right, num);
            }
        }

    }
}
