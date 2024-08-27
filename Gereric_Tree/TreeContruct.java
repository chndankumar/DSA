package Gereric_Tree;

import java.util.*;

public class TreeContruct {

    public static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();

        public Node(int data, ArrayList<Node> children) {
            this.data = data;
            this.children = children;
        }
    }

    public static void main(String[] args) {
        Node root;
        ArrayList<Integer> num = new ArrayList<>();
        Stack<Node> st = new Stack<>();
        ArrayList<Node> children = new ArrayList<>();
        root = new Node(num.get(0), children);
        st.push(root);
        for (int i = 1; i < num.size(); i++) {
            if (num.get(0) >= 0) {
                st.push(new Node(num.get(i), new ArrayList<>()));
            } else {
                Node child = st.pop();
                st.peek().children.add(child);
            }
        }
    }

}
