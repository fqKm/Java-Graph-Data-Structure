package Graphs;

import java.util.LinkedList;

public class Vertex {
    private String values;
    private LinkedList<Edge> edges;

    public Vertex(String values) {
        this.values = values;
        this.edges = new LinkedList<>();
    }
    public String getValues() {
        return values;
    }
    public LinkedList<Edge> getEdges() {
        return edges;
    }
    public void addEdge(Edge edge) {
        this.edges.add(edge);
    }
    public Edge getEdge(int index) {
        return this.edges.get(index);
    }
}