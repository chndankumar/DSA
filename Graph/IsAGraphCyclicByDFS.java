package Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class IsAGraphCyclicByDFS {
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
                if (isCyclic(graph, src, -1, visited)) {
                    System.out.println("it is cyclic");
                    break;
                }
            }
        }
        System.out.println("it is not cyclic");
    }

    private static boolean isCyclic(ArrayList<Edge>[] graph, int src, int parent, boolean[] visited) {

        visited[src] = true;
        for (Edge edge : graph[src]) {
            if (visited[edge.v2] == false) {
                if (isCyclic(graph, edge.v2, src, visited)) {
                    return true;
                }
            } else {
                if (edge.v2 != parent)
                    return true;
            }
        }
        return false;
    }
}
