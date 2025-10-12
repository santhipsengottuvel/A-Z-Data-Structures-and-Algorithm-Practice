package practice.Sorting;
import java.util.*;
public class BubbleSort {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] nums = new int[n];
		for(int i=0;i<n;i++) {
			nums[i]=scan.nextInt();
		}
		bubbleSort(nums);
		System.out.println(Arrays.toString(nums));
		scan.close();
	}
	public static void bubbleSort(int[] nums) {
		for(int i=0;i<nums.length-1;i++) {
			for(int j=0;j<nums.length-i-1;j++) {
				if(nums[j]>nums[j+1]) {
					int temp = nums[j];
					nums[j]= nums[j+1];
					nums[j+1]=temp;
				}
			}
		}
	}
	
}
