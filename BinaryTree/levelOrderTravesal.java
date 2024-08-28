package BinaryTree;

import java.util.*;

public class levelOrderTravesal {
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
        Queue<Node> child = new ArrayDeque<>();
        Queue<Node> parent = new ArrayDeque<>();
        Node root = new Node(0, null, null);
        parent.add(root);
        while (parent.size() > 0) {

            Node temp = parent.remove();
            System.out.print(temp.data);
            if (temp.left != null) {
                child.add(temp.left);
            }
            if (temp.right != null) {
                child.add(temp.right);
            }
            if (parent.size() == 0) {
                Queue<Node> t;
                t = parent;
                parent = child;
                child = t;
                System.out.println();
            }
        }
    }

}
