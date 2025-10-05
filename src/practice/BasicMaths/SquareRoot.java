package practice.BasicMaths;

import java.util.*;

public class SquareRoot {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Give me a number I shall provide you the square root of it");
		int n = scan.nextInt();
		System.out.println(bruteforce(n));
		System.out.println(optimizedBinarySearch(n));
		System.out.println(optimizedRecursiveBinarySearch(n));
		System.out.println(optimizedNewtonRaphson(n));
		System.out.println(optimizedBinarySearchWithPrecision(n));
		scan.close();
	}
	public static int bruteforce(int n) {
		// ---------------------------------------------------------
	    // Brute Force Approach: O(sqrt(n))
	    // ---------------------------------------------------------
	    // Try all numbers from 1 up to n.
	    // The largest i such that i*i <= n is the integer square root.
		if (n < 0) {
			return -1;             // invalid input
		}
	    if (n == 0 || n == 1) {
	    	return n;              // sqrt(0)=0, sqrt(1)=1
	    }

		int sqrt = 0;
		for(int i=1;n/i>=i;i++) {
			sqrt = i;
		}
		return sqrt;
	}
	public static int optimizedBinarySearch(int n) {
		// ---------------------------------------------------------
	    // Iterative Binary Search: O(log n)
	    // ---------------------------------------------------------
	    // Search in range [1, n].
	    // At each step:
	    //   - If mid*mid == n → found exact sqrt.
	    //   - If mid*mid < n → move right (but store mid as a possible answer).
	    //   - If mid*mid > n → move left.
	    // ans always stores the "last known good" sqrt candidate.
		
		if (n < 0) {
			return -1;             // invalid input
		}
	    if (n == 0 || n == 1) {
	    	return n;              // sqrt(0)=0, sqrt(1)=1
	    }
	    
		int s = 1;
		int e = n;
		int ans = 0;
		while(s<=e) {
			int mid = s+(e-s)/2;
			if(n/mid==mid) {
				return mid;
			} else if (n/mid>mid) {
				ans = mid;
				s = mid + 1;
			} else {
				e = mid - 1;
			}
		}
		return ans;
	}
	public static int optimizedRecursiveBinarySearch(int n) {
		
		
		// ---------------------------------------------------------
	    // Recursive Binary Search: O(log n)
	    // ---------------------------------------------------------
	    // Same logic as iterative, but implemented recursively.
	    // Wrapper function hides the helper parameters.
		
		if (n < 0) {
			return -1;             // invalid input
		}
	    if (n == 0 || n == 1) {
	    	return n;              // sqrt(0)=0, sqrt(1)=1
	    }
	    
		return helper(1,n,0,n);
	}
	static int helper(int s, int e, int m, int n) {
		
		if(s>e) {
			return m;
		}
		int mid = s+(e-s)/2;
		if(n/mid==mid) {
			return mid;
		} else if (n/mid>mid) {
			return helper(mid+1,e,mid, n);
		} else {
			return helper(s,mid-1,m, n);
		}
	}
	public static double optimizedNewtonRaphson(int n) {
		    // ---------------------------------------------------------
		    // Newton-Raphson Method: Fast Iterative Approach
		    // ---------------------------------------------------------
		    // Formula:
		    //     x_(k+1) = 0.5 * (x_k + n / x_k)
		    //
		    // Idea:
		    // - Start with a rough guess (here we take x = n).
		    // - Iteratively improve the guess using the formula above.
		    // - Converges very fast (quadratic convergence).
		    // - Stops once the difference between consecutive guesses
		    //   is less than a small threshold (epsilon).
		    //
		    // Complexity:
		    // - Each iteration is O(1).
			// - Approx Time complexity is O(log log N)
		    // - Converges in very few iterations (usually < 10).
		    // - Much faster than binary search and brute force in practice.
		    //
		    // Returns:
		    // - A double approximation of the square root.
		    // - For n < 0, returns -1 (invalid).
		    // ---------------------------------------------------------
		if (n < 0) {
			return -1;             // invalid input
		}
	    if (n == 0 || n == 1) {
	    	return n;              // sqrt(0)=0, sqrt(1)=1
	    }
		double root = 0;
		double x  = n;
		while(true) {
			root = 0.5*(x+n/x);
			if(Math.abs(root-x)< 1e-6) {
				break;
			}
			x = root;
		}
		return root;
	}
	public static double optimizedBinarySearchWithPrecision(int n) {
	    // ---------------------------------------------------------
	    // Binary Search with Precision: O(log n + p*10)
	    // ---------------------------------------------------------
	    // Idea:
	    // - First, use binary search to find the integer part of sqrt(n).
	    // - Then, refine the result by checking decimals one digit at a time.
	    //   Example: increment answer by 0.1, 0.01, 0.001 … up to p digits.
	    //
	    // Complexity:
	    // - Binary search takes O(log n).
	    // - Precision loop takes O(p*10), where p = number of decimal places.
	    // - For small constant p (like 3), overall ~ O(log n).
	    //
	    // Advantages:
	    // - Provides control over precision (p).
	    // - Easy to implement and understand.
	    //
	    // Returns:
	    // - Approximation of sqrt(n) up to p decimal places.
	    // - For n < 0, currently undefined (not handled here).
	    // ---------------------------------------------------------
		
		int p = 3;
		return helper(n,p);
	}
	static double helper(int n, int p) {
		int s = 1;
		int e = n;
		double ans = 0;
		
		while(e>=s) {
			int mid = s+(e-s)/2;
			if (mid*mid==n) {
				ans=mid;
			} else if (mid*mid<n){
				s = mid+1;
				ans = mid;
			} else {
				e = mid-1;
			}
		}
		double incre = 0.1;
		
		for(int i=1;i<=p;i++) {
			while((ans+incre)*(ans+incre)<=n) {
				ans+=incre;
			}
			ans-=incre;
			incre/=10;
		}
		return ans;
	}
}
