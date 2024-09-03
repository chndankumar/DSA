package Graph;

import java.io.*;
import java.util.*;

public class GetConnectedComponents {
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

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // tell me total no of vertex you want;
        int vertx = Integer.parseInt(br.readLine());
        ArrayList<Edge>[] graph = new ArrayList[vertx];

        // no of efge between the vertx
        int noEdges = Integer.parseInt(br.readLine());

        // filling every edge in corresponding vertx
        for (int i = 0; i < noEdges; i++) {
            String[] parts = br.readLine().split(" ");
            int v1 = Integer.parseInt(parts[0]);
            int v2 = Integer.parseInt(parts[1]);
            int wt = Integer.parseInt(parts[2]);
            graph[v1].add(new Edge(v1, v2, wt));
            graph[v2].add(new Edge(v2, v1, wt));
        }
        // tell me source and destinetion
        int src = Integer.parseInt(br.readLine());
        int des = Integer.parseInt(br.readLine());
        boolean[] visited = new boolean[graph.length];
        ArrayList<String> res = new ArrayList<>();
        for (int i = 0; i < graph.length; i++) {
            if (visited[i] == false) {
                String resStr = isConnected(graph, src, visited, "");
                if (resStr.length() != 0) {
                    res.add(resStr);
                }
            }
        }
    }

    private static String isConnected(ArrayList<Edge>[] graph, int src, boolean[] visited, String path) {
        String res = "";
        ArrayList<Edge> li = graph[src];
        visited[src] = true;
        for (Edge edge : li) {
            if (visited[edge.v2] == false) {
                String temp = isConnected(graph, src, visited, path);
                res = res + temp;
            }
        }
        return src + res;
    }
}
