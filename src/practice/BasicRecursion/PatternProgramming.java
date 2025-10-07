package practice.BasicRecursion;

public class PatternProgramming {
	public static void main(String[] args) {
		System.out.println("Pattern 1");
		pattern1(5,1,1);
		System.out.println("===========================");
		System.out.println("Pattern 2");
		pattern2(5,1,1);
		System.out.println("===========================");
		System.out.println("Pattern 3");
		pattern3(5,1,1,1);
		System.out.println("===========================");
		System.out.println("Pattern 4");
		pattern4(5,1,1);
		System.out.println("===========================");
		System.out.println("Pattern 5");
		pattern5(5,1,1);
		System.out.println("===========================");
		System.out.println("Pattern 6");
		pattern6(5,1,1);
		System.out.println();
		System.out.println("===========================");
		System.out.println("Pattern 7");
		pattern7(5,1,1);
		System.out.println("===========================");
		System.out.println("Pattern 8");
		pattern8(5,1,1);
		System.out.println("===========================");
		System.out.println("Pattern 9");
		pattern9(5,1,1,0);
		System.out.println("===========================");
		System.out.println("Pattern 10");
		pattern10(5,1,1,0);
		System.out.println("===========================");
		System.out.println("Pattern 11");
		pattern11(5,1,1,0);
		System.out.println();
		System.out.println("===========================");
		System.out.println("Pattern 12");
		pattern12(5,1,1,0);
		System.out.println("===========================");
		System.out.println("Pattern 13");
		pattern13(5,1,1);
		System.out.println("===========================");
		System.out.println("Pattern 14");
		pattern14(5,1,1,1);
		System.out.println("===========================");
		System.out.println("Pattern 15");
		pattern15(5,1,1,1);
		System.out.println("===========================");
		System.out.println("Pattern 16");
		pattern16(5,1,1,1);
		System.out.println("===========================");
		System.out.println("Pattern 17");
		pattern17(5,1,1,1);
		System.out.println("===========================");
		System.out.println("Pattern 18");
		pattern18(5,1,1,1);
		System.out.println("===========================");
		System.out.println("Pattern 19");
		pattern19(5,1,1,1);
		System.out.println("===========================");
		System.out.println("Pattern 20");
		pattern20(5,1,1,1);
		System.out.println("===========================");
		System.out.println("Pattern 21");
		pattern21(5,1,1,1);
		
		
	}
	public static void pattern1(int n, int i, int j) {
		if(i>n) {
			return;
		}
		if(i<j) {
			System.out.println();
			pattern1(n,i+1,1);
			
		} else {
			System.out.print("* ");
			pattern1(n,i,j+1);
		}
	}
	
	public static void pattern2(int n, int i, int j) {
		if(i>n) {
			return;
		}
		if(j<=n-i+1) {
			System.out.print("* ");
			pattern2(n,i,j+1);
			
		} else {
			System.out.println();
			pattern2(n,i+1,1);
		}
	}
	
	public static void pattern3(int n, int i, int j, int k) {
		if(i>n) {
			return;
		}
		if(j<n-i+1) {
			System.out.print(" ");
			pattern3(n,i,j+1,k);
		} else if (i<k) {
			System.out.println();
			pattern3(n,i+1,1,1);
		} else {
			System.out.print("* ");
			pattern3(n,i,j,k+1);
		}
	}
	public static void pattern4(int n, int i, int j) {
		if(i>n) {
			return;
		}
		if(i<j) {
			System.out.println();
			pattern4(n,i+1,1);
		} else {
			System.out.print(j + " ");
			pattern4(n,i,j+1);
		}
	}
	public static void pattern5(int n, int i, int j) {
		if(i>n) {
			return;
		}
		if(i<j) {
			System.out.println();
			pattern5(n,i+1,1);
		} else {
			System.out.print(i+ " ");
			pattern5(n,i,j+1);
		}
	}
	public static void pattern6(int n, int i, int j) {
		if(i>n) {
			return;
		} 
		if(i<j) {
			pattern6(n,i+1,1);
			System.out.println();
		} else {
			pattern6(n,i,j+1);
			System.out.print(j + " ");
		}
	}
	public static void pattern7(int n, int i, int j) {
		if(i>n) {
			return;
		}
		if(j<=n-i+1) {
			System.out.print(j+ " ");
			pattern7(n,i,j+1);
			
		} else {
			System.out.println();
			pattern7(n,i+1,1);
		}
	}
	public static void pattern8(int n, int i, int j) {
		if(i>n) {
			return;
		}
		if(j<=n-i+1) {
			System.out.print(i+" ");
			pattern8(n, i, j+1);
		} else {
			System.out.println();
			pattern8(n,i+1,1);
		}
	}
	public static void pattern9(int n,int i ,int j,int count) {
		if(i>n) {
			return;
		} if(j>i) {
			System.out.println();
			pattern9(n,i+1,1,count);
		} else {
			System.out.print(++count + " ");
			pattern9(n,i,j+1,count);
		}
	}
	public static void pattern10(int n, int i, int j, int count) {
		if(i>n) {
			return;
		}
		if(j<=n-i+1) {
			System.out.print(++count + " ");
			pattern10(n,i,j+1,count);
		} else {
			System.out.println();
			pattern10(n,i+1,1,count);
		}
	}
	public static void pattern11(int n, int i, int j, int count) {
		if(i>n) {
			return;
		}
		if(j>i) {
			pattern11(n,i+1,1,count);
			System.out.println();
		} else {
			pattern11(n,i,j+1,++count);
			System.out.print(count+ " ");
		}
	}
	public static void pattern12(int n, int i, int j, int count) {
		if(i>n) {
			return;
		}
		if(j<=n-i+1) {
			pattern12(n,i,j+1,++count);
			System.out.print(count+ " ");
		} else {
			pattern12(n,i+1,1,count);
			System.out.println();
		}
	}
	public static void pattern13(int n, int i, int j) {
		if(i<=n) {
			if(i>n) {
				return;
			}
			if(i<j) {
				System.out.println();
				pattern13(n,i+1,1);
			} else {
				System.out.print("* ");
				pattern13(n,i,j+1);
			}
		} else {
			if(i>2*n) {
				return;
			}
			if(j<=2*n-i+1) {
				System.out.print("* ");
				pattern13(n,i,j+1);
			} else {
				System.out.println();
				pattern13(n,i+1,1);
			}
		}
	}
	public static void pattern14(int n, int i, int j, int k) {
		if(i<=n) {
			if(i>n) {
				return;
			}
			if(i<j) {
				System.out.println();
				pattern14(n,i+1,1,1);
			} else if (k<=n-i+1) {
				System.out.print(" ");
				pattern14(n,i,j,k+1);
			} else {
				System.out.print("* ");
				pattern14(n,i,j+1,k);
			}
		} else {
			if(i>2*n) {
				return;
			}
			if(k<=i-n) {
				System.out.print(" ");
				pattern14(n,i,j,k+1);
			} else if(j<=2*n-i+1) {
				System.out.print("* ");
				pattern14(n,i,j+1,k);
			} else {
				System.out.println();
				pattern14(n,i+1,1,1);
			}
		}
	}
	public static void pattern15(int n, int i, int j, int k) {
		if(i<=n) {
			if(i>n) {
				return;
			} else if(k<n-i+1) {
				System.out.print(" ");
				pattern15(n,i,j,k+1);
			} else if(i<j) {
				System.out.println();
				pattern15(n,i+1,1,1);
			} else {
				System.out.print("* ");
				pattern15(n,i,j+1,k);
			}
		} else {
			if(i>=2*n) {
				return;
			} else if(k<=i-n) {
				System.out.print(" ");
				pattern15(n,i,j,k+1);
			} else if(j<=2*n-i) {
				System.out.print("* ");
				pattern15(n,i,j+1,k);
			} else {
				System.out.println();
				pattern15(n,i+1,1,1);
			}
		}
	}
	public static void pattern16(int n, int i, int j, int k) {
		if(i>n) {
			return;
		} else if(k<=n-i) {
			System.out.print(" ");
			pattern16(n,i,j,k+1);
		} else if(j<=(2*i)-1) {
			System.out.print("*");
			pattern16(n,i,j+1,k);
		} else {
			System.out.println();
			pattern16(n,i+1,1,1);
		}
	}
	public static void pattern17(int n, int i, int j, int k) {
		if(i>n) {
			return;
		} else if(k<=i-1) {
			System.out.print(" ");
			pattern17(n,i,j,k+1);
		} else if(j<=(2*n)-(2*i)+1) {
			System.out.print("*");
			pattern17(n,i,j+1,k);
		} else {
			System.out.println();
			pattern17(n,i+1,1,1);
		}
	}
	public static void pattern18(int n, int i, int j, int k) {
		if(i<=n) {
			if(k<=n-i) {
				System.out.print(" ");
				pattern18(n,i,j,k+1);
			} else if (j<=(2*i)-1) {
				System.out.print("*");
				pattern18(n,i,j+1,k);
			} else {
				System.out.println();
				pattern18(n,i+1,1,1);
			}
		} else if(i<=2*n) {
			if(k<i-n) {
				System.out.print(" ");
				pattern18(n,i,j,k+1);
			} else if(j<=(2*(2*n-i)+1)) {
				System.out.print("*");
				pattern18(n,i,j+1,k);
			} else {
				System.out.println();
				pattern18(n,i+1,1,1);
			}
		} 
	}
	public static void pattern19(int n, int i, int j, int k) {
		if(i<=n){
			if(k<=n-i) {
				System.out.print(" ");
				pattern19(n,i,j,k+1);
			} else if (j<=(2*i)-1){
				System.out.print("*");
				pattern19(n,i,j+1,k);
			} else {
				System.out.println();
				pattern19(n,i+1,1,1);
			}
		} else if (i<2*n) {
			if(k<=i-n) {
				System.out.print(" ");
				pattern19(n,i,j,k+1);
			} else if(j<=(2*(2*n-i)-1)) {
				System.out.print("*");
				pattern19(n,i,j+1,k);
			} else {
				System.out.println();
				pattern19(n,i+1,1,1);
			}
		}
	}
	public static void pattern20(int n, int i, int j, int k) {
		if(i>n) {
			return;
		} else if (k<=n-i) {
			System.out.print(" ");
			pattern20(n,i,j,k+1);
		} else if(j>(2*i)-1) {
			System.out.println();
			pattern20(n,i+1,1,1);
		} else {
			if(i==1 || i==n) {
				System.out.print("*");
				pattern20(n,i,j+1,k);
			} else if ((j!=1) && (j!=(2*i)-1)) {
				System.out.print(" ");
				pattern20(n,i,j+1,k);
			} else {
				System.out.print("*");
				pattern20(n,i,j+1,k);
			}
		}
	}
	public static void pattern21(int n, int i, int j, int k) {
		if(i<=n) {
			if(k<=n-i) {
				System.out.print(" ");
				pattern21(n,i,j,k+1);
			} else if (j>(2*i)-1) {
				System.out.println();
				pattern21(n,i+1,1,1);
			} else {
				if(j!=1 && (j!=(2*i)-1)) {
					System.out.print(" ");
					pattern21(n,i,j+1,k);
				} else {
					System.out.print("*");
					pattern21(n,i,j+1,k);
				}
			}
		} else if (i<2*n) {
			if(k<=i-n) {
				System.out.print(" ");
				pattern21(n,i,j,k+1);
			} else if (j>2*(2*n-i)-1) {
				System.out.println();
				pattern21(n,i+1,1,1);
			} else {
				if(j!=1 && j!=(2*(2*n-i)-1)){
					System.out.print(" ");
					pattern21(n,i,j+1,k);
				} else {
					System.out.print("*");
					pattern21(n,i,j+1,k);
				}
			}
		}
	}
}
