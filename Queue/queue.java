package Queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {
        Queue<Integer> que = new ArrayDeque<>();
        que.add(10);
        System.out.println(que);
        que.add(20);
        System.out.println(que);
        que.add(30);
        System.out.println(que);
        System.out.println(que.peek());
        int no = que.remove();
        System.out.println(no);
        System.out.println(que);
    }
}
