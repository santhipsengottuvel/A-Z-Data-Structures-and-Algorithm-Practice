package practice.BasicMaths;
import java.util.*;
public class LCMfor2Numbers {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Give me two numbers i will give LCM for two numbers");
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		System.out.println("Brute force : " + bruteforce(n1,n2));
		System.out.println("Optimized using euclidean algo: " + optimized(n1,n2));
		scan.close();
	}
	public static int bruteforce(int n1, int n2) {
		// Time Complexity O(n1*n2)
		int lcm = Math.max(n1, n2);
		while(true) {
			if(lcm%n1==0 && lcm%n2==0) {
				return lcm;
			}
			lcm++;
		}
	}
	
	public static int optimized(int n1, int n2) {
		return n1*n2/gcd(n1,n2);
	}
	static int gcd(int n1, int n2) {
		while(n1>0 && n2>0) {
			if(n1>n2) {
				n1 = n1%n2;
			} else {
				n2 = n2%n1;
			}
		}
		return n1==0 ? n2:n1;
	}
}
