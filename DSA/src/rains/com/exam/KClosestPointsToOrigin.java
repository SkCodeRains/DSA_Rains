package rains.com.exam;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KClosestPointsToOrigin {
    public static void main(String[] args) {
        // Sample points
        int[][] points = { { 1, 3 }, { -2, 2 }, { 5, 8 }, { 0, 1 } };
        int k = 2;

        // Find K closest points
        int[][] closestPoints = kClosest(points, k);

        // Print the result
        System.out.println("Original Points: " + Arrays.deepToString(points));
        System.out.println("K Closest Points: " + Arrays.deepToString(closestPoints));
    }

    public static int[][] kClosest(int[][] points, int k) {

        if (points.length == k) {
            return points;
        }

        PriorityQueue<int[]> minHeap = new PriorityQueue<>(
                (a, b) -> (b[0] * b[0] + b[1] * b[1]) - (a[0] * a[0] + a[1] * a[1]));
        for (int[] is : points) {

            minHeap.add(is);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        int[][] res = new int[k][2];

        while (!minHeap.isEmpty()) {
            res[--k] = minHeap.poll();
        }

        return res;

    }

}
