package Linklist;

public class removeFrist {
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

        public void addLast(int val) {
            Node temp = new Node(val, null);
            if (size == 0) {
                head = temp;
                tail = temp;
            } else {
                tail.next = temp;
                temp = tail;
            }
            size++;
        }

        public void displaylist() {
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }

        public void removeFristNode() {
            if (size == 0) {
                System.err.println("link list is empty");
            } else if (size == 1) {
                head = null;
                tail = null;
                size--;
            } else {
                head = head.next;
                size--;
            }
        }
    }

    public static void main(String[] args) {

    }
}
