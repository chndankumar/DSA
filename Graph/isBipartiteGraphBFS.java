package Graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class isBipartiteGraphBFS {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        int[] visited = new int[graph.size()];
        for (int i = 0; i < graph.size(); i++) {
            if (visited[i] == 0) {
                boolean res = isBipartite(graph, visited);
                if (res == false) {
                    System.out.println("not bipartite");
                    break;
                }
            }
        }
    }

    public static boolean isBipartite(ArrayList<ArrayList<Integer>> graph, int[] visited) {
        Queue<Integer> que = new ArrayDeque<>();
        visited[0] = 1;
        que.add(0);
        while (que.size() != 0) {
            int node = que.remove();
            int col;
            if (visited[node] == 1) {
                col = 2;
            } else {
                col = 1;
            }
            for (int vertex : graph.get(node)) {
                // if neighbor node is not leveled or visited
                // make the opposite color or level of current
                if (visited[vertex] == 0) {
                    visited[vertex] = col;
                    que.add(vertex);
                } // if neighbour is color then then some is mark it by other path
                  // if both have same color or level than two adjacent cannot have same color
                else if (visited[vertex] == visited[node]) {
                    return false;
                }
            }
        }
        return true;
    }
}

class Pair {
    int idx;
    int col;

    public Pair(int col, int idx) {
        this.col = col;
        this.idx = idx;
    }
}
