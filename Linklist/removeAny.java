package Linklist;

public class removeAny {
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

        public void addAtIndx(int val, int idx) {
            Node temp = new Node(val, null);
            if (size == 0) {
                head = temp;
                tail = temp;
            } else if (idx == 0) {
                addFristNode(val);
            } else if (idx == size) {
                addLast(val);
            } else {
                Node node = head;
                int i = 0;
                while (i != idx - 1) {
                    node = node.next;
                    i++;
                }
                temp.next = node.next;
                node.next = temp;
            }
            size++;
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

        public void reverseByPointer() {
            Node past = head;
            Node curr = head.next;
            Node fut = head.next.next;

            while (curr != null) {
                curr.next = past;
                past = curr;
                curr = fut;
                fut = fut.next;
            }
            Node temp = tail;
            tail = head;
            tail.next = null;
            head = temp;
            temp = null;
        }

        public void removeAtIdx(int idx) {
            if (size == 0) {
                System.out.println("error h bhai");
            } else if (idx == 0) {
                removeFristNode();
            } else if (idx == size - 1) {
                removeLastNode();
            } else {
                Node temp = head;
                int i = 0;
                while (i != idx - 1) {
                    temp = temp.next;
                }
                temp.next = temp.next.next;
                size--;
            }
        }

    }

    public static void main(String[] args) {

    }
}
