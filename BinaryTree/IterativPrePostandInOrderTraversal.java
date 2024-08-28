package BinaryTree;

import java.util.*;

public class IterativPrePostandInOrderTraversal {
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

    public static class Pair {
        Node node;
        int state;

        public Pair(Node node, int state) {
            this.node = node;
            this.state = state;
        }
    }

    public static void main(String[] args) {
        Stack<Pair> st = new Stack<>();
        Node root = new Node(0, null, null);
        Pair pair = new Pair(root, 0);
        st.push(pair);

        while (st.size() != 0) {
            if (st.peek().state == 0) {
                System.out.println(st.peek().node.data + " in preOrder");
                st.peek().state++;
                if (st.peek().node.left != null) {
                    Node temp = st.peek().node.left;
                    Pair p = new Pair(temp, 0);
                    st.push(p);
                }
            } else if (st.peek().state == 1) {
                System.out.println(st.peek().node.data + " in inOrder");
                st.peek().state++;
                if (st.peek().node.right != null) {
                    Node temp = st.peek().node.right;
                    Pair p = new Pair(temp, 0);
                    st.push(p);
                }
            } else if (st.peek().state == 2) {
                System.out.println(st.peek().node.data + " in postOrder");
                st.pop();
            }
        }
    }
}
