package BinaryTree;

public class heightSumMaxMin {
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
    static int height = 0;
    static int min = Integer.MAX_VALUE;
    static int max = Integer.MIN_VALUE;

    public static void main(String[] args) {
        Node root = new Node(height, null, null);
        setValue(root, 0);
    }

    private static void setValue(Node root, int depth) {

        sum = sum + root.data;
        min = Math.min(min, root.data);
        max = Math.max(max, root.data);
        height = Math.max(height, depth);

        if (root.left != null) {
            setValue(root.left, depth++);
        }
        if (root.right != null) {
            setValue(root.right, depth);
        }

    }
}
