package Linklist;

public class linklistIntro {
    public class Node {
        int data;
        Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public class Linklist {
        Node head;
        Node tail;
        int size;

        public Linklist(Node head, Node tail, int size) {
            this.head = head;
            this.tail = tail;
            this.size = size;
        }
    }
}
