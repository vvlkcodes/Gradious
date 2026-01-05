// Sum of the digits of the given number

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = s.nextInt();
        int res = add(n, 0);
        System.out.println(res);
    }

    public static int add(int n, int c){
        if(n == 0) return c;
        return add(n/10, c+(n%10));
    }
}
