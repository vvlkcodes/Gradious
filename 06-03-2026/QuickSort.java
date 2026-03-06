// Sorting using the Quick Sort

import java.util.*;

class QuickSort{
    public static void main(String[] args) {
        int[] arr = {186,4531,34,989873,2};
        System.out.println(Arrays.toString(arr));
        QuickS(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void QuickS(int[] arr, int l, int h){
        if(l < h){
            int p = partition(arr, l, h);

            QuickS(arr, l, p-1);
            QuickS(arr, p+1, h);
        }
    }

    public static int partition(int[] arr , int l, int h){
        int p = arr[h];
        int i = l-1;

        for(int j=l;j<h-1;j++){
            if(arr[j] < p){
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i+1, h);

        return i+1;
    }

    public static void swap(int[] arr, int i, int j){
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}