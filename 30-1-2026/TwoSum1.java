// check if the array contains any two elements that give the added sum equals to that of the target

import java.util.Arrays;

public class TwoSum1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,2,3,4,2};
        int target = 8;

        System.out.println(Arrays.toString(arr));
        System.out.println("The above array has the two elements that sum up to be "+target+": "+checkTwoElements(arr, target));
    }

    public static boolean checkTwoElements(int[] arr, int target){
        int l = 0;
        int r = arr.length-1;
        Arrays.sort(arr);
        while(l<r){
            int sum = arr[l]+arr[r];
            if(sum == target) return true;
            else if (sum > target) r--;
            else l++;
        }

        return false;
    }
}
