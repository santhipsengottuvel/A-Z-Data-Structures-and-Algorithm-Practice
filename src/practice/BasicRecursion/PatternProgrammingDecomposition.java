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
		System.out.println();
		System.out.println("_________________________________________");
		System.out.println();
		System.out.println("Pattern 6");
		System.out.println();
		pattern6(5);
		System.out.println();
		System.out.println("_________________________________________");
		System.out.println();
		System.out.println("Pattern 7");
		System.out.println();
		pattern7(5);
		System.out.println();
		System.out.println("_________________________________________");
		System.out.println();
		System.out.println("Pattern 8");
		System.out.println();
		pattern8(5);
		System.out.println();
		System.out.println("_________________________________________");
		System.out.println();
		System.out.println("Pattern 9");
		System.out.println();
		pattern9(5);
		System.out.println();
		System.out.println("_________________________________________");
		System.out.println();
		System.out.println("Pattern 10");
		System.out.println();
		pattern10(5);
		System.out.println();
		System.out.println("_________________________________________");
		System.out.println();
		System.out.println("Pattern 11");
		System.out.println();
		pattern11(5);
		System.out.println();
		System.out.println("_________________________________________");
		System.out.println();
		System.out.println("Pattern 11");
		System.out.println();
		pattern12(5);
		
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
	public static void upperPyramid(int n, int rows) {
		if(n<rows) {
			return;
		} else {
			printSpaces(n-rows+1);
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
			printSpaces(n-rows+1);
			printStarsWithSpaces(rows);
			System.out.println();
		}
	}
	public static void oddUpperPyramid(int n, int rows) {
		if(n<rows) {
			return;
		} else {
			printSpaces(n-rows+1);
			printStars((2*rows)-1);
			System.out.println();
			oddUpperPyramid(n,rows+1);
		}
	}
	public static void oddLowerPyramid(int n, int rows) {
		if(n<rows) {
			return;
		} else {
			oddLowerPyramid(n,rows+1);
			printSpaces(n-rows+1);
			printStars((2*rows)-1);
			System.out.println();
		}
	}
	public static void rightAngledTriangle(int n) {
		if(n==0) {
			return;
		}
		rightAngledTriangle(n-1);
		printStarsWithSpaces(n);
		System.out.println();
	}
	public static void InvertedRightAngledTriangle(int n) {
		if(n==0) {
			return;
		}
		printStarsWithSpaces(n);
		System.out.println();
		InvertedRightAngledTriangle(n-1);
	}
	
	
	
	
	
	
	public static void pattern1(int n) {
		rightAngledTriangle(n);
	}
	public static void pattern2(int n) {
		InvertedRightAngledTriangle(n);
	}
	public static void pattern3(int n) {
		upperPyramid(n,1);
	}
	public static void pattern4(int n) {
		lowerPyramid(n,1);
	}
	public static void pattern5(int n) {
		upperPyramid(n,1);
		lowerPyramid(n,1);
	}
	
	public static void pattern6(int n) {
		upperPyramid(n-1,1);
		printStarsWithSpaces(n);
		System.out.println();
		lowerPyramid(n-1,1);
	}
	public static void pattern7(int n) {
		oddUpperPyramid(n,1);
	}
	public static void pattern8(int n) {
		oddLowerPyramid(n,1);
	}
	public static void pattern9(int n) {
		oddUpperPyramid(n,1);
		oddLowerPyramid(n,1);
	}
	public static void pattern10(int n) {
		oddUpperPyramid(n-1,1);
		printStars((2*n)-1);
		System.out.println();
		oddLowerPyramid(n-1,1);
	}
	public static void pattern11(int n) {
		oddLowerPyramid(n,1);
		oddUpperPyramid(n,1);
	}
	public static void pattern12(int n) {
		oddLowerPyramid(n,1);
		if(n<=1) {
			return ;
		} else {
			oddUpperPyramid(n,2);
		}
	}
}
