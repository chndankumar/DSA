package BinaryTree;

import java.util.*;

public class NodeToRootPath {
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
        ArrayList<Node> path = getPath(root, 70);
    }

    private static ArrayList<Node> getPath(Node root, int num) {
        ArrayList<Node> res = new ArrayList<>();
        if (root.data == num) {
            res.add(root);
        }
        // left call to check if avilable
        if (root.left != null) {
            if (getPath(root.left, num).size() != 0) {
                res.add(root);
                return res;
            }
        }
        if (root.right != null) {
            if (getPath(root.right, num).size() != 0) {
                res.add(root);
                return res;
            }
        }
        return res;
    }
}
