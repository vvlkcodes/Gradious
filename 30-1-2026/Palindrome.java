// Check if an array is palindrome through the two pointer approach

import java.util.Arrays;

public class Palindrome {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,3,3,2,1,1,1};
        System.out.println(Arrays.toString(arr));

        System.out.println("Is the above given array a palindrome? "+checkPalindrome(arr));
    }

    public static boolean checkPalindrome(int[] arr){
        int l = 0;
        int r = arr.length-1;

        while(l<r){
            if(arr[l] != arr[r]) return false;
            l++;
            r--;
        }

        return true;
    }
}
