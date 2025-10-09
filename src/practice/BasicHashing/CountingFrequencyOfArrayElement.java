package practice.BasicHashing;
import java.util.*;


public class CountingFrequencyOfArrayElement {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Give the length of array");
		int n = scan.nextInt();
		int[] nums = new int[n];
		for(int i = 0;i<n;i++) {
			System.out.println("Give the "+(i+1)+"th element in array");
			nums[i]=scan.nextInt();
		}
		System.out.println(bruteForce(nums));
		System.out.println((better(nums)));
		System.out.println(optimized(nums));
		System.out.println(recursive(nums));
		scan.close();
	}
	
	public static List<List<Integer>> bruteForce(int[] nums){
		List<Integer> elements = new ArrayList<>();
		List<List<Integer>> result = new ArrayList<>();
		for(int i=0;i<nums.length;i++) {
			if(elements.contains(nums[i])) {
				continue;
			} else {
				elements.add(nums[i]);
				int count = 1;
				for(int j=i+1;j<nums.length;j++) {
					if(nums[i]==nums[j]) {
						count = count+1;
					}
				}
				result.add(Arrays.asList(nums[i],count));
			}
		}
		return result;
	}
	
	public static List<List<Integer>> better(int[] nums){
		List<List<Integer>> result = new ArrayList<>();
		int max = Integer.MIN_VALUE;
		for(int i=0;i<nums.length;i++) {
			max = Math.max(max, nums[i]);
		}
		int[] hash = new int[max+1];
		for(int i=0;i<nums.length;i++) {
			hash[nums[i]]++;  
		}
		for(int i=0;i<=max;i++) {
			if(hash[i]!=0) {
				result.add(Arrays.asList(i,hash[i]));
			}
		}
		return result;
	}
	
	public static List<List<Integer>> optimized(int[] nums){
		List<List<Integer>> result = new ArrayList<>();
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<nums.length;i++) {
			map.put(nums[i],map.getOrDefault(nums[i], 0)+1);
		}
		for(Map.Entry<Integer,Integer>entry : map.entrySet()) {
			result.add(Arrays.asList(entry.getKey(),entry.getValue()));
		}
		return result;
	}
	
	public static List<List<Integer>> recursive(int[] nums){
		return printFrequencies(nums,0,new HashSet<Integer>());
	}
	
	public static List<List<Integer>> printFrequencies(int[] nums, int index, Set<Integer>seen){
		
		if(index>=nums.length) {
			return new ArrayList<>();
		}
		int current = nums[index];
		
		
		if(seen.contains(current)) {
			return printFrequencies(nums,index+1,seen);
		} else {
			seen.add(current);
			int count = countFrequency(nums,0,current);
			List<List<Integer>> result = new ArrayList<>();
			result.add(Arrays.asList(current,count));
			List<List<Integer>> rest = printFrequencies(nums,index+1,seen);
			result.addAll(rest);
			return result;
		}
		
	}
	
	public static int countFrequency(int[] nums, int index, int target) {
		if(index>=nums.length) {
			return 0;
		} else {
			int count = nums[index]==target ? 1:0;
			return count + countFrequency(nums,index+1,target);
		}
	}
}
	
