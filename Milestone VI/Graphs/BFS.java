
import java.util.Iterator;
import java.util.LinkedList;

public class BFS {
    private int v;
    private LinkedList<Integer> adj[];
    
    @SuppressWarnings("unchecked")
    public BFS(int v) {
        this.v = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    public void addEdge(int r, int u) {
        adj[r].add(u); // Use r as the source vertex
    }

    public void bfsTraversal(int s) {
        boolean[] visited = new boolean[v];
        LinkedList<Integer> queue = new LinkedList<>();
        visited[s] = true;
        queue.add(s);

        while (!queue.isEmpty()) {
            s = queue.poll();
            System.out.print(s + " "); // Print vertices on the same line
            Iterator<Integer> itr = adj[s].listIterator();
            while (itr.hasNext()) {
                int n = itr.next();
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
        System.out.println(); // Add a newline after finishing traversal
    }

    public static void main(String[] args) {
        int v = 4;
        BFS bfs = new BFS(v);
        bfs.addEdge(0, 1);
        bfs.addEdge(0, 2);
        bfs.addEdge(1, 2);
        bfs.addEdge(2, 0);
        bfs.addEdge(3, 3);
        bfs.addEdge(2, 3);

        System.out.println("Bfs from 0: ");
        bfs.bfsTraversal(0);

        System.out.println();

        System.out.println("Bfs from 1: ");
        bfs.bfsTraversal(1);
        
        System.out.println();

        System.out.println("Bfs from 2: ");
        bfs.bfsTraversal(2);
    }
}
