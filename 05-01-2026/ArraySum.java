// Finding the Array sum using the Recursion

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        System.out.println("Original Array: ");
        System.out.println(Arrays.toString(arr));
        int res = add(arr, n,0, 0);
        System.out.println("Sum of the array: ");
        System.out.println(res);
    }

    public static int add(int[] arr,int n, int i, int sum){
        if(i == n) return sum;
        return add(arr, n, i+1, arr[i]+sum);
    }
}
