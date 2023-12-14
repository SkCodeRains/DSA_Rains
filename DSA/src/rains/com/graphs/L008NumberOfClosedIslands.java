package rains.com.graphs;

/*  
 * Given a 2D grid consists of 0s (land) and 1s (water).
 * An island is a maximal 4-directionally connected group
 * of 0s and a closed island is an island totally 
 * (all left, top, right, bottom) surrounded by 1s.
 * Return the number of closed islands.
 * 
 */
public class L008NumberOfClosedIslands {
    public static void main(String[] args) {
        int[][] data = {
                { 1, 1, 1, 1, 1, 1, 1, 0 },
                { 1, 0, 0, 0, 0, 1, 1, 0 },
                { 1, 0, 1, 0, 1, 1, 1, 0 },
                { 1, 0, 0, 0, 0, 1, 0, 1 },
                { 1, 1, 1, 1, 1, 1, 1, 0 }
        };

        int area = closedIsland(data);
        System.out.println(area);
    }

    private static int closedIsland(int[][] data) {
        int closedIsland = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] == 0) {
                    if (debthFirstSearch(data, i, j)) {
                        closedIsland++;
                    }
                }
            }
        }

        return closedIsland;
    }

    private static boolean debthFirstSearch(int[][] data, int i, int j) {

        if (i < 0 || i >= data.length || j < 0 || j >= data[i].length) {
            return false;
        }
        if (data[i][j] == 1) {
            return true;
        }

        data[i][j] = 1;

        boolean a = debthFirstSearch(data, i + 1, j);
        boolean c = debthFirstSearch(data, i - 1, j);
        boolean b = debthFirstSearch(data, i, j + 1);
        boolean d = debthFirstSearch(data, i, j - 1);

        return a && b && c && d;

    }
}
