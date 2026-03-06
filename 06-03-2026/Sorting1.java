// Brute Force

// input : int[] arr = {4,8,2,1,7,8,6};
// output : 8876421


import java.util.*;
public class Sorting1{
    public static void main(String...args){
        int[] arr = {4,8,2,1,7,8,6};
        System.out.println(Arrays.toString(arr));
        long m = 0;
        for(int i=0;i<arr.length;i++){
            int j;
            for(j=i+1;j<arr.length;j++){
                if(arr[i] > arr[j]){
                    swap(arr, i, j);
                }
            }
        }

        for(int i=arr.length-1;i>=0;i--){
            m = m*10 + arr[i];
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(m);
    }
    public static void swap(int[] arr, int i, int j){
        int r = arr[i];
        arr[i] = arr[j];
        arr[j] = r;
    }
}

// output : 8876421