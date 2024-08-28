package BinaryTree;

import java.util.*;

public class ConstructTree {
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
        Integer[] arr = new Integer[11];
        Stack<Pair> st = new Stack<>();
        Node node = new Node(arr[0], null, null);
        Pair p = new Pair(node, 0);
        st.push(p);
        int i = 1;
        while (st.size() != 0) {
            if (st.peek().state == 0) {
                st.peek().state++;
                if (arr[i] != null) {
                    Node nxtNode = new Node(arr[i], null, null);
                    Pair np = new Pair(node, 0);
                    st.peek().node.left = node;
                    st.push(p);
                    i++;
                }
            } else if (st.peek().state == 1) {
                st.peek().state++;
                if (arr[i] != null) {
                    Node nxtNode = new Node(arr[i], null, null);
                    Pair np = new Pair(node, 0);
                    st.peek().node.left = node;
                    st.push(p);
                    i++;
                }
            } else {
                st.pop();
            }
        }
    }
}
