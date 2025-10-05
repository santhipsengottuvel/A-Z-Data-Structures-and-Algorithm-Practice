package practice.BasicRecursion;

import java.util.Scanner;

public class FactorialOfNnumbers {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println(fact(n));
		scan.close();
	}
	public static int fact(int n) {
		if(n==1) {
			return n;
		}
		return n*fact(n-1);
	}
}
