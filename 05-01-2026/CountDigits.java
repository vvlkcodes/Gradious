// To find the count of digits of the given number using recursion

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = s.nextInt();
        int res = count(n, 0);
        System.out.println(res);
    }

    public static int count(int n, int c){
        if(n == 0) return c;
        return count(n/10, c+1);
    }
}
