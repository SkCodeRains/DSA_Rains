package rains.com.graphs;

import java.util.ArrayList;

public class L003EdgeList {
    private ArrayList<Edge> edges;

    public L003EdgeList(int vertices) {
        this.edges = new ArrayList<Edge>(vertices);
    }

    public static void main(String[] args) {
        int vertices = 5;
        L003EdgeList graph = new L003EdgeList(vertices);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);

        graph.displayMatrix();
    }

    private void displayMatrix() {
        for (Edge edge : edges) {
            System.out.println(edge);
        }
    }

    private void addEdge(int source, int destination) {
        edges.add(new Edge(source, destination));
    }
}

class Edge {
    int source;
    int destination;

    public Edge(int source, int destination) {
        this.source = source;
        this.destination = destination;
    }

    @Override
    public String toString() {
        return "Edge: " + source + " -> " + destination;
    }
}
