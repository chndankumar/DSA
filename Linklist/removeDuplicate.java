package Linklist;

public class removeDuplicate {

    // Array is sorted
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

        public void removeDuplicateNode() {
            Node temp = head;
            while (temp.next != null) {
                if (temp.data == temp.next.data) {
                    Node nxt = temp.next;
                    temp.next = temp.next.next;
                    nxt.next = null;
                    size--;
                } else {
                    temp = temp.next;
                }
            }
            tail = temp;
        }
    }

}
