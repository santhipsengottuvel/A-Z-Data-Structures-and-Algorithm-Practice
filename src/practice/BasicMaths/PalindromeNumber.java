package practice.BasicMaths;
import java.util.*;

public class PalindromeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Give me a number i will say it was a palindrome or not");
		int n = sc.nextInt();
		System.out.println(n==palindrome(n));
		sc.close();
	}

	public static int palindrome(int n) {
		int reversed = 0;
		while(n>0) {
			int mod = n%10;
			reversed = (reversed*10)+mod;
			n/=10;
		}
		return reversed;
	}
	
	
}
