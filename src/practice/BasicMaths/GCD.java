package practice.BasicMaths;
import java.util.*;
public class GCD {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Give me two number, I will give GCD of it");
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		System.out.println(bruteforce(n1,n2));
		System.out.println(better(n1,n2));
		System.out.println(optimized(n1,n2));
		scan.close();
	}
	public static int bruteforce(int n1, int n2) {
	//Time complexity = O(min(n1,n2))
		int gcd = 1;
		for(int i=1;i<=Math.min(n1, n2);i++) {
			if(n1%i==0 && n2%i==0) {
				gcd = Math.max(gcd, i);
			}
		}
		return gcd;
	}
	public static int better(int n1,int n2) {
	//Time complexity = O(min(n1,n2))
		for(int i=Math.min(n1, n2);i>=1;i--) {
			if(n1%i==0 && n2%i==0) {
				return i;
			}
		}
		return 1;
	}
	public static int optimized(int n1,int n2) {
	// This optimized solution is calculated by Euclidean Algorithm
	//Time complexity = O(log(min(n1,n2)))
		while(n1>0 && n2>0) {
			if(n1>n2) {
				n1 = n1%n2;
			} else {
				n2 = n2%n1;
			}
		}
		return n1==0 ? n2 : n1;
	}
	
}
