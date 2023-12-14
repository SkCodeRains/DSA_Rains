package rains.com.graphs;

public class L001AdjacencyMatrix {

    // private int vertices;
    private int[][] verticesMetrix;

    public L001AdjacencyMatrix(int vertices) {
        this.verticesMetrix = new int[vertices][vertices];
        // this.vertices = vertices;
    }

    public static void main(String[] args) {
        int vertices = 5;
        L001AdjacencyMatrix graph = new L001AdjacencyMatrix(vertices);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);

        graph.displayMatrix();
    }

    public void addEdge(int source, int destination) {
        verticesMetrix[source][destination] = 1;
        verticesMetrix[destination][source] = 1; // For undirected graphs;
    }

    public void displayMatrix() {
        for (int[] is : verticesMetrix) {
            for (int i : is) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}