import java.util.HashMap;

public class LongestSS {
    public static void main(String[] args) {
        String str = "pwwkew";
        System.out.println(str);

        System.out.println(maxLen(str));

    }

    public static int maxLen(String str){
        HashMap<Character, Integer> map = new HashMap<>();
        int i = 0;
        int j = 0;
        int max = 0;
        while(j<str.length()){
            char ch = str.charAt(j);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            }else{
                map.put(ch, 1);
            }

            while(map.get(ch) > 1){
                char c = str.charAt(i);
                map.put(c, map.get(c)-1);
                i++;
                max = Math.max(max, j-i+1);
            }

            j++;
        }

        return max;
    }
}
