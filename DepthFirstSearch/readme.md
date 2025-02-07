# What is Depth-First Search (DFS)?

Depth-First Search (DFS) is a fundamental graph traversal algorithm used to explore nodes and edges of a graph or tree. It follows a depth-first approach, meaning it starts at a source node and explores as far as possible along each branch before backtracking.

# How DFS Works
```
1. Start at a node (typically the root in a tree or any arbitrary node in a graph).
2. Mark it as visited to avoid re-visiting.
3. Recursively visit all its unvisited neighbors (or children in a tree).
4. Backtrack when reaching a dead-end (i.e., a node with no unvisited neighbors).
```

# DFS Types

DFS can be implemented using:

1. Recursion (implicitly uses the call stack)
2. Stack (explicitly) for an iterative approach

# Time & Space Complexity

```
Time Complexity: 𝑂(𝑉+𝐸), where V is the number of vertices and E is the number of edges.
Space Complexity: Recursive DFS: 𝑂(𝑉) (due to recursion stack)
                  Iterative DFS: 𝑂(𝑉) (due to explicit stack)
```

# DFS Applications

```
Pathfinding: Maze solving, shortest path in unweighted graphs.
Topological Sorting: Used in dependency resolution.
Cycle Detection: Used in detecting cycles in directed and undirected graphs.
Connected Components: Finding strongly connected components in a graph.
AI and Game Trees: Used in backtracking problems like Sudoku, N-Queens, etc.
```

# Gif

![Image](https://skilled.dev/images/dfs.gif)

# Code

![Image](https://github.com/user-attachments/assets/79072d72-dbb4-42e5-9ee3-43c2327e8be8)

## 1. Recursive DFS (Using Adjacency List)

```java
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
        if (visited.contains(node)) return;

        visited.add(node);
        System.out.print(node + " "); // Process the node

        for (int neighbor : graph.getOrDefault(node, new ArrayList<>())) {
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
        dfsGraph.dfs(0); // Start DFS from node 0
    }
}
```

## 2. Iterative DFS (Using Stack)


```java
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
```