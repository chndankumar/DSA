package Linklist;

public class kthFromLast {
    public class Node {

        int data;
        Node next;

        Node(int data, Node node) {
            this.data = data;
            this.next = node;
        }
    }

    public class Linklist {

        Node head;
        Node tail;
        int size;

        Linklist(Node head, Node tail, int size) {
            this.tail = tail;
            this.head = head;
            this.size = size;
        }

        public Node KthNode(int k) {
            Node s = head;
            Node f = head;
            for (int i = 0; i < k; i++) {
                f = f.next;
            }

            while (f != null) {
                s = s.next;
                f = f.next;
            }

            return s;
        }
    }
}
