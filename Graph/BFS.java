package Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class BFS {
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
        Queue<Vertx> qu = new ArrayDeque<>();
        qu.add(new Vertx(src, src + ""));

        while (qu.size() != 0) {
            // remove
            Vertx vx = qu.remove();
            // mark that it's visited if visisted continue do not do any work
            if (visited[vx.idx] = true) {
                continue;
            }
            visited[vx.idx] = true;
            // print path or do the work with vertex
            System.out.println(vx.path);
            // add child
            for (Edge edge : graph[vx.idx]) {
                if (visited[edge.v2] == false) {
                    qu.add(new Vertx(edge.v2, vx.path + edge.v2));
                }
            }
        }
    }

    public static class Vertx {
        int idx;
        String path;

        public Vertx(int idx, String path) {
            this.idx = idx;
            this.path = path;
        }
    }

}
