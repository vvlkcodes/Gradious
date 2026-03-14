// Basic code for the operations of stack using arrays
// push
// pop
// peek
// print

import java.util.*;

public class Main
{
    static int t = -1;
	public static void main(String[] args) {
        int[] arr = new int[10];
        push(arr, 8);
        push(arr, 5);
        push(arr, 3);
        push(arr, 7);
        print(arr);
        peek(arr);
        pop(arr);
    	print(arr);
    	peek(arr);
	}
	
	static void push(int[] arr, int i){
	    if(t>arr.length){
	        System.out.println("The stack is full");
	        return;
	    }
	    System.out.println("The element "+i+" is pushed into the stack!");
	    arr[++t] = i;
	}
	
	static void pop(int[] arr){
	    if(t<=0){
	        System.out.println("The stack is empty");
	        return;
	    }
	    System.out.println("The element is "+arr[t]+" popped out!");
        --t;
	}
	
	static void print(int[] arr){
	    if(t<=0){
	        System.out.println("The stack is empty");
	        return;
	    }
	    System.out.println("The elements of the stack are: ");
	    for(int i=0;i<=t;i++){
	        System.out.print(arr[i]+" ");
	    }
	    System.out.println();
	}
	
	static void peek(int[] arr){
	    System.out.println("The peek element of the given array is: "+arr[t]);
	}
}
