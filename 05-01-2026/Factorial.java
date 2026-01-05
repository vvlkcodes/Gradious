// Find the factorial of the given number through recursion

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number to find it's factorial: ");
        int n = s.nextInt();
        int res = fact(n);
        System.out.println(res);
    }

    public static int fact(int n){
        if(n == 0 || n == 1) return 1;
        return n*fact(n-1);
    }
}
