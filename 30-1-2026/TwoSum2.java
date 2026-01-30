// Return an array of size 2 representing the elements that sum up to be the target from the given array

import java.util.Arrays;

public class TwoSum2 {
    public static void main(String[] args) {
        int[] arr = {2,5,6,7,8,9,8,7,6};
        int target = 17;
        System.out.println(Arrays.toString(arr));
        System.out.println("The elements of the given array that sum up to be "+target+" are: "+ Arrays.toString(findElements(arr, target)));
    }

    public static int[] findElements(int[] arr, int target){
        Arrays.sort(arr);
        int i = 0;
        int j = arr.length-1;

        while(i<j){
            int s = arr[i] + arr[j];
            if(s == target) return new int[] {arr[i], arr[j]};
            else if(s > target) j--;
            else i++;
        }

        return new int[] {-1, -1};
    }
}
