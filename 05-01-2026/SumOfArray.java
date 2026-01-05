// Time complexity -> O(n)
// where n -> number of array elements
public class SumOfArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int s = 0;
        for(int i=0;i<arr.length;i++){
            s += arr[i];
        }
        System.out.println(s);
    }
}
