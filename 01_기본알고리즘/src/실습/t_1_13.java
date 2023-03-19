package 실습;

import java.util.Scanner;

public class t_1_13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=0; i<n/2; i++) {
			System.out.print("+-");
		}
		if(n%2!=0) {
			System.out.print("+");
		}	
		
	}
}
