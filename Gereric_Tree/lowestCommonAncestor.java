package Gereric_Tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

public class lowestCommonAncestor {
    public static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();

        public Node(int data, ArrayList<Node> children) {
            this.data = data;
            this.children = children;
        }
    }

    public static void main(String[] args) {
        int num = 8;
        Node root = new Node(0, null);
        display(root);
        int s = size(root);
        int m = maxVal(root);
        int h = height(root);
        printTraversal(root);
        displayLevelOrder(root);
        displayLinewise(root);
        displayZigzag(root);
        mirror(root);
        removelastleaf(root);
        boolean res = find(root, num);
        ArrayList<Node> path = getPath(root, num);
        Node resNode = lacNode(root, 70, 120);

    }

    // private static ArrayList<Node> getPath(Node root) {

    // ArrayList<Node> res = new ArrayList<>();
    // if (root.children.size() == 0) {
    // res.add(root);
    // return res;
    // }

    // for (Node child : root.children) {
    // ArrayList<Node> chRes = getPath(child);
    // if (res.size() < chRes.size()) {
    // res = chRes;
    // }
    // }
    // return res;
    // }

    private static Node lacNode(Node root, int i, int j) {
        ArrayList<Node> list1 = getPath(root, i);
        ArrayList<Node> list2 = getPath(root, j);

        int s = list1.size() - 1;

        while (s >= 0) {
            if (list1.get(s) != list1.get(s)) {
                return list1.get(s + 1);
            }
        }
        return null;
    }

    private static ArrayList<Node> getPath(Node root, int num) {
        ArrayList<Node> res = new ArrayList<>();
        if (root.data == num) {
            res.add(root);
            return res;
        }

        for (Node child : root.children) {
            ArrayList<Node> chRes = getPath(child, num);
            if (chRes.size() > 0) {
                chRes.add(root);
                return chRes;
            }
        }
        return res;
    }

    private static boolean find(Node root, int num) {
        if (root.data == num) {
            return true;
        }
        for (Node child : root.children) {
            if (find(child, num)) {
                return true;
            }
        }
        return false;
    }

    private static void removelastleaf(Node root) {
        if (root.children.size() == 0) {
            root = null;
        }
        for (Node child : root.children) {
            removelastleaf(child);
        }

    }

    private static void mirror(Node root) {
        if (root.children.size() == 0) {
            return;
        }
        for (Node child : root.children) {
            mirror(child);
        }
        int s = root.children.size();
        while (s != 0) {
            Node temp = root.children.get(0);
            root.children.remove(0);
            root.children.add(temp);
        }
    }

    // need to improve this funtion
    private static void displayZigzag(Node root) {
        Queue<Node> que = new ArrayDeque<>();
        Stack<Node> st = new Stack<>();
        que.add(root);
    }

    private static void displayLinewise(Node root) {

        Queue<Node> parent = new ArrayDeque<>();
        Queue<Node> child = new ArrayDeque<>();
        parent.add(root);

        while (parent.size() != 0) {
            Node temp = parent.remove();
            System.out.println(temp.data);
            for (Node node : temp.children) {
                child.add(node);
            }

            if (parent.size() == 0) {
                Queue<Node> t = parent;
                parent = child;
                child = t;
            }
        }

    }

    private static void displayLevelOrder(Node root) {
        Queue<Node> que = new ArrayDeque<>();
        que.add(root);
        while (que.size() > 0) {
            Node temp = que.remove();
            System.out.println(temp.data);
            for (Node child : temp.children) {
                que.add(child);
            }
        }
    }

    private static void printTraversal(Node root) {
        System.out.println("node Pre" + root.data);

        for (Node child : root.children) {
            System.out.print("edge pre" + root.data + "-" + child.data);
            printTraversal(child);
            System.out.print("edge post" + root.data + "-" + child.data);
        }

        System.out.println("node post" + root.data);
    }

    private static int height(Node root) {
        if (root.children.size() == 0) {
            return 0;
        }
        int val = 0;
        for (Node child : root.children) {
            val = Math.max(val, height(child));
        }
        return val + 1;
    }

    private static int maxVal(Node root) {

        int max = Integer.MIN_VALUE;
        for (Node child : root.children) {
            max = Math.max(max, maxVal(child));
        }
        max = Math.max(max, root.data);
        return max;
    }

    private static int size(Node root) {
        int s = 1;
        if (root.children.size() == 0) {
            return 1;
        }
        for (Node child : root.children) {
            s = s + size(child);
        }
        return s;
    }

    private static void display(Node root) {
        System.out.println(root.data);
        if (root.children.size() == 0) {
            return;
        }

        System.out.println();
        for (Node child : root.children) {
            display(child);
        }
    }
}
