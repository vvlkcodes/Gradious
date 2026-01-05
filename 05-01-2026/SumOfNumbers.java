// Sum of the N natural numbers using recursion

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = s.nextInt();
        int sum = add(n);
        System.out.println(sum);
    }

    static int add(int n){
        if(n == 0 || n < 0) return 0;
        return add(n-1)+n;
    }
}
