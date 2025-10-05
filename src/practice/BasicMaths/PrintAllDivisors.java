package practice.BasicMaths;
import java.util.*;

public class PrintAllDivisors {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Give me a number, I will print all the factors of it");
		int n = sc.nextInt();
		System.out.println(bruteforce(n));
		System.out.println(optimized(n));
		sc.close();
	}
	public static ArrayList<Integer> bruteforce(int n){
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				list.add(i);
			}
		}
		return list;
	}
	public static ArrayList<Integer> optimized(int n){
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=1;i*i<=n;i++) {
			if(n%i==0) {
				list.add(i);
				if(n/i!=i) {
					list.add(n/i);
				}
			}
		}
		Collections.sort(list);
		return list;
	}
}
