import java.util.ArrayList;
import java.util.List;

public class MissingNumber {
    static int[] missingNumbers(int[] arr, int[] brr) {
        int[] freq = new int[10001];

        for (int x : brr) freq[x]++;
        for (int x : arr) freq[x]--;

        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < freq.length; i++)
            if (freq[i] > 0)
                res.add(i);

        return res.stream().mapToInt(i -> i).toArray();
    }
    
}
