package rains.com.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L005RemoveDuplicatesfromSortedArray {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(new Integer[] { 1, 1, 2 });
        System.out.println(removeDuplicates(nums));

    }

    public static List<Integer> removeDuplicates(List<Integer> nums) {
        // Your code goes here
        List<Integer> ans = new ArrayList<>();
        ans.add(nums.get(0));
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) != nums.get(i - 1)) {
                ans.add(nums.get(i));
            }
        }
        return ans;
    }

}
