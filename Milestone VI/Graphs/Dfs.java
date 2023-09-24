import java.util.Iterator;
import java.util.LinkedList;

public class Dfs {
    private int v;
    private LinkedList<Integer> adj[];
    
    @SuppressWarnings("unchecked")
    public Dfs(int v) {
        this.v = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) { // Change the condition to <v
            adj[i] = new LinkedList<>();
        }
    }

    public void addEdge(int r, int u) { // Change the parameter name from v to r
        adj[r].add(u); // Use r as the source vertex
    }

    public void dfsTraversal(int v, boolean[] visited) {
        visited[v] = true;
        System.out.print(v + " "); // Change println to print
        Iterator<Integer> itr = adj[v].listIterator();
        while (itr.hasNext()) {
            int n = itr.next();
            if (!visited[n]) {
                dfsTraversal(n, visited);
            }
        }
    }

    public static void main(String[] args) {
        int v = 4;
        Dfs dfs = new Dfs(v);
        dfs.addEdge(0, 1);
        dfs.addEdge(0, 2);
        dfs.addEdge(1, 2);
        dfs.addEdge(2, 0);
        dfs.addEdge(3, 3);
        dfs.addEdge(2, 3);

        System.out.println("DFS from 0: ");
        dfs.dfsTraversal(0, new boolean[v]);

        System.out.println();

        System.out.println("DFS from 1: ");
        dfs.dfsTraversal(1, new boolean[v]);
        
        System.out.println();

        System.out.println("DFS from 2: ");
        dfs.dfsTraversal(2, new boolean[v]);
    }
}
