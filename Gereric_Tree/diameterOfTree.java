package Gereric_Tree;

import java.util.ArrayList;

public class diameterOfTree {
    public static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();

        public Node(int data, ArrayList<Node> children) {
            this.data = data;
            this.children = children;
        }
    }

    static int dia;

    public static void main(String[] args) {
        Node root = new Node(0, null);
        int height = maxHeight(root);
    }

    private static int maxHeight(Node root) {
        if (root.children.size() == 0) {
            return 0;
        }
        int h1 = 0;
        int h2 = 0;
        for (Node child : root.children) {
            int h = maxHeight(child);
            if (h <= h2) {
                if (h > h1) {
                    h1 = h;
                }
            } else if (h > h2) {
                h1 = h2;
                h2 = h;
            }
        }
        int d = h1 + h2 + 2;
        dia = Math.max(h2, d);
        return h2 + 1;
    }

}
