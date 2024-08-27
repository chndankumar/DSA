package Linklist;

public class foldLinklist {
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

        Node left = head;
        Node temp = head;

        public void fold(Node temp, int floor) {
            if (temp == null) {
                return;
            }
            fold(temp.next, floor + 1);
            if (floor > size / 2) {
                Node n = new Node(temp.data, left.next);
                left.next = n;
                temp.next = null;
                left = left.next;
            } else if (floor == size / 2) {
                temp.next = null;
                tail = temp;
            }
        }

    }
}
