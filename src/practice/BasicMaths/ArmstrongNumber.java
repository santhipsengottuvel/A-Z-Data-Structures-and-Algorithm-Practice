package practice.BasicMaths;
import java.util.*;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Give me a number i will say you it was armstrong number or not");
		int n = sc.nextInt();
		System.out.println(n==armStrong(n));
		System.out.println("============================");
		sc.close();
	}
	public static int armStrong(int n) {
		int arm = 0;
		while(n>0) {
			int mod = (int)Math.pow(n%10,3);
			arm+=mod;
			n/=10;
		}
		return arm;
	}
}
