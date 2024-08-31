package BinarySearchTree;

public class constructTree {
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
        int[] arr = new int[9];
        Node root = new Node(0, null, null);
        fillTree(root, arr, 0, arr.length - 1);
    }

    private static void fillTree(Node root, int[] arr, int min, int max) {
        if (min > max) {
            return;
        }
        int m = (max - min) / 2;
        root.data = arr[m];
        fillTree(root.left, arr, min, m - 1);
        fillTree(root.right, arr, m + 1, max);
    }
}
