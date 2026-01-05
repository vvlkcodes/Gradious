// To Print the Nth fibonacci number with the help of recursion

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = s.nextInt();
        int res = fib(n);
        System.out.println(res);
//        for(int i=0;i<10;i++){
//            System.out.print(fib(i)+" ");
//        }
    }

    public static int fib(int n){
        if(n == 0) return 0;
        else if(n == 1) return 1;
        return fib(n-1)+fib(n-2);
    }
}
