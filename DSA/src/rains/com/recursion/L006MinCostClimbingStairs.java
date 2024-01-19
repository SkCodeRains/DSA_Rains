package rains.com.recursion;

public class L006MinCostClimbingStairs {
    public static void main(String[] args) {
        int[] cost = { 10, 15, 20 };
        int result = minCostClimbingStairs(cost);

        System.out.println("Minimum cost to climb stairs: " + result);
    }

    private static int minCostClimbingStairs(int[] cost) {
        int min = 0;
        for (int i = 2; i < cost.length; i++) {
            min += Math.min(cost[i - 1], cost[i - 2]);
        }
        return min;
    }
}
