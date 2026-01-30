//Move all zeroes to the left
import java.util.*;
public class ZerosAtStart
{
    public static void main(String[] args) {
        int[] arr={1,2,0,0,0,4,0,1,0,5,0};
        //0,0,0,0,0,0,1,2,4,1,5
        int i=arr.length-1,j=arr.length-1;
        while(i>=0 && j>=0){
            if(arr[i]==0){
                i--;
            }
            else if(arr[i]!=0 && arr[j]!=0){
                i--;j--;
            }
            else{
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}