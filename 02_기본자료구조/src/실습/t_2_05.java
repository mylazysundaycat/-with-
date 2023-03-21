package 실습;

import java.util.Arrays;
import java.util.Scanner;

public class t_2_05 {
	

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요소수를 입력하쇼:");
		int n = sc.nextInt();
		
		int[] x = new int[n];
		
		for(int i=0; i<n; i++) {
			x[i] = sc.nextInt();
		}
		
		System.out.println("배열을 역순으로 정리해보겠습니다.");
		
		reverse(x);
		
		System.out.println(Arrays.toString(x));
		
	}
	
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];  a[idx1] = a[idx2];  a[idx2] = t;
    }
    static void reverse(int[] a) {
        for (int i = 0; i < a.length / 2; i++)
            swap(a, i, a.length - i - 1);
    }
}
