package Graph;

import java.util.*;;

public class Intro {
    public static class Edge {
        int src;
        int nbr;
        int wt;

        public Edge(int src, int nbr, int wt) {
            this.src = src;
            this.nbr = nbr;
            this.wt = wt;
        }
    }

    public static void main(String[] args) {
        ArrayList<Edge>[] graph = new ArrayList[7];

        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 3, 40));
        graph[1].add(new Edge(1, 0, 10));
        graph[1].add(new Edge(1, 2, 10));
        graph[2].add(new Edge(2, 1, 10));
        graph[2].add(new Edge(2, 3, 10));
        graph[3].add(new Edge(3, 0, 40));
        graph[3].add(new Edge(3, 2, 40));
        graph[3].add(new Edge(3, 4, 2));
        graph[4].add(new Edge(4, 5, 3));
        graph[4].add(new Edge(4, 6, 8));
        graph[5].add(new Edge(5, 4, 3));
        graph[5].add(new Edge(5, 6, 6));
        graph[6].add(new Edge(6, 5, 3));
        graph[6].add(new Edge(6, 4, 8));
    }
    // graph is array of node where each node is presented as a arraylist which hold
    // edge and that edge has source, origin, weight.
    // graph is looklike two item have same related value that they hold it and it
    // also hold that relation for other too many vise versa
}
