package Linklist;

public class addFrist {
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

        public int getFrist() {
            if (size == 0) {
                return -1;
            } else {
                return head.data;
            }
        }

        public int getLast() {
            if (size == 0) {
                return -1;
            } else {
                return tail.data;
            }
        }

        public int getAtIdx(int idx) {
            if (size == 0 || idx >= size) {
                return -1;
            } else {
                Node temp = head;
                int i = 0;
                while (i != idx) {
                    temp = temp.next;
                    i++;
                }
                int data = temp.data;
                temp = null;
                return data;
            }
        }

        public void addFristNode(int val) {
            Node temp = new Node(val, null);
            if (size == 0) {
                head = temp;
                tail = temp;
            } else {
                temp.next = head;
                head = temp;
            }
            size++;
        }
    }

    public static void main(String[] args) {

    }
}
