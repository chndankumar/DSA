package Gereric_Tree;

import java.util.ArrayList;

public class kthLargest {
    public static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();

        public Node(int data, ArrayList<Node> children) {
            this.data = data;
            this.children = children;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(0, null);
        int k = 4;
        int res = findKthLargest(root, k);
    }

    static int floor = Integer.MIN_VALUE;

    private static int findKthLargest(Node root, int k) {
        int max = Integer.MAX_VALUE;
        for (int i = 0; i < k; i++) {
            getCeil(root, max);
            max = floor;
            floor = Integer.MIN_VALUE;
        }
        return max;
    }

    private static void getCeil(Node root, int max) {
        if (root.data < max && root.data > floor) {
            floor = root.data;
        }
        for (Node child : root.children) {
            getCeil(root, max);
        }
    }
}
