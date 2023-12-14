package rains.com.greedy_algorithm.spanning_trees.pre_solution;

import java.util.*;

class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        // Create a graph represented as an adjacency list
        @SuppressWarnings("unchecked")
		List<int[]>[] graph = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int[] time : times) {
            int u = time[0];
            int v = time[1];
            int w = time[2];
            graph[u].add(new int[] { v, w });
        }

        // Initialize distances with a maximum value
        int[] dist = new int[n + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);

        // Use a PriorityQueue for Dijkstra's algorithm
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);

        // Start from node k with a delay of 0
        dist[k] = 0;
        pq.offer(new int[] { k, 0 });

        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int u = curr[0];
            int currDist = curr[1];

            if (currDist > dist[u]) {
                continue; // Skip if we've already found a shorter path
            }

            for (int[] neighbor : graph[u]) {
                int v = neighbor[0];
                int delay = neighbor[1];
                int newDist = currDist + delay;

                if (newDist < dist[v]) {
                    dist[v] = newDist;
                    pq.offer(new int[] { v, newDist });
                }
            }
        }

        int maxDelay = 0;
        for (int i = 1; i <= n; i++) {
            if (dist[i] == Integer.MAX_VALUE) {
                return -1; // Some nodes are not reachable
            }
            maxDelay = Math.max(maxDelay, dist[i]);
        }

        return maxDelay;
    }
}
