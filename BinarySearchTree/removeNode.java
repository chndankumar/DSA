package BinarySearchTree;

//not Completed 
public class removeNode {
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
        int num = 75;
        removeleaf(root, num);
    }

    private static void removeleaf(Node root, int num) {
        if (root.data == num) {
            Node node = new Node(num, null, null);
            if (root.left == null && root.right == null) {
                root = null;
                return;
            } else if (root.left == null) {
                root = root.right;
                root.right = null;
            } else if (root.right == null) {
                root = root.left;
                root.left = null;
            } else {
                int max = getMax(root.left);
                root.data = max;
            }
            return;
        }
    }

    private static int getMax(Node node) {
        if (node == null) {
            return 0;
        }
        int lm = getMax(node.left);
        int rm = getMax(node.right);
        return Math.max(node.data, Math.max(lm, rm));
    }
}
