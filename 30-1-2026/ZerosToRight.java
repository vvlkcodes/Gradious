// Move all the zeros that are present in the given array to the left

import java.util.Arrays;

public class ZerosToRight {
    public static void main(String[] args) {
        int[] arr = {0,0,40,0,50,0,7,8,7,8,7,8,7,5,6,6};
        System.out.println(Arrays.toString(arr));
        toRight(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void toRight(int[] arr){
        int i = 0;
        int j = 1;
        while(j < arr.length && i < arr.length){
            if(arr[i] != 0) i++;
            if(arr[j] == 0) j++;
            if(arr[i] == 0 && arr[j] != 0){
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
                j++;
                i++;
            }
        }
    }
}
