package Graphs;

public class Edge {
    private Vertex Source;
    private Vertex Dest;
    private Integer weight;
    public Edge(Vertex Source, Vertex Dest, Integer weight) {
        this.Source = Source;
        this.Dest = Dest;
        this.weight = weight;
    }
    public Vertex getSource() {
        return Source;
    }
    public Vertex getDest() {
        return Dest;
    }
    public Integer getWeight() {
        return weight;
    }
}
