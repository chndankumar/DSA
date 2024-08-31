package BinarySearchTree;

public class ReplaceSumofLarger {
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

    static int sum = 0;

    public static void main(String[] args) {
        Node root = new Node(0, null, null);
        replaceSum(root);
    }

    private static void replaceSum(Node root) {
        if (root == null) {
            return;
        }
        replaceSum(root.right);
        int num = root.data;
        root.data = sum;
        sum = sum + num;
        replaceSum(root.left);

    }
}
