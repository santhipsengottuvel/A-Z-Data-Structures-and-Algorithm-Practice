package practice.BasicRecursion;

import java.util.Scanner;

public class PrintNameForNtimes {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		printNames(n,0);
		scan.close();
	}
	public static void printNames(int n, int count) {
		if(count==n) {
			return;
		} else {
			System.out.println("Hemajai");
			printNames(n,++count);
		}
	}
}
