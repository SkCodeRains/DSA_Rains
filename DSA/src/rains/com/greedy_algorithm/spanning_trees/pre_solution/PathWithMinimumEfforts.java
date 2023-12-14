package rains.com.greedy_algorithm.spanning_trees.pre_solution;

import java.util.LinkedList;
import java.util.Queue;

public class PathWithMinimumEfforts {
    private static final int[][] DIRECTIONS = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };

    public int minimumEffortPath(int[][] heights) {
        int rows = heights.length;
        int cols = heights[0].length;
        int left = 0;
        int right = 1_000_000; // Maximum possible effort difference

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canReachTarget(heights, mid, rows, cols)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    private boolean canReachTarget(int[][] heights, int maxEffort, int rows, int cols) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] { 0, 0 });
        boolean[][] visited = new boolean[rows][cols];
        visited[0][0] = true;

        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int row = curr[0];
            int col = curr[1];

            if (row == rows - 1 && col == cols - 1) {
                return true; // Reached the target
            }

            for (int[] dir : DIRECTIONS) {
                int newRow = row + dir[0];
                int newCol = col + dir[1];

                if (newRow >= 0 && newRow < rows && newCol >= 0 && newCol < cols
                        && !visited[newRow][newCol]
                        && Math.abs(heights[newRow][newCol] - heights[row][col]) <= maxEffort) {
                    queue.offer(new int[] { newRow, newCol });
                    visited[newRow][newCol] = true;
                }
            }
        }

        return false; // Couldn't reach the target
    }
}
