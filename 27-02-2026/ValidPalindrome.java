import java.util.*;

public class ValidPalindrome {
    public static void main(String[] args) {
        boolean h = isPalindrome("a man, a plan, a canal, Panama");
        System.out.println(h);
    }

    public static boolean isPalindrome(String s){
        String str = s.toLowerCase();
        String res = "";
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if((ch >= 97 && ch <= 122) || (ch <= 90 && ch >= 65)){
                res += ch;
            }
        }
        int l = 0;
        int r = res.length()-1;
        while(l <= r){
            if(res.charAt(l) != res.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
