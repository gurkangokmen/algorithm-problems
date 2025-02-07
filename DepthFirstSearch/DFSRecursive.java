package DepthFirstSearch;

import java.util.*;

public class DFSRecursive {
    private Map<Integer, List<Integer>> graph = new HashMap<>();
    private Set<Integer> visited = new HashSet<>();

    // Add an edge to the graph (undirected)
    public void addEdge(int u, int v) {
        graph.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
        graph.computeIfAbsent(v, k -> new ArrayList<>()).add(u); // Remove this for directed graph
    }

    // Recursive DFS function
    public void dfs(int node) {
        System.out.println("Current Node: "+ node);

        if (visited.contains(node)) return;

        visited.add(node);
        //System.out.print(node + " "); // Process the node

        for (int neighbor : graph.getOrDefault(node, new ArrayList<>())) {
            System.out.println("Current Neighbor: "+ neighbor);
            dfs(neighbor);
        }
    }

    public static void main(String[] args) {
        DFSRecursive dfsGraph = new DFSRecursive();

        // Creating a sample graph
        dfsGraph.addEdge(0, 1);
        dfsGraph.addEdge(0, 2);
        dfsGraph.addEdge(1, 3);
        dfsGraph.addEdge(1, 4);
        dfsGraph.addEdge(2, 5);
        dfsGraph.addEdge(2, 6);

        System.out.println("DFS (Recursive) Traversal:");

        // for (Integer i : dfsGraph.graph.keySet()) {
        //     System.out.println(i + " " + dfsGraph.graph.get(i));
        // }

        dfsGraph.dfs(0); // Start DFS from node 0
    }
}