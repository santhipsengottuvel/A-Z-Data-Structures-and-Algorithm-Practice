package practice.BasicMaths;
import java.util.*;
public class CountDigitsThatDeviseEvenly {
//Given a positive integer n, 
//count the number of digits in n that divide n evenly 
//(i.e., without leaving a remainder). 
//Return the total number of such digits.

//A digit d of n divides n evenly if the remainder when n is divided by d is 0 (n % d == 0).
//Digits of n should be checked individually. If a digit is 0, 
//it should be ignored because division by 0 is undefined.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Give me a number, i shall count the digits of the number that divide that number evenly");
		int n = scan.nextInt();
		System.out.println(n);
		scan.close();
	}
	public static int solution(int n) {
		int sample = n;
		int count = 0;
		while(sample>0) {
			int mod = sample%10;
			if(mod!=0 && (n%mod==0)) {
				count++;
			}
			sample/=10;
		}
		return count;
	}
}
