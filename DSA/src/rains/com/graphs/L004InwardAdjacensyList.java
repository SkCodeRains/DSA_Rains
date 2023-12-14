package rains.com.graphs;

import java.util.ArrayList;

public class L004InwardAdjacensyList {

    private ArrayList<ArrayList<Integer>> inwardEdges;

    public L004InwardAdjacensyList(int vertices) {
        this.inwardEdges = new ArrayList<ArrayList<Integer>>(vertices);
        for (int i = 0; i < vertices; i++) {
            inwardEdges.add(new ArrayList<Integer>());
        }
    }

    public static void main(String[] args) {
        int vertices = 5;
        L004InwardAdjacensyList graph = new L004InwardAdjacensyList(vertices);

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 1);
        graph.addEdge(3, 2);
        graph.addEdge(4, 3);

        graph.displayMatrix();
    }

    private void addEdge(int source, int destination) {
        this.inwardEdges.get(destination).add(source);
    }

    private void displayMatrix() {
        int index = 1;
        for (ArrayList<Integer> linkedList : inwardEdges) {
            System.out.print("Vertex " + index++ + " --> ");
            for (Integer integer : linkedList) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }
    }

}
