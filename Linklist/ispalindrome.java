package Linklist;

public class ispalindrome {
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
        boolean flag = true;

        public void check(Node temp, int check) {
            if (temp != null) {
                return;
            }
            check(temp.next, check + 1);
            if (check >= size / 2) {
                if (left.data != temp.data) {
                    flag = false;
                }
            }
            left = left.next;
        }
    }
}
