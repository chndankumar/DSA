package BinaryTree;

public class PathtoLeafFromRoot {
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
        int min = 50;
        int max = 110;
        printPath(root, min, max, 0);
    }

    private static void printPath(Node root, int min, int max, int sum) {
        if (root.left == null && root.right == null) {
            sum = sum + root.data;
            if (sum > min && sum < max) {
                System.out.println(sum);
            }
        }
        sum = sum + root.data;
        printPath(root.left, min, max, sum);
        printPath(root.right, min, max, sum);
    }
}
