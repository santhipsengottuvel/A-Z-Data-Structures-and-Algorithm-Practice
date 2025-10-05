package practice.BasicRecursion;

import java.util.Scanner;

public class CheckPalindrome {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		if (palindrome(s)) {
			System.out.println("Given String is palindrome");
		} else {
			System.out.println("Given String is not a palindrome");
		}
		scan.close();
	}
	public static boolean palindrome(String s) {
		return helper(s, 0, s.length()-1);
	}
	public static boolean helper(String s, int i, int j) {
		if(i>j) {
			return true;
		} else {
			if (s.charAt(i)!=s.charAt(j)) {
				return false;
			}
			return helper(s,++i,--j);
		}
	}
}
