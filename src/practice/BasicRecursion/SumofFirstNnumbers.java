package practice.BasicRecursion;

import java.util.Scanner;

public class SumofFirstNnumbers {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println(sumOfFirstNnumbers(n,0,1));
		scan.close();
		
	}
	public static int sumOfFirstNnumbers(int n, int sum, int count) {
		if(n<count) {
			return sum;
		}
		return sumOfFirstNnumbers(n,sum+count,++count);
	}
}
