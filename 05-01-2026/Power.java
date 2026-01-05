// Finding pow(n,x) using recursion

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the base: ");
        int n = s.nextInt();
        System.out.println("Enter the power: ");
        int x = s.nextInt();
        int res = pow(1, n, x);
        System.out.println(res);
        int res1 = pow1(n , x);
        System.out.println(res1);
    }
    // Method 1
    public static int pow(int prod, int n, int x){
        if(x == 0) return prod;
        return pow(prod*n, n, x-1);
    }
    // Method 2
    public static int pow1(int n, int x){
        if(x == 0) return 1;
        return n*pow1(n, x-1);
    }
}
