
import java.util.Iterator;
import java.util.LinkedList;

public class CheckForCycle {
    private int v;
    private LinkedList<Integer> adj[];

    @SuppressWarnings("unchecked")
    public CheckForCycle(int v) { // Changed from Dfs to CheckForCycle
        this.v = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    public void addEdge(int v, int u) {
        adj[v].add(u);
        adj[u].add(v);
    }

    public boolean isCycleUtil(int v, boolean[] visited, int parent) {
        visited[v] = true;
        Integer i;

        Iterator<Integer> itr = adj[v].iterator();
        while (itr.hasNext()) {
            i = itr.next();
            if (!visited[i]) { // Fixed the condition here
                if (isCycleUtil(i, visited, v)) {
                    return true;
                }
            } else if (i != parent) {
                return true;
            }
        }
        return false; // Moved this line outside the while loop
    }

    public boolean isCyclic(int v) { // Changed from isCycle to isCyclic
        boolean[] visited = new boolean[v];
        for (int i = 0; i < v; i++) {
            visited[i] = false;
        }
        for (int i = 0; i < v; i++) {
            if (!visited[i]) {
                if (isCycleUtil(i, visited, -1)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int v1 = 5;

        CheckForCycle graph1 = new CheckForCycle(v1);
        graph1.addEdge(1, 0);
        graph1.addEdge(0, 2);
        graph1.addEdge(2, 1);
        graph1.addEdge(0, 3);
        graph1.addEdge(3, 4);

        if (graph1.isCyclic(v1)) {
            System.out.println("Graph contains a cycle");
        } else {
            System.out.println("Graph doesn't contain a cycle");
        }

        int v2 = 3;

        CheckForCycle graph2 = new CheckForCycle(v2);
        graph2.addEdge(0, 1);
        graph2.addEdge(1, 2);

        if (graph2.isCyclic(v2)) {
            System.out.println("Graph contains a cycle");
        } else {
            System.out.println("Graph doesn't contain a cycle");
        }
    }
}
