package rains.com.graphs;

import java.util.LinkedList;
import java.util.Queue;

public class L006FloodFill {
    public int[][] floodFill1(int[][] image, int sr, int sc, int newColor) {
        int rows = image.length;
        int cols = image[0].length;
        int oldColor = image[sr][sc];

        // If the new color is the same as the old color, no changes are needed
        if (oldColor == newColor) {
            return image;
        }

        // Create a queue for BFS
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] { sr, sc });

        // Perform BFS to traverse and fill the connected region
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int r = current[0];
            int c = current[1];

            // Change the color of the current pixel to the new color
            image[r][c] = newColor;

            // Check and add neighboring pixels with the same old color to the queue
            int[][] neighbors = { { r + 1, c }, { r - 1, c }, { r, c + 1 }, { r, c - 1 } };
            for (int[] neighbor : neighbors) {
                int nr = neighbor[0];
                int nc = neighbor[1];
                if (nr >= 0 && nr < rows && nc >= 0 && nc < cols && image[nr][nc] == oldColor) {
                    queue.add(new int[] { nr, nc });
                }
            }
        }

        return image;
    }

    public static void main(String[] args) {
        L006FloodFill ob = new L006FloodFill();

        int[][] image = {
                { 1, 1, 1 },
                { 1, 1, 0 },
                { 1, 0, 1 }
        };

        int[][] newImage = ob.floodFill(image, 1, 1, 4);

        for (int[] is : newImage) {
            System.out.println();
            for (int is2 : is) {
                System.out.print(" " + is2);
            }
        }

    }

    private int[][] floodFill(int[][] image, int sr, int sc, int newColor) {

        if (image[sr][sc] == newColor)
            return image;

        debthFirstSearch(image, sr, sc, newColor, image[sr][sc]);

        return image;
    }

    private void debthFirstSearch(int[][] image, int sr, int sc, int newColor, int current) {
        if (sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length || current != image[sr][sc]) {
            return;
        }
        image[sr][sc] = newColor;
        debthFirstSearch(image, sr + 1, sc, newColor, current);
        debthFirstSearch(image, sr - 1, sc, newColor, current);
        debthFirstSearch(image, sr, sc + 1, newColor, current);
        debthFirstSearch(image, sr, sc - 1, newColor, current);

    }
}
