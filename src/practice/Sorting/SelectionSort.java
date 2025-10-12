package practice.Sorting;
import java.util.*;
public class SelectionSort {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] nums = new int[n];
		for(int i=0;i<n;i++) {
			nums[i]=scan.nextInt();
		}
		selectionSort(nums);
		System.out.println(Arrays.toString(nums));
		scan.close();
	}
	public static void selectionSort(int[] nums) {
		for(int i=0;i<nums.length-1;i++) {
			int maxIndex = i;
			for(int j=i+1;j<nums.length;j++) {
				if(nums[j]>nums[maxIndex]) {
					maxIndex = j;
				}
			}
			int temp = nums[i];
			nums[i]=nums[maxIndex];
			nums[maxIndex]=temp;
		}
	}

}
