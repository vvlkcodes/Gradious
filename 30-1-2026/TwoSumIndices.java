// Return the indices of the elements that give the sum as target

import java.util.*;

public class TwoSumIndices {
    public static void main(String[] args) {
        int[] arr = {20, 1, 7, 5, 6};
        int target = 8;

        System.out.println(Arrays.toString(twoSum(arr, target)));
    }

    public static int[] twoSum(int[] nums, int target) {

        // Step 1: Create 2D array -> {value, originalIndex}
        int[][] pairs = new int[nums.length][2];
        for (int i = 0; i < nums.length; i++) {
            pairs[i][0] = nums[i];
            pairs[i][1] = i;
        }

        // Step 2: Sort using Comparator (by value)
        Arrays.sort(pairs, Comparator.comparingInt(a -> a[0]));
        System.out.println(Arrays.deepToString(pairs));
        // Step 3: Two pointer approach
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int sum = pairs[left][0] + pairs[right][0];

            if (sum == target) {
                // return ORIGINAL indices
                return new int[]{pairs[left][1], pairs[right][1]};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[]{-1, -1};
    }
}
