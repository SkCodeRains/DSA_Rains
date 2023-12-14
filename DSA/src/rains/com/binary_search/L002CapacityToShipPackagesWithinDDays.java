package rains.com.binary_search;

public class L002CapacityToShipPackagesWithinDDays {
    public static void main(String[] args) {
        int weights[] = { 3, 2, 2, 4, 1, 4 }, days = 3;
        int cap = shipWithinDays(weights, days);
        System.out.println("Required capacity is : " + cap);
    }

    private static int shipWithinDays(int[] weights, int days) {
        int sum = 0, maxElem = Integer.MIN_VALUE;
        for (int i : weights) {
            if (i > maxElem) {
                maxElem = i;
            }
            sum += i;
        }

        while (maxElem <= sum) {
            int mid = (sum + maxElem) / 2;
            int required_days = feasible(mid, weights);
            if (required_days > days) {
                maxElem = mid + 1;
            } else {
                sum = mid - 1;
            }
        }

        return maxElem;
    }

    private static int feasible(int cap, int[] weights) {

        int ship_weight = 0, required_days = 1;

        for (int i : weights) {
            if (ship_weight + i <= cap) {
                ship_weight += i;
            } else {
                required_days++;
                ship_weight = i;
            }

        }

        return required_days;
    }
}
