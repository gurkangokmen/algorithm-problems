package DepthFirstSearch;

import java.util.*;

public class DFSIterative {
    private Map<Integer, List<Integer>> graph = new HashMap<>();

    // Add an edge to the graph
    public void addEdge(int u, int v) {
        graph.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
        graph.computeIfAbsent(v, k -> new ArrayList<>()).add(u); // Remove for directed graph
    }

    // Iterative DFS function using Stack
    public void dfs(int startNode) {
        Set<Integer> visited = new HashSet<>();
        Stack<Integer> stack = new Stack<>();
        stack.push(startNode);

        while (!stack.isEmpty()) {
            int node = stack.pop();
            if (!visited.contains(node)) {
                visited.add(node);
                System.out.print(node + " "); // Process the node

                // Push neighbors to stack in reverse order for correct order processing
                List<Integer> neighbors = graph.getOrDefault(node, new ArrayList<>());
                Collections.reverse(neighbors);
                for (int neighbor : neighbors) {
                    if (!visited.contains(neighbor)) {
                        stack.push(neighbor);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        DFSIterative dfsGraph = new DFSIterative();

        // Creating a sample graph
        dfsGraph.addEdge(0, 1);
        dfsGraph.addEdge(0, 2);
        dfsGraph.addEdge(1, 3);
        dfsGraph.addEdge(1, 4);
        dfsGraph.addEdge(2, 5);
        dfsGraph.addEdge(2, 6);

        System.out.println("DFS (Iterative) Traversal:");
        dfsGraph.dfs(0); // Start DFS from node 0
    }
}