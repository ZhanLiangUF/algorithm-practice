import java.util.*;

public class Dijkstra {
    public static void main(String[] args) {
    }

    class Node implements Comparator<Node> { 
        public int node; 
        public int weight; 
        
        public Node() {}

        public Node(int node, int weight) { 
            this.node = node; 
            this.weight = weight; 
        } 
      
        @Override
        public int compare(Node node1, Node node2) { 
            if (node1.weight < node2.weight) 
                return -1; 
            if (node1.weight > node2.weight) 
                return 1; 
            return 0; 
        } 
    }

    private int dist[]; 
    private Set<Integer> settled; 
    private PriorityQueue<Node> pq; 
    private int V;
    List<List<Node> > graph; 
  
    public Dijkstra(int V) { 
        this.V = V; 
        dist = new int[V]; 
        settled = new HashSet<Integer>(); 
        pq = new PriorityQueue<Node>(V, new Node()); 
    } 
  
    // Function for Dijkstra's Algorithm 
    public void DijkstraSP(List<List<Node> > graph, int src) {
        this.graph = graph;
        for (int i = 0; i < V; i++) {
            dist[i] = Integer.MAX_VALUE; 
        }
        pq.add(new Node(src, 0)); 
        dist[src] = 0; 
    }

}