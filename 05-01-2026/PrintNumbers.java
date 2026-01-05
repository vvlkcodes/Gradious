// Print the natural numbers from n to 1 using the recursion

import java.util.Scanner;
public class PrintNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = s.nextInt();
        print(n);
    }
    static void print(int n){
        if(n == 0) return;
        System.out.print(n+" ");
        print(n-1);
    }
}
