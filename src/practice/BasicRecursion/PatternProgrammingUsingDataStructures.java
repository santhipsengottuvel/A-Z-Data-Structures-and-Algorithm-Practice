package practice.BasicRecursion;
import java.util.*;

public class PatternProgrammingUsingDataStructures {
	public static void main(String[] args) {
		int n = 5;
		List<List<String>> pattern1 = pattern1(5);
		List<List<String>> pattern2 = pattern2(5);
		List<List<String>> pattern3 = pattern3(5);
		List<List<String>> pattern4 = pattern4(5);
		System.out.println("Pattern 1");
		System.out.println();
		for(int i=0;i<n;i++) {
			System.out.println(pattern1.get(i));
		}
		System.out.println();
		System.out.println("___________________________");
		System.out.println();
		System.out.println("Pattern 2");
		System.out.println();
		for(int i=0;i<n;i++) {
			System.out.println(pattern2.get(i));
		}
		System.out.println();
		System.out.println("___________________________");
		System.out.println();
		System.out.println("Pattern 3");
		System.out.println();
		for(int i=0;i<n;i++) {
			System.out.println(pattern3.get(i));
		}
		System.out.println();
		System.out.println("___________________________");
		System.out.println();
		System.out.println("Pattern 4");
		System.out.println();
		for(int i=0;i<n;i++) {
			System.out.println(pattern4.get(i));
		}
		
	}
	public static List<String> printStars(int n){
		if(n==0) {
			return new ArrayList<>();
		} else {
			List<String> row = printStars(n-1);
			row.add("*");
			return row;
		}
	}
	public static List<String> printSpaces(int n){
		if(n==0) {
			return new ArrayList<>();
		} else {
			List<String> row = printSpaces(n-1);
			row.add(" ");
			return row;
		}
	}
	public static List<List<String>> pattern1(int n){
		if(n==0) {
			return new ArrayList<>();
		} else {
			List<List<String>> smallerPattern = pattern1(n-1);
			List<String> row = printStars(n);
			smallerPattern.add(row);
			return smallerPattern;
		}
	}
	public static List<List<String>> pattern2(int n){
		if(n==0) {
			return new ArrayList<>();
		} else {
			List<String> row = printStars(n);
			List<List<String>> smallerPattern = pattern2(n-1);
			List<List<String>> fullPattern = new ArrayList<>();
			fullPattern.add(row);
			fullPattern.addAll(smallerPattern);
			return fullPattern;
		}
	}
	public static List<List<String>> pattern3(int n){
		return upperPyramid(n,1);
	}
	public static List<List<String>> upperPyramid(int n, int row){
		if(row>n) {
			return new ArrayList<>();
		} else {
			List<String>spaces = printSpaces(n-row);
			List<String>stars = printStars((2*row)-1);
			List<String>fullRow = new ArrayList<>();
			fullRow.addAll(spaces);
			fullRow.addAll(stars);
			List<List<String>> smallerPattern = upperPyramid(n,row+1);
			List<List<String>> fullPattern = new ArrayList<>();
			fullPattern.add(fullRow);
			fullPattern.addAll(smallerPattern);
			return fullPattern;
		}
	}
	public static List<List<String>> pattern4(int n){
		return lowerPyramid(n,1);
	}
	public static List<List<String>>lowerPyramid(int n, int row){
		if(row>n) {
			return new ArrayList<>();
		} else {
			List<String>spaces = printSpaces(n-row);
			List<String>stars = printStars((2*row)-1);
			List<String>fullRow = new ArrayList<>();
			fullRow.addAll(spaces);
			fullRow.addAll(stars);
			List<List<String>>fullPattern = lowerPyramid(n,row+1);
			fullPattern.add(fullRow);
			return fullPattern;
		}
	}
}
