package Graphs;

import java.util.List;
import java.util.ArrayList;

public class Vertex {
    private String values;
    private List<Edge> edges;

    public Vertex(String values) {
        this.values = values;
        this.edges = new ArrayList<>();
    }
    public String getValues() {
        return values;
    }
    public List<Edge> getEdges() {
        return edges;
    }
    public void addEdge(Edge edge) {
        this.edges.add(edge);
    }
    public Edge getEdge(int index) {
        return this.edges.get(index);
    }
}