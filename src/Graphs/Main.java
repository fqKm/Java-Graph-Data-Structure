package Graphs;

public class Main {
    public static Graph graph = new Graph();

    public static void main(String[] args) {
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");

        graph.addEdge("A", "B", 10);
        graph.addEdge("B", "D", 20);
        graph.addEdge("B", "C", 10);
        graph.addEdge("C", "A", 40);
        graph.addEdge("C", "B", 40);
        graph.addEdge("C", "D", 20);

        graph.printGraph();
        graph.DFS("A", "D");
    }
}