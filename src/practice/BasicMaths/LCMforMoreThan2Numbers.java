package practice.BasicMaths;

import java.util.Scanner;

public class LCMforMoreThan2Numbers {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] nums = new int [n];
		for(int i=1;i<n;i++) {
			System.out.println("Give me the " + (i+1) + "th number");
			nums[i]=scan.nextInt();
		}
		scan.close();
	}
	public static int bruteforce(int[] nums) {
		int max = nums[0];
		for(int i=1;i<nums.length;i++) {
			max = Math.max(max, nums[i]);
		}
		int lcm = max;
		while(true) {
			boolean check = true;
			for(int num : nums) {
				if(lcm % num!=0) {
					check = false;
					break;
				}
			}
			if(check) {
				return lcm;
			}
			lcm++;
		}
	}
}
