package Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class IsAGraphCyclicByBFS {
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
        boolean[] visited = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (visited[i] == false) {
                if (isCyclic(graph, visited, i)) {
                    System.out.println("its cyclic");
                    break;
                }
            }
        }
        System.out.println("its not cyclic");
    }

    private static boolean isCyclic(ArrayList<Edge>[] graph, boolean[] visited, int i) {
        Queue<Pair> qu = new ArrayDeque<>();
        visited[i] = true;
        qu.add(new Pair(i, 1));
        while (qu.size() != 0) {
            Pair p = qu.remove();
            int idx = p.idx;
            int par = p.par;

            for (Edge edge : graph[idx]) {
                if (visited[edge.v2] == false) {
                    visited[idx] = true;
                    qu.add(new Pair(edge.v2, idx));
                } else {
                    if (edge.v2 != par)
                        return true;
                }
            }
        }
        return false;
    }

    public static class Pair {
        int idx;
        int par;

        public Pair(int idx, int par) {
            this.idx = idx;
            this.par = par;
        }
    }
}
