package Linklist;

public class mergeTwoLinkdList {
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
    }

    public Linklist mergLinklist(Linklist li1, Linklist li2) {

        Node one = li1.head;
        Node two = li2.head;
        Linklist res = new Linklist(null, null, 0);

        while (one != null && two != null) {
            if (one.data >= two.data) {
                res.head.data = one.data;
                one=one.next
            }
        }
        return null;
    }
}
