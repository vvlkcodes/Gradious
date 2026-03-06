// Optimal

// input : int[] arr = {4,8,2,1,7,8,6};
// output : 8876421

import java.util.*;
public class Sorting2{
    public static void main(String...args){
        int[] arr = {4,8,2,1,7,8,6};
        System.out.println(Arrays.toString(arr));
        int[] freq = new int[10];
        int m = 0;
        
        // count the frequency of each number 
        for(int i : arr) freq[i]++;

        // keep on adding the number until it's frequency becomes zero
        // do it from the last (9->0) to ensure that the number is in descending order
        for(int i=9;i>=0;i--){
            while(freq[i]-- > 0) m = m*10+i;
        }

        System.out.println(m);
    }
}