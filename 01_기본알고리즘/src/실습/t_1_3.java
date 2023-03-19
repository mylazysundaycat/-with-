package 실습;

import java.util.Scanner;

public class t_1_3 {
	public static void main(String[] args) {
		
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("정수를 입력하세요:");
			int n = sc.nextInt();
			if(n>0) {
				System.out.println("n은 양수입니다.");
			} else if(n==0) {
				System.out.println("n은 0입니다.");
			} else if(n<0) {
				System.out.println("n은 음수입니다.");
			}
		}

		

	}
}
