package Graph;

import java.io.*;
import java.util.*;

public class PerfectFriend {
    public static class Edge {
        int v1;
        int v2;

        public Edge(int v1, int v2) {
            this.v1 = v1;
            this.v2 = v2;
        }
    }

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int vertx = Integer.parseInt(br.readLine());
        ArrayList<Edge>[] graph = new ArrayList[vertx];

        int noEdges = Integer.parseInt(br.readLine());

        for (int i = 0; i < noEdges; i++) {
            String[] parts = br.readLine().split(" ");
            int v1 = Integer.parseInt(parts[0]);
            int v2 = Integer.parseInt(parts[1]);
            graph[v1].add(new Edge(v1, v2));
            graph[v2].add(new Edge(v2, v1));
        }
        int src = Integer.parseInt(br.readLine());
        boolean[] grouped = new boolean[graph.length];
        ArrayList<String> res = new ArrayList<>();
        for (int i = 0; i < graph.length; i++) {
            if (grouped[i] == false) {
                String resStr = isConnected(graph, src, grouped, "");
                if (resStr.length() != 0) {
                    res.add(resStr);
                }
            }
        }

        int count = 0;
        for (int i = 0; i < res.size(); i++) {
            String str1 = res.get(i);
            for (int j = i + 1; j < res.size(); j++) {
                String str = res.get(j);
                count = count + str.length() * str1.length();
            }
        }
    }

    private static String isConnected(ArrayList<Edge>[] graph, int src, boolean[] grouped, String path) {
        String res = "";
        ArrayList<Edge> li = graph[src];
        grouped[src] = true;
        for (Edge edge : li) {
            if (grouped[edge.v2] == false) {
                String temp = isConnected(graph, src, grouped, path);
                res = res + temp;
            }
        }
        return src + res;
    }
}
