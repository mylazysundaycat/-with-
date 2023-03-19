package 연습문제;

import java.util.Scanner;

public class Q9 {
	public static void main(String[] args) {
		int a =0;
		int b =0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("a값:");
		a = sc.nextInt();
		
		do {
			System.out.print("b값:");
			b = sc.nextInt();
			if(a>b) {
				System.out.println("b에 a보다 더 큰 값을 입력하세요!");
			}
		} while(a>b);
		
		System.out.println("말을 참 잘듣네요");
		System.out.println("b-a는"+(b-a)+"입니다.");
	}
}
