package Gereric_Tree;

import java.util.ArrayList;
import java.util.Stack;

public class preAndPostOrderIterative {
    public static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();

        public Node(int data, ArrayList<Node> children) {
            this.data = data;
            this.children = children;
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

    // not completed
    public static void main(String[] args) {
        Node root = new Node(0, null);

        Stack<Pair> st = new Stack<>();
        Pair pair = new Pair(root, -1);
        st.push(pair);

        while (st.size() != 0) {
            if (st.peek().state == -1) {
                System.out.println(st.peek().node.data);
                Pair pc = new Pair(st.peek().children., -1)
                st.peek().state++;

            }
        }

        // Stack<Node> curr = new Stack<>();
        // curr.push(root);
        // while (curr.size() != 0) {
        // Node temp = curr.pop();
        // System.out.println(temp.data);
        // int n = temp.children.size() - 1;
        // for (int i = n; i >= 0; i--) {
        // curr.push(temp.children.get(i));
        // }
        // }
    }

}
