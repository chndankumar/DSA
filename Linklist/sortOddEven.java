package Linklist;

public class sortOddEven {
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

        public void removeLastNode() {
            if (size == 0) {
                System.out.println("node is empty");
            } else if (size == 1) {
                head = null;
                tail = null;
                size--;
            } else {
                Node node = head;
                int i = 0;
                while (i < size - 2) {
                    node = node.next;
                }
                node.next = null;
                tail = node;
            }
        }

        public void oddEven() {
            Linklist odd = new Linklist(null, null, 0);
            Linklist even = new Linklist(null, null, 0);
            while (this.head != null) {
                int d = head.data;
                head = head.next;
                if (d / 2 == 0) {
                    even.addLast(d);
                } else {
                    odd.addLast(d);
                }
            }

            if (odd.size == 0) {
                this.head = even.head;
                this.tail = even.tail;
            } else {
                odd.tail.next = even.head;
                this.head = odd.head;
                this.tail = even.tail;
            }
        }
    }
}
