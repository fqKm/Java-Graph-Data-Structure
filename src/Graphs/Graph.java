package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Graph {
    final LinkedList<Vertex> vertices;
    int totalWeight = 0;
    public Graph (){
        this.vertices = new LinkedList<>();
    }
    public void addVertex (String value){
        vertices.add(new Vertex(value));
    }
    public void addEdge (String source, String dest, int weight){
        Vertex SourceVertex = getVertex(source);
        Vertex DestinationVertex = getVertex(dest);
        Edge edge = new Edge(SourceVertex, DestinationVertex, weight);
        SourceVertex.addEdge(edge);
    }

    public Vertex getVertex(String value){
        for (Vertex vertex : vertices) {
            if (vertex.getValues().equals(value)){
                return vertex;
            }
        }
        return null;
    }

    public List<Vertex> getVertices(){
        return vertices;
    }

    public Edge getEdge(String source, String dest){
        Vertex sourceVertex = getVertex(source);
        Vertex destVertex = getVertex(dest);
        for (Vertex vertex : vertices) {
            if (vertex.equals(sourceVertex)){
                for (Edge edge : vertex.getEdges()) {
                    if (edge.getDest().equals(destVertex)){
                        return edge;
                    }
                }
            }

        }
        return null;
    }

    public void printGraph(){
        for (Vertex vertex : vertices) {
            System.out.print(vertex.getValues() + ": ");
            for (Edge edge : vertex.getEdges()) {
                System.out.print(edge.getSource().getValues() + " -> " + edge.getDest().getValues() + ": " + edge.getWeight()+ ", ");
            }
            System.out.println();
        }
    }
    public void DFSUtils(Vertex start, Vertex end, boolean[] visited){
        int index = vertices.indexOf(start);
        visited[index] = true;
        System.out.print(start.getValues() + " --> ");

        if (start.equals(end)){
            System.out.println(" End ");
            System.out.println("Total Weight: " + totalWeight);
            System.exit(0);
            return;
        }
        for (Edge edge : start.getEdges()) {
            int destIndex = vertices.indexOf(edge.getDest());
            if (!visited[destIndex]){
                totalWeight += edge.getWeight();
                DFSUtils(edge.getDest(), end, visited);
            }
        }
    }
    public void DFS(String start, String End){
        Vertex startVertex = getVertex(start);
        Vertex endVertex = getVertex(End);
        boolean[] visited = new boolean[vertices.size()];
        DFSUtils(startVertex, endVertex, visited);
    }
}
