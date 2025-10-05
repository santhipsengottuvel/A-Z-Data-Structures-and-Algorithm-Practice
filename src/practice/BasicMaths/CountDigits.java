package practice.BasicMaths;
import java.util.*;

public class CountDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Give me a number and i will say how many digits in it");
		int n = sc.nextInt();
		System.out.println("Iterative Answer : " + iterative(n));
		System.out.println("Formulated Answer : " + formula(n));
		sc.close();
	}
	public static int iterative(int n) {
		int count = 0;
		while(n>0) {
			count++;
			n/=10;
		}
		return count;
	}
	public static int formula(int n) {
		return (int)(Math.log10(n)+1);
	}
}
