package practice.PatternProgramming;

public class Pattern_Hardcoded {
	public static void main(String[] args) {
		pattern1();
		System.out.println("______________________________");
		System.out.println();
		pattern2();
		System.out.println("______________________________");
		System.out.println();
		pattern3();
		System.out.println("______________________________");
		System.out.println();
		pattern4();
		System.out.println("______________________________");
		System.out.println();
		pattern5();
		System.out.println("______________________________");
		System.out.println();
		pattern6();
		System.out.println("______________________________");
		System.out.println();
		pattern7();
		System.out.println("______________________________");
		System.out.println();
		pattern8();
		System.out.println("______________________________");
		System.out.println();
		pattern9();
		System.out.println("______________________________");
		System.out.println();
		pattern10();
		System.out.println("______________________________");
		System.out.println();
		pattern11();
		System.out.println("______________________________");
		System.out.println();
		pattern12();
		System.out.println("______________________________");
		System.out.println();
		pattern13();
		System.out.println("______________________________");
		System.out.println();
		pattern14();
		System.out.println("______________________________");
		System.out.println();
		pattern15();
		System.out.println("______________________________");
		System.out.println();
		pattern16();
		System.out.println("______________________________");
		System.out.println();
		pattern17();
		System.out.println("______________________________");
		System.out.println();
		pattern18();
		System.out.println("______________________________");
		System.out.println();
		pattern19();
		System.out.println("______________________________");
		System.out.println();
		pattern20();
		System.out.println("______________________________");
		System.out.println();
		pattern21();
	}
	public static void pattern1() {
		System.out.println("Pattern 1");
		System.out.println();
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void pattern2() {
		System.out.println("Pattern 2");
		System.out.println();
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void pattern3() {
		System.out.println("Pattern 3");
		System.out.println();
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+ " ");
			}
			System.out.println();
		}
	}
	public static void pattern4() {
		System.out.println("Pattern 4");
		System.out.println();
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
	public static void pattern5() {
		System.out.println("Pattern 5");
		System.out.println();
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void pattern6() {
		System.out.println("Pattern 6");
		System.out.println();
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void pattern7() {
		System.out.println("Pattern 7");
		System.out.println();
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=(i+i)-1;k++) {
				System.out.print("*");
			}
			for(int l=1;l<=5-i;l++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	public static void pattern8() {
		System.out.println("Pattern 8");
		System.out.println();
		for(int i=5;i>=1;i--) {
			for(int j=5-i;j>=1;j--) {
				System.out.print(" ");
			}
			for(int k=(i+i)-1;k>=1;k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void pattern9() {
		System.out.println("Pattern 9");
		System.out.println();
		int c = 0;
		for(int i=1;i<=9;i++) {
			if(i>5) {
				c+=4;
				for(int j=1;j<=(((i+i)-1)-c);j++) {
					System.out.print("*");
				}
			} 
			else {
				for(int j=1;j<=((i+i)-1);j++) {
					System.out.print("*");
				}
			}
			
			System.out.println();
		}
	}
	public static void pattern10() {
		System.out.println("Pattern 10");
		System.out.println();
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				if(i%2==0) {
					if(j%2==0) {
						System.out.print(1);
					} else {
						System.out.print(0);
					}
				} else {
					if(j%2!=0) {
						System.out.print(1);
					} else {
						System.out.print(0);
					}
				}
			}
			System.out.println();
		}
	}
	public static void pattern11() {
		System.out.println("Pattern 11");
		System.out.println();
		int count = 6;
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" "+j+" ");
			}
			for(int k=1;k<=count;k++) {
				System.out.print("   ");
			}
			count-=2;
			for(int l=i;l>=1;l--) {
				System.out.print(" "+l+" ");
			}
			System.out.println();
		}
	}
	public static void pattern12() {
		System.out.println("Pattern 12");
		System.out.println();
		int count = 1;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(count++ + " ");
			}
			System.out.println();
		}
	}
	public static void pattern13() {
		System.out.println("Pattern 13");
		System.out.println();
		for(int i = 1;i<=5;i++) {
			for(int j = 1;j<=i;j++) {
				System.out.print((char)(j+64)+ " ");
			}
			System.out.println();
		}
	}
	public static void pattern14() {
		System.out.println("Pattern 14");
		System.out.println();
		for(int i=5;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print((char)(j+64)+" ");
			}
			System.out.println();
		}
	}
	public static void pattern15() {
		System.out.println("Pattern 15");
		System.out.println();
		for(int i=1; i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print((char)(i+64)+" ");
			}
			System.out.println();
		}
	}
	public static void pattern16() {
		System.out.println("Pattern 16");
		System.out.println();
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5-i;j++) {
				System.out.print(" ");
			}
			char ch = 'A';
			for(int k=1;k<=(i+i)-1;k++) {
				if(k<=((i+i)-1)/2) {
					System.out.print(ch++);
				} else {
					System.out.print(ch--);
				}
			}
			for(int l=1;l<=5-i;l++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		
	}
	public static void pattern17() {
		System.out.println("Pattern 17");
		System.out.println();
		for(int i=1;i<=5;i++) {
			for(char j = (char)('E'- (i-1));j<='E';j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	public static void pattern18() {
		System.out.println("Pattern 18");
		System.out.println();
		int space = 0;
		int space2 = (2*5)-2;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=(5-i+1);j++) {
				System.out.print("*");
			}
			for(int k=1;k<=space;k++) {
				System.out.print(" ");
			}
			for(int l=1;l<=(5-i+1);l++) {
				System.out.print("*");
			}
			System.out.println();
			space+=2;
		}
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			for(int k=1;k<=space2;k++) {
				System.out.print(" ");
			}
			for(int l=1;l<=i;l++) {
				System.out.print("*");
			}
			System.out.println();
			space2-=2;
		}
	}
	public static void pattern19() {
		System.out.println("Pattern 19");
		System.out.println();
		int space = 8;
		int spaces = 2;
		for(int i=1;i<=9;i++) {
			if(i>5) {
				space+=2;
				for(int j=1;j<=i-spaces;j++) {
					System.out.print("*");
				}
				for(int k=1;k<=spaces;k++) {
					System.out.print(" ");
				}
				for(int l=1;l<=i-spaces;l++) {
					System.out.print("*");
				}
				System.out.println();
				spaces+=2;
			} else {
				for(int j=1;j<=i;j++) {
					System.out.print("*");
				}
				for(int k=1;k<=space;k++) {
					System.out.print(" ");
				}
				for(int l=1;l<=i;l++) {
					System.out.print("*");
				}
				System.out.println();
				space-=2;
			}
			
		}
	}
	public static void pattern20() {
		System.out.println("Pattern 20");
		System.out.println();
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
				if(i==1 || i==4||j==1||j==4) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
	}
	public static void pattern21() {
		System.out.println("Pattern 21");
		System.out.println();
		for(int i =1;i<=(5*2)-2;i++) {
			for(int j=1;j<=(5*2)-2;j++) {
				int top = i;
				int left = j;
				int right = ((2*5)-1)-j;
				int bottom = ((2*5)-1)-i;
				System.out.print(5-Math.min(Math.min(top, bottom), Math.min(left, right)));
			}
			System.out.println();
		}
	}
	
	
}
