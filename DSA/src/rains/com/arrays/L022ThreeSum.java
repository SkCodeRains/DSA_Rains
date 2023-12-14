package rains.com.arrays;

import java.util.*;

public class L022ThreeSum {
    public static void main(String[] args) {
        int[] nums = { -1, 0, 1, 2, -1, -4 };
        List<List<Integer>> ans = threeSum(nums);
        System.out.println(ans);
    }

    public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int target = -nums[i];
            int start = i + 1, end = n - 1;
            while (start < end) {
                if (nums[start] + nums[end] == target) {
                    List<Integer> arr = new ArrayList<>(List.of(nums[i], nums[start], nums[end]));
                    ans.add(arr);
                    while (start < end && nums[start] == nums[start + 1])
                        start++;
                    while (start < end && nums[end] == nums[end - 1])
                        end--;
                    start++;
                    end--;
                } else if (nums[start] + nums[end] > target) {
                    end--;
                } else {
                    start++;
                }
            }
            while (i + 1 < n && nums[i + 1] == nums[i])
                i++;
        }
        return ans;

        // Set<List<Integer>> result = new HashSet<>();
        // Arrays.sort(nums);
        // for (int i = 0; i < nums.length; i++) {
        // int left = i + 1, right = nums.length - 1;
        // while (left < right) {
        // int sum = nums[i] + nums[left] + nums[right];
        // if (sum == 0) {
        // Integer arr[] = { nums[i], nums[left], nums[right] };
        // result.add(Arrays.asList(arr));
        // left++;
        // right--;
        // } else if (sum < 0) {
        // left++;
        // } else {
        // right--;
        // }

        // }

        // }
        // return new ArrayList<>(result);

        // List<List<Integer>> result = new ArrayList<>();
        // for (int i = 0; i < nums.length; i++) {
        // for (int j = i + 1; j < nums.length; j++) {
        // for (int k = j + 1; k < nums.length; k++) {
        // if (nums[i] + nums[j] + nums[k] == 0) {
        // Integer[] arr = { nums[i], nums[j], nums[k] };
        // Arrays.sort(arr);
        // List<Integer> triplet = Arrays.asList(arr);
        // result.add(triplet);
        // }
        // }
        // }
        // }

    }
}
