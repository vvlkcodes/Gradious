// Return an array that gives two integers that gives us the values which add up to get the target element
// Two pointer approach

import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {20, 1, 7, 5, 3};
        int target = 8;
        System.out.println(Arrays.toString(twoSum(arr, target)));
    }

    public static int[] twoSum(int[] arr, int target) {
        Arrays.sort(arr);

        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            int sum = arr[i] + arr[j];

            if (sum == target) {
                return new int[]{arr[i], arr[j]};
            } else if (sum > target) {
                j--;
            } else {
                i++;
            }
        }
        return new int[]{-1, -1};
    }
}
