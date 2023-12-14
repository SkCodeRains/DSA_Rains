package rains.com.graphs;

public class L009JourneyToTheMoon {
    public static void main(String[] args) {
        int[][] astronaut = {
                { 0, 1 },
                { 2, 3 },
                { 0, 4 }
        };

        int area = journeyToMoon(5, astronaut);
        System.out.println(area);
    }

    private static int journeyToMoon(int n, int[][] astronaut) {

        // Create a union-find data structure to represent the relationships between the
        // astronauts.
        UnionFind uf = new UnionFind(n);
        for (int[] pair : astronaut) {
            uf.union(pair[0], pair[1]);
        }

        // Count the number of astronauts in each country.
        int[] countrySizes = new int[n];
        for (int i = 0; i < n; i++) {
            countrySizes[uf.find(i)]++;
        }

        // Calculate the number of pairs of astronauts from different countries.
        int totalPairs = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                totalPairs += countrySizes[i] * countrySizes[j];
            }
        }
        return totalPairs;
    }
}

class UnionFind {
    private int[] parent;
    private int[] size;

    public UnionFind(int n) {
        parent = new int[n];
        size = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
            size[i] = 1;
        }
    }

    public int find(int node) {
        if (parent[node] != node) {
            parent[node] = find(parent[node]);
        }
        return parent[node];
    }

    public void union(int node1, int node2) {
        int root1 = find(node1);
        int root2 = find(node2);

        if (root1 == root2) {
            return;
        }

        if (size[root1] < size[root2]) {
            int temp = root1;
            root1 = root2;
            root2 = temp;
        }

        parent[root2] = root1;
        size[root1] += size[root2];
    }
}
