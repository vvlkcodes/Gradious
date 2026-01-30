// From the given array, return the indices of the 2 elements that sum up to be the target

/*
* 1. define a 2D array [2][2]
* 2. Use the first column to store the values
* 3. Use the second column to store the indices
* 4. Sort the first column (With the help of comparators) (check out yt or google for the uses of a comparator)
* 5. when values sum up to be target, return the indices
* 6. this increases the space complexity to decrease the time complexity
* */

import java.util.Arrays;
import java.util.Comparator;

public class TwoSum3 {
    public static void main(String[] args) {
        int[] arr = {4,5,6,9,8,7,6,2,3,4,5,6,7,8};
        int target = 16;
        System.out.println(Arrays.toString(arr));
        System.out.println("The indices that has the values which sum up to be "+target+" are: "+Arrays.toString(findIndices(arr, target)));
    }

    public static int[] findIndices(int[] arr, int target){

        Comp c = new Comp();
        int[][] pairs = new int[arr.length][2];
        for(int i=0;i<arr.length;i++){
            pairs[i][0] = arr[i];
            pairs[i][1] = i;
        }

        Arrays.sort(pairs, c);

        int i=0;
        int j=arr.length-1;

        while(i<j){
            int s = pairs[i][0] + pairs[j][0];
            if(s == target) return new int[]{pairs[i][1], pairs[j][1]};
            else if(s > target) j--;
            else i++;
        }

        return new int[]{-1, -1};
    }
}

class Comp implements Comparator<int[]>{
    @Override
    public int compare(int[] a, int[] b) {
        return a[0]-b[0];
    }
}

