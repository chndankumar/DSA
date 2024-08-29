package BinaryTree;

import java.util.ArrayList;

public class PrintNodesKLevelFar {
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
        int num = 70;
        int k = 3;
        ArrayList<Node> path = getNodetoRootPath(root, 90);
        for (int i = 0; i < path.size() && i < k; i++) {
            printKLevelDown(path.get(i), k - i, i == 0 ? null : path.get(i));
        }
    }

    private static void printKLevelDown(Node node, int k, Node block) {
        if (node == block) {
            return;
        }
        if (k == 0) {
            System.out.println(node.data);
            return;
        }
        if (node.left != null) {
            printKLevelDown(node, k--, block);
        }
        if (node.right != null) {
            printKLevelDown(node, k--, block);
        }
    }

    private static ArrayList<Node> getNodetoRootPath(Node root, int num) {
        ArrayList<Node> res = new ArrayList<>();
        if (root.data == num) {
            res.add(root);
            return res;
        }

        if (root.left != null) {
            if (getNodetoRootPath(root.left, num).size() != 0) {
                res = getNodetoRootPath(root, num);
                res.add(root);
                return res;
            }
        }
        if (root.right != null) {
            if (getNodetoRootPath(root.right, num).size() != 0) {
                res = getNodetoRootPath(root, num);
                res.add(root);
                return res;
            }
        }
        return res;
    }
}
