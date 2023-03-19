package 실습;

import java.util.Scanner;

//1부터 n까지의 정수합 구하기
public class t_1_7 {
	public static void main(String[] args) {
		//1. 재귀함수
		PlusN pl = new PlusN();
		System.out.println(pl.start(10));
		
		//2. 책 코드
		Scanner sc = new Scanner(System.in);
		System.out.print("n을 입력해봐:");
		int n= sc.nextInt();
		int sum= 0;
		int i =0;
		while(i<=n) {
			sum+=i;
			i++;
			
			System.out.println(i);
		}
		//System.out.println("합은"+sum+"입니다.");
	}
}

class PlusN {	
	int start(int n) {
		//스택오버플로우 막아주는 조건문
		if(n==0) {
			return 0;
		}
		return n+start(n-1);
	}
}
