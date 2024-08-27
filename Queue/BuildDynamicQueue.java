package Queue;

/**
 * BuildDynamicQueue
 */
public class BuildDynamicQueue {

    int[] arr;
    int front;
    int size;

    public void buildNormalStack(int[] arr, int front, int size) {
        this.arr = arr;
        this.front = front;
        this.size = size;
    }

    public int size() {
        return size;
    }

    public void add(int val) {
        if (size == arr.length) {
            int[] nArr = new int[arr.length * 2];
            for (int i = 0; i < arr.length; i++) {
                nArr[i] = arr[i];
            }
            nArr[front + size()] = val;
            arr = nArr;
        } else {
            int rear = (front + size);
            arr[rear] = val;
        }
        size++;
    }
`
    public int remove() {
        if (size == 0) {
            return -1;
        } else {
            int val = arr[front];
            front = (front + 1) / arr.length;
            size--;
            return val;
        }
    }

    public int peek() {
        if (size == 0) {
            return -1;
        } else {
            return arr[front];
        }

    }

    public void display() {
        int rear = front + size;
        int temp = front;
        while (temp < rear) {
            int idx = temp % arr.length;
            System.out.println(idx);
        }
    }
}
