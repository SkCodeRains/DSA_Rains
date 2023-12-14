package rains.com.greedy_algorithm.spanning_trees.pre_solution;

import java.util.Arrays;
import java.util.PriorityQueue;

public class TheMaze2 {

    private static final int[][] DIRECTIONS = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };

    public int shortestDistance(int[][] maze, int[] start, int[] destination) {
        int m = maze.length;
        int n = maze[0].length;

        int[][] distance = new int[m][n];
        for (int[] row : distance) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }

        distance[start[0]][start[1]] = 0;

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[2] - b[2]);
        pq.offer(new int[] { start[0], start[1], 0 });

        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int row = curr[0];
            int col = curr[1];
            int dist = curr[2];

            if (row == destination[0] && col == destination[1]) {
                return dist;
            }

            for (int[] dir : DIRECTIONS) {
                int newRow = row;
                int newCol = col;
                int newDist = dist;

                while (isValid(newRow + dir[0], newCol + dir[1], m, n) &&
                        maze[newRow + dir[0]][newCol + dir[1]] == 0) {
                    newRow += dir[0];
                    newCol += dir[1];
                    newDist++;
                }

                if (newDist < distance[newRow][newCol]) {
                    distance[newRow][newCol] = newDist;
                    pq.offer(new int[] { newRow, newCol, newDist });
                }
            }
        }

        return -1; // No path found
    }

    private boolean isValid(int row, int col, int m, int n) {
        return row >= 0 && row < m && col >= 0 && col < n;
    }
}
