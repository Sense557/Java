import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class KruskalAlgo {
    static class Edge {
        int src, dest, weight;

        public Edge(int src, int dest, int weight) {
            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }
    }

    static class Subset {
        int parent, rank;

        public Subset(int parent, int rank) {
            this.parent = parent;
            this.rank = rank;
        }
    }

    public static void kruskal(int v, List<Edge> edges) {
        int j = 0;
        int noOfEdges = 0;

        Subset subsets[] = new Subset[v];
        Edge result[] = new Edge[v];

        for (int i = 0; i < v; i++) {
            subsets[i] = new Subset(i, 0);
        }

        // Sort the edges in ascending order based on weight
        Collections.sort(edges, new Comparator<Edge>() {
            @Override
            public int compare(Edge e1, Edge e2) {
                return e1.weight - e2.weight;
            }
        });

        while (noOfEdges < v - 1 && j < edges.size()) {
            Edge nextEdge = edges.get(j);
            int x = findRoot(subsets, nextEdge.src);
            int y = findRoot(subsets, nextEdge.dest);

            if (x != y) {
                result[noOfEdges] = nextEdge;
                union(subsets, x, y);
                noOfEdges++;
            }
            j++;
        }
        System.out.println("Following are the edges to create MST: ");
        int minCost = 0;
        for (int i = 0; i < noOfEdges; i++) {
            System.out.println(result[i].src + " -- " + result[i].dest + " === cost: " + result[i].weight);
            minCost += result[i].weight;
        }
        System.out.println("Total weight of MST: " + minCost);
    }

    // To find the parent for a set
    public static int findRoot(Subset[] subsets, int i) {
        if (subsets[i].parent == i) {
            return subsets[i].parent;
        }
        subsets[i].parent = findRoot(subsets, subsets[i].parent);
        return subsets[i].parent;
    }

    // To unite two disjoint sets
    public static void union(Subset[] subsets, int x, int y) {
        int rootX = findRoot(subsets, x);
        int rootY = findRoot(subsets, y);

        if (subsets[rootY].rank < subsets[rootX].rank) {
            subsets[rootY].parent = rootX;
        } else if (subsets[rootX].rank < subsets[rootY].rank) {
            subsets[rootX].parent = rootY;
        } else {
            subsets[rootY].parent = rootX;
            subsets[rootX].rank++;
        }
    }

    public static void main(String[] args) {
        int v = 4;
        List<Edge> graphEdges = new ArrayList<>(
            List.of(new Edge(0, 1, 10),
                    new Edge(0, 3, 5),
                    new Edge(1, 3, 15),
                    new Edge(2, 3, 4))
        );

        kruskal(v, graphEdges);
    }
}
