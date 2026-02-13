// you are given a fixed size of the subarray and you need to tell the max sum of the subarray with the given size from the given array
// Sliding window approach

public class MaxSubArrSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 10, 6, 3, 1, 3, 4};
        int winSize = 3;
        System.out.println(maxSum(arr, winSize));
    }

    public static int maxSum(int[] arr, int winSize){
        int i = 0;
        int j = 0;
        int winSum = 0;
        int max = Integer.MIN_VALUE;
        while(i<arr.length-winSize-1){
            winSum += arr[j];
            j++;
            if((j-i+1) > winSize){
                max = Math.max(max, winSum);
                winSum -= arr[i];
                i++;
            }
        }

        return max;
    }
}
