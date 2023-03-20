package 연습문제;

import java.util.Scanner;

public class Q13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("N을 입력하시오:");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			System.out.print("*".repeat(n));
			System.out.println();
		}
	}
}
