package practice.BasicRecursion;

import java.util.Scanner;

public class FibonacciNumbers {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println(fiboMain(n));
		System.out.println(fiboOptimal(n));
		scan.close();
	}
	public static int fiboMain(int n) {
		if(n==0 ||n==1) {
			return n;
		}
		return fiboMain(n-1)+fiboMain(n-2);
	}
	
	public static int fiboOptimal(int n) {
		return helper(0,1,n);
	}
	public static int helper(int a, int b, int n) {
		if(n==0) {
			return a;
		}
		if(n==1) {
			return b;
		} else {
			return helper(b,a+b,n-1);
		}
	}
}
