import java.util.*;

public class Dijkstra {
    // why can't static method access class inside this class
    static class Node implements Comparator<Node> { 
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
    public static void main(String[] args) {
        List<ArrayList<Node>> graph = new ArrayList<ArrayList<Node>>();
        for (int i = 0; i < 7;i++) {
            graph.add(new ArrayList<Node>());
        }
        graph.get(0).add(new Node(1,2));
        graph.get(0).add(new Node(2,1));
        graph.get(1).add(new Node(3,11));
        graph.get(1).add(new Node(4,3));
        graph.get(1).add(new Node(2,5));
        graph.get(2).add(new Node(5,15));
        graph.get(3).add(new Node(4,2));
        graph.get(4).add(new Node(2,1));
        graph.get(4).add(new Node(5,4));
        graph.get(4).add(new Node(6,5));
        graph.get(6).add(new Node(3,1));
        graph.get(6).add(new Node(5,1));

        Dijkstra dijkstra = new Dijkstra(7);
        dijkstra.DijkstraSP(graph, 0);

        System.out.println("The shorted path from node :"); 
        for (int i = 0; i < dijkstra.dist.length; i++) {
            System.out.println(0 + " to " + i + " is "
                               + dijkstra.dist[i]); 
        } 
    }

    private int dist[]; 
    private Set<Integer> settled; 
    private PriorityQueue<Node> pq; 
    private int V;
    List<ArrayList<Node> > graph; 
  
    public Dijkstra(int V) { 
        this.V = V; 
        dist = new int[V]; 
        settled = new HashSet<Integer>(); 
        pq = new PriorityQueue<Node>(V, new Node()); 
    } 
  
    // Function for Dijkstra's Algorithm 
    public void DijkstraSP(List<ArrayList<Node> > graph, int src) {
        this.graph = graph;
        for (int i = 0; i < V; i++) {
            dist[i] = Integer.MAX_VALUE; 
        }
        pq.add(new Node(src, 0)); 
        dist[src] = 0; 
        while (settled.size() != V) { 
  
            // remove the minimum distance node  
            // from the priority queue
            // similiar to poll but will throw exception
            int currentNode = pq.remove().node; 

            // add node to set whose distance is finalized
            settled.add(currentNode);

            // iterate through neighbors
            for(int i = 0;i < graph.get(currentNode).size();i++) {
                Node neighbor = graph.get(currentNode).get(i);

                if (!settled.contains(neighbor.node)) {
                    int edgeDistance = neighbor.weight;
                    int newDistance = dist[currentNode] + edgeDistance;

                    if (dist[neighbor.node] > newDistance) {
                        dist[neighbor.node] = newDistance;
                    }

                    pq.add(new Node(neighbor.node, dist[neighbor.node]));
                }
            }
        }
    }
}