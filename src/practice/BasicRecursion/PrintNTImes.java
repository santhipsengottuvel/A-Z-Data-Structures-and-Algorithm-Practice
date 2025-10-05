package practice.BasicRecursion;

public class PrintNTImes {
	public static void main(String[] args) {
		nTimes(1);
		reverseNtimes(1);
	}
	public static int nTimes(int n) {
		if(n>10) {
			return n;
		}
		else {
			System.out.println(n);
			return nTimes(n+1);
		}
	}
	public static void reverseNtimes(int n) {
		if(n==10) {
			System.out.println(n);
		} else {
			reverseNtimes(n+1);
			System.out.println(n);
		}
	}
}
