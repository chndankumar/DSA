package Linklist;

public class reversePointerRecursive {
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

        public void display(Node temp) {
            if (temp.next == null) {
                System.out.println(temp.data);
                return;
            }
            display(temp.next);
            System.out.println(temp.data);
        }
    }

    public void pointerReverse(Node temp) {
        if (temp == null) {
            return;
        }

        Node next = temp.next;
        pointerReverse(temp.next);
        next.next = temp;
    }

}
