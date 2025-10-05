package practice.PatternProgramming;
import java.util.*;
public class patternInputCoded {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Give me a number i will print all the patterns by using it");
		int n = scan.nextInt();
		pattern1(n);
		pattern2(n);
		pattern3(n);
		pattern4(n);
		pattern5(n);
		pattern6(n);
		pattern7(n);
		pattern8(n);
		pattern9(n);
		pattern10(n);
		pattern11(n);
		pattern12(n);
		pattern13(n);
		pattern14(n);
		pattern15(n);
		pattern16(n);
		pattern17(n);
		pattern18(n);
		pattern19(n);
		pattern20(n);
		pattern21(n);
		pattern22(n);
		pattern23(n);
		pattern24(n);
		pattern25(n);
		pattern26(n);
		scan.close();
	}
	public static void pattern1 (int n) {
		System.out.println("Pattern 1");
		System.out.println();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("__________________________________");
		System.out.println();
	}
	
	public static void pattern2 (int n) {
		System.out.println("Pattern 2");
		System.out.println();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("__________________________________");
		System.out.println();
	}
	public static void pattern3 (int n) {
		System.out.println("Pattern 3");
		System.out.println();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+ " ");
			}
			System.out.println();
		}
		System.out.println("__________________________________");
		System.out.println();
	}
	public static void pattern4 (int n) {
		System.out.println("Pattern 4");
		System.out.println();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		System.out.println("__________________________________");
		System.out.println();
	}
	public static void pattern5 (int n) {
		System.out.println("Pattern 5");
		System.out.println();
		for(int i =1;i<=n;i++) {
			for(int j=1;j<=(n-i)+1;j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		System.out.println("__________________________________");
		System.out.println();
	}
	public static void pattern6 (int n) {
		System.out.println("Pattern 6");
		System.out.println();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=(n-i)+1;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println("__________________________________");
		System.out.println();
	}
	public static void pattern7 (int n) {
		System.out.println("Pattern 7");
		System.out.println();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=(n-i)+1;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("* ");
			}
			for(int l=1;l<=(n-i)+1;l++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println("__________________________________");
		System.out.println();
	}
	public static void pattern8 (int n) {
		System.out.println("Pattern 8");
		System.out.println();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=(n-i);j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=(i+i-1);k++) {
				System.out.print("*");
			}
			for(int l=1;l<=(n-i);l++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println("__________________________________");
		System.out.println();
	}
	public static void pattern9 (int n) {
		System.out.println("Pattern 9");
		System.out.println();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=(i-1);j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=(n-i)+1;k++) {
				System.out.print("* ");
			}
			for(int l=1;l<=(i-1);l++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println("__________________________________");
		System.out.println();
	}
	public static void pattern10 (int n) {
		System.out.println("Pattern 10");
		System.out.println();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i-1;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=((2*n)-(2*i-1));k++) {
				System.out.print("*");
			}
			for(int l=1;l<=i-1;l++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println("__________________________________");
		System.out.println();
	}
	public static void pattern11 (int n) {
		System.out.println("Pattern 11");
		System.out.println();
		int star = 2*n-1;
		for(int i=1;i<=2*n;i++) {
			if(i>n) {
				for(int j=1;j<=i-n-1;j++) {
					System.out.print(" ");
				}
				for(int k=1;k<=star;k++) {
					System.out.print("*");
				}
				for(int l=1;l<=i-n;l++) {
					System.out.print(" ");
				}
				System.out.println();
				star-=2;
			} else {
				for(int j=1;j<=n-i;j++) {
					System.out.print(" ");
				}
				for(int k=1;k<=i+i-1;k++) {
					System.out.print("*");
				}
				for(int l=1;l<=n-i;l++) {
					System.out.print(" ");
				}
				System.out.println();
			}
		}
		System.out.println("__________________________________");
		System.out.println();
	}
	public static void pattern12(int n) {
		System.out.println("Pattern 12");
		System.out.println();
		for(int i=1;i<=2*n-1;i++) {
			if(i>n) {
				for(int j=1;j<=(n)-(i-n);j++) {
					System.out.print("*");
				}
				System.out.println();
			} else {
				for(int j=1;j<=i;j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		System.out.println("__________________________________");
		System.out.println();
	}
	public static void pattern13(int n) {
		System.out.println("Pattern 13");
		System.out.println();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				if(i%2!=0 && j%2!=0) {
					System.out.print(1 + " ");
				} else if (i%2!=0) {
					System.out.print(0 + " ");
				} else if (i%2==0 && j%2==0) {
					System.out.print(1 + " ");
				} else {
					System.out.print(0 + " ");
				}
			}
			System.out.println();
		}
		System.out.println("__________________________________");
		System.out.println();
	}
	public static void pattern14(int n) {
		System.out.println("Pattern 14");
		System.out.println();
		for(int i=1;i<=n-1;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" "+j+" ");
			}
			for(int k=1;k<=(2*n)-(i+i+2);k++) {
				System.out.print("   ");
			}
			for(int l=i;l>=1;l--) {
				System.out.print(" "+l+" ");
			}
			System.out.println();
		}
		System.out.println("__________________________________");
		System.out.println();
	}
	public static void pattern15(int n) {
		System.out.println("Pattern 15");
		System.out.println();
		int count = 1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print((count++) + " ");
			}
			System.out.println();
		}
		System.out.println("__________________________________");
		System.out.println();
	}
	public static void pattern16(int n) {
		System.out.println("Pattern 16");
		System.out.println();
		for(int i=1;i<=n;i++) {
			for(char j = 'A';j<='A'+i-1;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println("__________________________________");
		System.out.println();
	}
	public static void pattern17(int n) {
		System.out.println("Pattern 17");
		System.out.println();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i+1;j++) {
				System.out.print((char)(j+64) + " ");
			}
			System.out.println();
		}
		System.out.println("__________________________________");
		System.out.println();
	}
	public static void pattern18(int n) {
		System.out.println("Pattern 18");
		System.out.println();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print((char)(i+64)+" ");
			}
			System.out.println();
		}
		System.out.println("__________________________________");
		System.out.println();
	}
	public static void pattern19(int n) {
		System.out.println("Pattern 19");
		System.out.println();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i+1;j++) {
				System.out.print("  ");
			}
			
			char ch = 'A';
			for(int k=1;k<=(2*i)-1;k++) {
				System.out.print(ch+" ");
				if(k<=(2*i-1)/2) {
					ch++;
				} else {
					ch--;
				}
			}
			for(int l=1;l<=n-i+1;l++) {
				System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println("__________________________________");
		System.out.println();
	}
	public static void pattern20(int n) {
		System.out.println("Pattern 20");
		System.out.println();
		char ch = 'E';
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print((char)(ch-j+1) + " ");
			}
			System.out.println();
		}
		System.out.println("__________________________________");
		System.out.println();
	}
	public static void pattern21(int n) {
		System.out.println("Pattern 21");
		System.out.println();
		char ch = 'E';
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print((char)(ch-i+1)+" ");
			}
			System.out.println();
		}
		System.out.println("__________________________________");
		System.out.println();
	}
	public static void pattern22(int n) {
		System.out.println("Pattern 22");
		System.out.println();
		for(int i=1;i<=n;i++) {
			char ch = 'E';
			for(char j=(char)(ch-i+1);j<=ch;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println("__________________________________");
		System.out.println();
	}
	public static void pattern23(int n) {
		System.out.println("Pattern 23");
		System.out.println();
		int space = 0;
		for(int i=1;i<=2*n;i++) {
			if(i>n) {
				for(int j=1;j<=i-n;j++) {
					System.out.print("*");
				}
				for(int k=1;k<=space;k++) {
					System.out.print(" ");
				}
				for(int l=1;l<=i-n;l++) {
					System.out.print("*");
				}
				space-=2;
				System.out.println();
			} else {
				for(int j=1;j<=n-i+1;j++) {
					System.out.print("*");
				}
				for(int k=1;k<=space;k++) {
					System.out.print(" ");
				}
				for(int l=1;l<=n-i+1;l++) {
					System.out.print("*");
				}
				if(i<n) {
					space+=2;
				}
				System.out.println();
			}
		}
		System.out.println("__________________________________");
		System.out.println();
	}
	public static void pattern24(int n) {
		System.out.println("Pattern 24");
		System.out.println();
		for(int i=1;i<=(2*n-1);i++) {
			if(i>n) {
				for(int j=1;j<=2*n-i;j++) {
					System.out.print("*");
				}
				for(int k=1;k<=((i-n)+(i-n));k++) {
					System.out.print(" ");
				}
				for(int l=1;l<=2*n-i;l++) {
					System.out.print("*");
				}
				System.out.println();
			} else {
				for(int j=1;j<=i;j++) {
					System.out.print("*");
				}
				for(int k=1;k<=(2*n)-(i+i);k++) {
					System.out.print(" ");
				}
				for(int l=1;l<=i;l++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		System.out.println("__________________________________");
		System.out.println();
	}
	public static void pattern25(int n) {
		System.out.println("Pattern 25");
		System.out.println();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1 || i==n || j==1 || j==n) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("__________________________________");
		System.out.println();
	}
	public static void pattern26(int n) {
		System.out.println("Pattern 26");
		System.out.println();
		for(int i=1;i<=(2*n)-3;i++) {
			for(int j=1;j<=(2*n)-3;j++) {
				int top = i;
				int left = j;
				int right = (2*n)-2-j;
				int bottom = (2*n)-2-i;
				System.out.print(n-(Math.min(Math.min(top, bottom), Math.min(left, right)))+ " ");
			}
			System.out.println();
		}
		System.out.println("__________________________________");
		System.out.println();
	}
	
}
