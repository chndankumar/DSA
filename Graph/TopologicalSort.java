package Graph;

import java.util.*;

public class TopologicalSort {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        int[] visited = new int[graph.size()];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < graph.size(); i++) {
            if (visited[i] == 0)
                check(graph, visited, st, i);
            ;
        }
        int[] res = new int[st.size()];
        int i = 0;
        while (st.size() != 0) {
            res[i] = st.pop();
            i++;
        }
    }

    private static void check(ArrayList<ArrayList<Integer>> graph, int[] visited, Stack<Integer> st, int i) {
        visited[i] = 1;
        for (int j : graph.get(i)) {
            if (visited[j] == 0)
                check(graph, visited, st, j);
            ;
        }
        st.push(i);
        return;
    }
}
