package Graph;

import java.util.ArrayList;

public class isBipartiteGraphDFS {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        int[] visited = new int[graph.size()];
        for (int i = 0; i < graph.size(); i++) {
            if (visited[i] == 0) {
                visited[i] = 1;
                boolean res = isBipartite(graph, visited, 0);
                if (res == false) {
                    System.out.println("not bipartite");
                    break;
                }
            }
            System.out.println("bipartite");
        }
    }

    private static boolean isBipartite(ArrayList<ArrayList<Integer>> graph, int[] visited, int src) {
        int col;
        if (visited[src] == 1) {
            col = 2;
        } else {
            col = 1;
        }
        for (int i : graph.get(src)) {
            if (visited[i] == 0) {
                visited[i] = col;
                if (isBipartite(graph, visited, i)) {
                    return false;
                }
            } else if (visited[i] == visited[src]) {
                return false;
            }
        }
        return true;
    }
}
