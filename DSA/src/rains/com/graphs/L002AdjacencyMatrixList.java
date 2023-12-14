package rains.com.graphs;

import java.util.ArrayList;
import java.util.LinkedList;

public class L002AdjacencyMatrixList {

    private ArrayList<LinkedList<Integer>> adjacencyList;

    public L002AdjacencyMatrixList(int vertices) {
        this.adjacencyList = new ArrayList<LinkedList<Integer>>(vertices);
        for (int i = 0; i < vertices; i++) {
            this.adjacencyList.add(new LinkedList<Integer>());
        }
    }

    public static void main(String[] args) {
        int vertices = 5;
        L002AdjacencyMatrixList graph = new L002AdjacencyMatrixList(vertices);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);

        graph.displayMatrix();
    }

    private void displayMatrix() {
        int index = 1;
        for (LinkedList<Integer> linkedList : adjacencyList) {
            System.out.print("Vertex " + index++ + " --> ");
            for (Integer integer : linkedList) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }
    }

    private void addEdge(int source, int destination) {
        adjacencyList.get(source).add(destination);
        adjacencyList.get(destination).add(source);// For undirected graphs
    }
}
