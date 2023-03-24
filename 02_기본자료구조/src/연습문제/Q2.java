package 연습문제;

import java.util.Arrays;

public class Q2 {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		int[] b = {10,9,8,7,6,5,4,3,2,1};
		
		copy(a,b);
		System.out.println(Arrays.toString(a));
	}
	//배열 a의 모든 요소의 합계를 구하여 반환하는 메서드
	static int sumOf(int[] a) {
		int sum =0;
		for(int i=0; i<a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
	
	static void copy(int[] a, int[] b) {
		if(a.length>=b.length) {
			for(int i=0; i<b.length; i++) {
				a[i]=b[i];
			}
		}else {
			for(int i=0; i<a.length; i++) {
				a[i]=b[i];
			}
		}
	}
	
	static void rcopy(int[] a, int[] b) {


	}
}
