package rains.com.graphs;

public class L005IslandPerimeter {
    int count = 0;

    public static void main(String[] args) {
        L005IslandPerimeter ob = new L005IslandPerimeter();

        int[][] grid = {
                { 0, 1, 0, 0 },
                { 1, 1, 1, 0 },
                { 0, 1, 0, 0 },
                { 1, 1, 0, 0 }
        };

        int count = ob.floodFill(grid);

        System.out.println(count);

    }

    private int floodFill(int[][] grid) {

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                if (grid[i][j] == 1) {
                    debthFirstSeach(grid, i, j);
                    break;
                }
            }
        }

        return count;

    }

    private void debthFirstSeach(int[][] grid, int row, int column) {

        if (row < 0 || row >= grid.length || column < 0 || column >= grid[0].length || grid[row][column] == 0) {
            count++;
            return;
        }

        if (grid[row][column] == 2)
            return;
        grid[row][column] = 2;

        debthFirstSeach(grid, row - 1, column);
        debthFirstSeach(grid, row, column + 1);
        debthFirstSeach(grid, row + 1, column);
        debthFirstSeach(grid, row, column - 1);
    }
}
