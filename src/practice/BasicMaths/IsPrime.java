package practice.BasicMaths;
import java.util.*;
public class IsPrime {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Give me a number i will say it prime or not");
		int n = scan.nextInt();
		System.out.println(bruteForce(n));
		System.out.println(optimized(n));
		scan.close();
	}
	public static boolean bruteForce(int n) {
		int count = 0;
		if(n<=1) {
			return false;
		}
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		return count==2;
	}
	public static boolean optimized(int n) {
		if(n==2||n==3) {
			return true;
		}
		if(n<=1 || n%2==0) {
			return false;
		}
		for(int i=3;i*i<=n;i+=2) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
}
