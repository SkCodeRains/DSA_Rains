package rains.com.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class L013FindDuplicates {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 2, 4, 6, 7, 8, 5 };
        List<Integer> duplicates = findDuplicates(nums);
        System.out.println("Duplicate Elements: " + duplicates);
    }

    private static List<Integer> findDuplicates(int[] nums) {

        Map<Integer, Integer> frequencyMap = new HashMap<>();
        List<Integer> dublicates = new ArrayList<>();

        for (Integer integer : nums) {
            if (frequencyMap.containsKey(integer)) {
                dublicates.add(integer);
            } else {
                frequencyMap.put(integer, 1);
            }
        }

        return dublicates;
    }
}
