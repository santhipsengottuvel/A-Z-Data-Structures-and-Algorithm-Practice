package practice.BasicMaths;

import java.util.*;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Give me a number i will give a reversed number of it");
		int n = scan.nextInt();
		System.out.println("The reversed number of " + n + " is " + helper(n));
		scan.close();
	}
	public static int helper(int n) {
		int reverse = 0;
		while(n>0) {
			int mod = n%10;
			reverse = (reverse*10)+mod;
			n/=10;
		}
		return reverse;
	}
}
