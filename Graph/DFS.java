package Graph;

import java.io.*;
import java.util.*;

public class DFS {
    public static class Edge {
        int v1;
        int v2;
        int wt;

        public Edge(int v1, int v2, int wt) {
            this.v1 = v1;
            this.v2 = v2;
            this.wt = wt;
        }
    }

    static int small = Integer.MIN_VALUE;
    static int large = Integer.MAX_VALUE;
    static int ceil = Integer.MAX_VALUE;
    static int floor = Integer.MIN_VALUE;
    static int kth;
    static int mark = 40;
    static int k = 3;
    static PriorityQueue<Pair> pq = new PriorityQueue<>();

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int vertx = Integer.parseInt(br.readLine());
        ArrayList<Edge>[] graph = new ArrayList[vertx];

        int noEdges = Integer.parseInt(br.readLine());

        for (int i = 0; i < noEdges; i++) {
            String[] parts = br.readLine().split(" ");
            int v1 = Integer.parseInt(parts[0]);
            int v2 = Integer.parseInt(parts[1]);
            int wt = Integer.parseInt(parts[2]);
            graph[v1].add(new Edge(v1, v2, wt));
            graph[v2].add(new Edge(v2, v1, wt));
        }
        int src = Integer.parseInt(br.readLine());
        int des = Integer.parseInt(br.readLine());
        boolean[] visited = new boolean[graph.length];
        findAllPath(graph, src, des, visited, "", 0);
    }

    private static void findAllPath(ArrayList<Edge>[] graph, int src, int des, boolean[] visited, String path,
            int sum) {
        if (src == des) {
            if (sum < small) {
                small = sum;
            }
            if (sum > large) {
                small = sum;
            }
            if (sum > mark && sum < ceil) {
                ceil = sum;
            }
            if (sum < mark && sum > floor) {
                floor = sum;
            }
            if (pq.size() < k + 1) {
                pq.add(new Pair(sum, path));
            } else {
                if (pq.peek().data < sum) {
                    pq.remove();
                    pq.add(new Pair(sum, path));
                }
            }
            System.out.println(path + src);
            return;
        }

        ArrayList<Edge> li = graph[src];
        visited[src] = true;
        for (Edge edge : li) {
            if (visited[edge.v2] == false) {
                findAllPath(graph, edge.v2, des, visited, path + edge.v1, sum + edge.v1);
            }
        }
        visited[src] = false;
    }

    public static class Pair implements Comparable<Pair> {
        int data;
        String path;

        public Pair(int data, String path) {
            this.data = data;
            this.path = path;
        }

        @Override
        public int compareTo(Pair o) {
            return this.data - o.data;
        }
    }
}
