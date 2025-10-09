package practice.BasicHashing;
import java.util.*;
public class HighestOccuringElementinArray {
	//Highest Occurring Element in an Array
	//Given an array nums of n integers, 
	//find the most frequent element in it 
	//i.e., the element that occurs the maximum number of times. 
	//If there are multiple elements that appear a maximum number of times, 
	//find the smallest of them.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of the input array");
		int n = scan.nextInt();
		int[] nums = new int[n];
		for(int i = 0;i<n;i++) {
			System.out.println("Give the "+(i+1)+"th element in array");
			nums[i]=scan.nextInt();
		}
		System.out.println(bruteForce(nums));
	}
	public static int bruteForce(int[] nums) {
		Arrays.sort(nums);
		List<List<Integer>> list = new ArrayList<>();
		int result = 0;
		Set<Integer> contain = new HashSet<>();
		int max = Integer.MIN_VALUE;
		for(int i=0;i<nums.length;i++) {
			int count = 1;
			if(!contain.contains(nums[i])) {
				contain.add(nums[i]);
				for(int j = i+1;j<nums.length;j++) {
					if(nums[i]==nums[j]) {
						count=count+1;
					}
				}
				list.add(Arrays.asList(nums[i],count));
			}
		}
		
		
		for(List<Integer>pair : list) {
			int number = pair.get(0);
			int freq = pair.get(1);
			if(freq>max) {
				max = freq;
				result = number;
			}
		}
		return result;
	}
}
