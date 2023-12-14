package rains.com.graphs;

public class L007MaxAreaofIsland {

    private static int maxAreaOfIsland(int[][] array) {
        int maxArea = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == 1) {
                    int area = debthFirstSearch(array, i, j);
                    maxArea = Math.max(maxArea, area);
                }
            }
        }

        return maxArea;
    }

    private static int debthFirstSearch(int[][] array, int row, int column) {
        if (row < 0 || row >= array.length || column < 0 || column >= array[row].length || array[row][column] == 0) {
            return 0;
        }
        array[row][column] = 0;

        int area = 1;
        area += debthFirstSearch(array, row + 1, column); // Down
        area += debthFirstSearch(array, row - 1, column); // UP
        area += debthFirstSearch(array, row, column + 1); // RIGHT
        area += debthFirstSearch(array, row, column - 1); // LEFT
        return area;
    }

    public static void main(String[] args) {
        int[][] data = {
                { 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0 },
                { 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0 },
                { 0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0 }
        };

        int area = maxAreaOfIsland(data);
        System.out.println(area);
    }
}
