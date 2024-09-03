package Level_One_DSA.HashMapAndHeap;

import java.util.ArrayList;
import java.util.LinkedList;

public class HashMapImplementation<K, V> {
    public class Node {
        K key;
        V val;

        public Node(K key, V val) {
            this.key = key;
            this.val = val;
        }
    }

    int size = 0;
    LinkedList<Node>[] bucket;

    public void initMap(int n) {
        bucket = new LinkedList[n];
        for (int i = 0; i < bucket.length; i++) {
            bucket[i] = new LinkedList<>();
        }
    }

    public void put(K key, V val) {
        int bi = getbucketListIndex(key);
        int dataIdx = getListDataIndex(bi, key);
        if (dataIdx != -1) {
            bucket[bi].get(dataIdx).val = val;
        } else {
            Node node = new Node(key, val);
            bucket[bi].add(node);
            size++;
        }
        int threshHoldVal = 3;
        int lemda = size / bucket.length;
        if (lemda > threshHoldVal) {
            reHash();
        }
    }

    private void reHash() {
        LinkedList<Node>[] oldbucket = bucket;
        initMap(oldbucket.length * 2);
        size = 0;
        for (LinkedList<Node> li : oldbucket) {
            for (Node node : li) {
                put(node.key, node.val);
            }
        }
    }

    public boolean containKey(K key) {
        int bi = getbucketListIndex(key);
        int dataidx = getbucketListIndex(key);
        if (dataidx != -1) {
            return true;
        } else {
            return false;
        }
    }

    public V get(K key) {
        int bi = getbucketListIndex(key);
        int dataIdx = getListDataIndex(bi, key);
        if (dataIdx != -1) {
            return bucket[bi].get(dataIdx).val;
        } else {
            return null;
        }
    }

    public V remove(K key) {
        int bi = getbucketListIndex(key);
        int dataIdx = getListDataIndex(bi, key);
        if (dataIdx != -1) {
            Node node = bucket[bi].remove(dataIdx);
            return node.val;
        } else {
            return null;
        }
    }

    public ArrayList<K> keySet() {
        ArrayList<K> set = new ArrayList<>();
        for (LinkedList<Node> li : bucket) {
            for (Node node : li) {
                set.add(node.key);
            }
        }
        return set;
    }

    private int getListDataIndex(int bi, K key) {
        int dataIdx = 0;
        LinkedList<Node> list = bucket[bi];
        for (Node node : list) {
            if (node.key.equals(key)) {
                return dataIdx;
            }
            dataIdx++;
        }
        return -1;
    }

    private int getbucketListIndex(K key) {
        int hashCode = key.hashCode();
        hashCode = Math.abs(hashCode);
        return hashCode / bucket.length;
    }

    public static void main(String[] args) {

    }
}
