// Program to print the numbers from 1 to n

import java.util.Scanner;

public class PrintReverse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = s.nextInt();
        print(n,1);
    }

    public static void print(int n, int m){
        if(n+1 <= m) return;
        System.out.println(m+" ");
        print(n, m+1);
    }
}
