package Gereric_Tree;

import java.util.ArrayList;

public class ceilAndFloor {
    public static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();

        public Node(int data, ArrayList<Node> children) {
            this.data = data;
            this.children = children;
        }
    }

    static int ceil = Integer.MAX_VALUE;
    static int floor = Integer.MIN_VALUE;

    public static void main(String[] args) {
        Node root = new Node(ceil, null);
        int num = 5;
        getCeilAndFloor(root, num);
    }

    private static void getCeilAndFloor(Node root, int num) {
        if (root.data > num && root.data < ceil) {
            ceil = root.data;
        } else if (root.data < num && root.data > floor) {
            floor = root.data;
        }

        for (Node child : root.children) {
            getCeilAndFloor(child, num);
        }
    }
}
