package practice.BasicRecursion;

public class PatternProgrammingDecomposition {
	public static void main(String[] args) {
		System.out.println("Pattern 1");
		System.out.println();
		pattern1(5);
		System.out.println();
		System.out.println("_________________________________________");
		System.out.println();
		System.out.println("Pattern 2");
		System.out.println();
		pattern2(5);
		System.out.println();
		System.out.println("_________________________________________");
		System.out.println();
		System.out.println("Pattern 3");
		System.out.println();
		pattern3(5);
		System.out.println();
		System.out.println("_________________________________________");
		System.out.println();
		System.out.println("Pattern 4");
		System.out.println();
		pattern4(5);
		System.out.println();
		System.out.println("_________________________________________");
		System.out.println();
		System.out.println("Pattern 5");
		System.out.println();
		pattern5(5);
		
	}

	public static void printStars(int n) {
		if(n<=0) {
			return ;
		}
		System.out.print("*");
		printStars(n-1);
	}
	
	public static void printStarsWithSpaces(int n) {
		if(n<=0) {
			return;
		}
		System.out.print("* ");
		printStarsWithSpaces(n-1);
	}
	
	public static void printSpaces(int n) {
		if(n<=0) {
			return;
		}
		System.out.print(" ");
		printSpaces(n-1);
	}
	
	public static void pattern1(int n) {
		if(n==0) {
			return;
		}
		pattern1(n-1);
		printStarsWithSpaces(n);
		System.out.println();
	}
	
	public static void pattern2(int n) {
		if(n==0) {
			return;
		}
		printStarsWithSpaces(n);
		System.out.println();
		pattern2(n-1);
	}
	
	public static void pattern3(int n) {
		pattern3Helper(n,n);
	}
	public static void pattern3Helper(int currentRow, int totalRows) {
		if(currentRow<=0) {
			return;
		}
		
		printSpaces(currentRow-1);
		printStarsWithSpaces(totalRows-currentRow+1);
		System.out.println();
		pattern3Helper(currentRow-1,totalRows);
	}
	public static void pattern4(int n) {
		pattern4Helper(n,n);
	}
	
	public static void pattern4Helper(int currentRow, int totalRows) {
		if(currentRow<=0) {
			return;
		}
		pattern4Helper(currentRow-1,totalRows);
		printSpaces(currentRow-1);
		printStarsWithSpaces(totalRows-currentRow+1);
		System.out.println();
		
	}
	public static void pattern5(int n) {
		upperPyramid(n,1);
		lowerPyramid(n,1);
	}
	
	public static void upperPyramid(int n, int rows) {
		if(n<rows) {
			return;
		} else {
			printSpaces(n-rows);
			printStarsWithSpaces(rows);
			System.out.println();
			upperPyramid(n,rows+1);
		}
	}
	public static void lowerPyramid(int n, int rows) {
		if(n<rows) {
			return;
		} else {
			lowerPyramid(n,rows+1);
			printSpaces(n-rows);
			printStarsWithSpaces(rows);
			System.out.println();
		}
	}
	
}
