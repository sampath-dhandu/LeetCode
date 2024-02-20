/**
 * 
 */
package practise;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author sampathdhand
 *
 */
public class TwoSum {

	/**
	 * @param args
	 * 
	 * 
	 *             Example 1:
	 * 
	 *             Input: nums = [2,7,11,15], target = 9 Output: [0,1] Explanation:
	 *             Because nums[0] + nums[1] == 9, we return [0, 1]. Example 2:
	 * 
	 *             Input: nums = [3,2,4], target = 6 Output: [1,2] Example 3:
	 * 
	 *             Input: nums = [3,3], target = 6 Output: [0,1]
	 * 
	 * 
	 *             Constraints:
	 * 
	 *             2 <= nums.length <= 104 -109 <= nums[i] <= 109 -109 <= target <=
	 *             109 Only one valid answer exists.
	 */

	public static void main(String[] args) {
		TwoSum sum = new TwoSum();
		int[] arr = { 2, 2, 4, 7 };
		// System.out.println(sum.twoSum(arr, 9));
		int newarr[] = sum.targetSumWithMap(arr, 9);
		System.out.println(Arrays.toString(newarr));
	}

	public int[] twoSumBrute(int[] nums, int target) {
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target)
					return new int[] { i, j };
			}
		}
		return new int[] { -1, -1 };
	}

	public int[] targetSumSortedArray(int[] a, int target) {
		int left = 0, right = a.length - 1, tempSum;
		while (left < right) {
			tempSum = a[left] + a[right];
			if (tempSum == target)
				return new int[] { left , right  };
			if (tempSum > target)
				right--;
			else
				left++;
		}

		return new int[] { -1, -1 };
	}
	
	
	public int[] targetSumWithMap(int[] a, int target) {
		
		Map<Integer, Integer> sumMap = new HashMap<Integer,Integer>();
		
		for(int i = 0; i < a.length ;i++)
		{
			int temp = target - a[i];
			if(sumMap.containsKey(temp)) {
				return new int [] {sumMap.get(temp), i};
			}else {
				sumMap.put(a[i], i);
			}
			
		}
		
		return new int []{};
	}
}
