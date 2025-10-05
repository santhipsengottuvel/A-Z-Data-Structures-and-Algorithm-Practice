package practice.BasicRecursion;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseAnArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(reverseArray(arr, 0, arr.length-1)));
		scan.close();
	}
	public static int[] reverseArray(int[] nums, int i, int j) {
		if(i>j) {
			return nums;
		} else {
			int temp = nums[i];
			nums[i] = nums[j];
			nums[j] = temp;
			return reverseArray(nums,++i,--j);
		}
	}
}
