package 실습;

import java.util.Scanner;

public class t_1_17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 출력합니다.");
			System.out.print("몇 단 입니까? :");
			n = sc.nextInt();
		} while(n<=0);
		
		for(int i=n; i>0; i--) {
			System.out.println("*".repeat(n-i+1));
		}
		
		
		
		
	}
}
