// Count the total number of even values in the given element digits

public class CountOfEven{
    public static void main(String...args){
        int[] arr = {186,4531,34,989873,2};
        int e = 0;
        for(int x : arr){
            e += count(x);
        }
        System.out.println(e);
    }

    public static int count(int n){
        int c = 0;
        while(n != 0){
            int r = n % 10;
            if(r % 2 == 0) c++;
            n /= 10; 
        }
        return c;
    }
}

// As per the chatgpt that i've researched 
// the above algorithm comes with O(n) time complexity 