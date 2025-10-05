package practice.BasicMaths;
import java.util.*;
public class PrintPrime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Give me a number I shall print all the prime number present within it");
		int n = sc.nextInt();
		bruteforce(n);
		System.out.println();
		optimized(n);
		sc.close();
	}
	public static void bruteforce(int n) {
		//For each number from 2 to n, it calls isPrime(i).
		//isPrime checks divisibility up to √n (skipping evens).
		//Time complexity: O(n√n).
		
		for(int i=2;i<=n;i++) {
			if(isPrime(i)) {
				System.out.print(i+" ");
			}
		}
	}
	static boolean isPrime(int n) {
		if(n<=1) {
			return false;
		}
		if(n==2 || n==3) {
			return true;
		}
		if(n%2==0) {
			return false;
		}
		
		for(int i=3;i*i<=n;i+=2) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	public static void optimized(int n) {
		//Implements the Sieve of Eratosthenes.
		//Uses a boolean array to mark multiples of primes.
		//Finally prints numbers not marked as composite.
		//Time complexity: O(n log log n), much faster for large n
		
		boolean[] prime = new boolean[n+1];
		for(int i=2;i*i<=n;i++) {
			if(!prime[i]) {
				for(int j=i*i;j<=n;j+=i) {
					prime[j]=true;
				}
			}
		}
		for(int i=2;i<=n;i++) {
			if(!prime[i]) {
				System.out.print(i + " ");
			}
		}
	}
}
