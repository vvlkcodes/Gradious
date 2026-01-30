// Use two pointer approach to reverse an array

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {3,1,2,4,5,4,3,2,1};
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void reverse(int[] arr){
        int l=0;
        int r = arr.length-1;
        while(l<r){
            int t = arr[l];
            arr[l] = arr[r];
            arr[r] = t;
            l++;
            r--;
        }
    }
}
