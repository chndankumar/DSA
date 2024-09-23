package Graph;

import java.util.*;

public class kahnsAlgo {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        int[] help = new int[graph.size()];
        for (int i = 0; i < graph.size(); i++) {
            for (int v : graph.get(i)) {
                help[v] = help[v] + 1;
            }
        }
        Queue<Integer> que = new ArrayDeque<>();
        for (int i = 0; i < graph.size(); i++) {
            if (help[i] == 0) {
                que.add(i);
            }
        }
        int[] res = new int[graph.size()];
        int c = 0;
        while (que.size() != 0) {
            int node = que.remove();
            res[c] = node;
            c++;
            for (int i : graph.get(node)) {
                help[i] = help[i] - 1;
                if (help[i] == 0) {
                    que.add(i);
                }
            }
        }
        if (que.size() != 0) {

        }
    }
}
