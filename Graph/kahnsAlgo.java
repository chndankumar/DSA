package Graph;

import java.util.*;

public class kahnsAlgo {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        int[] inDegreeCount = new int[graph.size()];
        //Count the no of incoming edge
        for (int i = 0; i < graph.size(); i++) {
            for (int v : graph.get(i)) {
                inDegreeCount[v] = inDegreeCount[v] + 1;
            }
        }
        //push the node that have 0 in degree count that shoule be comre frist in topo-sort
        Queue<Integer> que = new ArrayDeque<>();
        for (int i = 0; i < graph.size(); i++) {
            if (inDegreeCount[i] == 0) {
                que.add(i);
            }
        }
        int[] res = new int[graph.size()];
        int c = 0;
        while (que.size() != 0) {
            int node = que.remove();
            res[c] = node;
            c++;
            //reduve the indegree for each node for whome there parent come to the list first
            for (int i : graph.get(node)) {
                help[i] = help[i] - 1;
                if (help[i] == 0) {
                    que.add(i);
                }
            }
        }
       return res;
    }
}
