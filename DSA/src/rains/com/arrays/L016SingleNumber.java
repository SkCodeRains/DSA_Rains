package rains.com.arrays;

import java.util.HashMap;
import java.util.Map;

public class L016SingleNumber {
	public static void main(String[] args) {
		int[] nums = { 2, 1, 2, 1, 5 };
		int num = singleNumber(nums);
		System.out.println(num);
	}

	private static int singleNumber(int[] nums) {
		
		// best one if input containing only twice if number exceeded more than twice
		// then its not required below one is more powerfull
		int size = nums.length;
		int answer = 0;
		for (int i = 0; i < size; i++) {
			answer ^= nums[i];
		}
		return answer;
//		Map<Integer, Integer> numMap = new HashMap<>();
//		int sum = 0;
//		for (int i = 0; i < nums.length; i++) {
//			if (numMap.containsKey(nums[i])) {
//				sum -= nums[i];
//			} else {
//				sum += nums[i];
//			}
//			numMap.put(nums[i], i);
//		}
//
//		return sum;
	}
}
