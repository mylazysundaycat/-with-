package 실습;

import java.util.Random;
import java.util.Scanner;

public class t_2_04 {
	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("키의 최댓값을 구합니다!");
		System.out.print("사람 수:");
		
		int num = sc.nextInt();
		int[] height = new int[num];
		
		for(int i=0; i<num; i++) {
			height[i]=r.nextInt(90);
			System.out.println("키:"+height[i]);
		}
		
		System.out.println("키의 최댓값은 다음과 같습니다 : "+maxOf(height));
	}
	
	static int maxOf(int[] a) {
		int max= a[0];
		for (int i=1; i<a.length; i++) {
			if(max<a[i]) {
				max= a[i];
			}
		}
		return max;
	}
}
