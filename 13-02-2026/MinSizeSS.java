
public class MinSizeSS {
    public static void main(String[] args) {
        int target = 1;
        int[] arr = {2,3,1,2,4,3};

        System.out.println(minSubArrayLen(target, arr));
    }

    public static int minSubArrayLen(int target, int[] nums) {
       int n = nums.length;
       int i = 0;
       int j = 0;
       int sum = 0;
       int minLen = Integer.MAX_VALUE;

       while (j < n) {
           sum += nums[j];

           while (sum >= target) {
               minLen = Math.min(minLen, j - i + 1);
               sum -= nums[i];
               i++;
           }

           j++;
       }

       return minLen == Integer.MAX_VALUE ? 0 : minLen;
   }

}
